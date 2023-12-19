package mc.craig.software.cosmetics.common.blocks;

import mc.craig.software.cosmetics.common.entity.Nitro9Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class Nitro9Block extends Block {
    public static final BooleanProperty UNSTABLE;

    private static final VoxelShape SHAPE = Stream.of(
            Block.box(4, 13, 8, 8, 17, 8),
            Block.box(6, 13, 6, 10, 15, 10),
            Block.box(4.5, 0, 4.5, 11.5, 13, 11.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    ;


    public Nitro9Block(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(UNSTABLE, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }


    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!oldState.is(state.getBlock())) {
            if (level.hasNeighborSignal(pos)) {
                explode(level, pos);
                level.removeBlock(pos, false);
            }

        }
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (level.hasNeighborSignal(pos)) {
            explode(level, pos);
            level.removeBlock(pos, false);
        }

    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide() && !player.isCreative() && state.getValue(UNSTABLE)) {
            explode(level, pos);
        }

        super.playerWillDestroy(level, pos, state, player);
    }

    @Override
    public void wasExploded(Level level, BlockPos pos, Explosion explosion) {
        if (!level.isClientSide) {
            Nitro9Entity nitro9Entity = new Nitro9Entity(level, (double) pos.getX() + 0.5, pos.getY(), (double) pos.getZ() + 0.5, explosion.getSourceMob());
            int i = nitro9Entity.getFuse();
            nitro9Entity.setFuse((short) (level.random.nextInt(i / 4) + i / 8));
            level.addFreshEntity(nitro9Entity);
        }
    }

    public static void explode(Level level, BlockPos pos) {
        explode(level, pos, null);
    }

    private static void explode(Level level, BlockPos pos, @Nullable LivingEntity entity) {
        if (!level.isClientSide) {
            Nitro9Entity nitro9Entity = new Nitro9Entity(level, (double) pos.getX() + 0.5, pos.getY(), (double) pos.getZ() + 0.5, entity);
            level.addFreshEntity(nitro9Entity);
            level.playSound(null, nitro9Entity.getX(), nitro9Entity.getY(), nitro9Entity.getZ(), SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.gameEvent(entity, GameEvent.PRIME_FUSE, pos);
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);

        explode(level, pos, player);
        level.setBlock(pos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL_IMMEDIATE);
        Item item = itemStack.getItem();
        if (!player.isCreative()) {
            if (itemStack.is(Items.FLINT_AND_STEEL)) {
                itemStack.hurtAndBreak(1, player, (playerx) -> {
                    playerx.broadcastBreakEvent(hand);
                });
            } else {
                itemStack.shrink(1);
            }
        }

        player.awardStat(Stats.ITEM_USED.get(item));
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public void onProjectileHit(Level level, BlockState state, BlockHitResult hit, Projectile projectile) {
        if (!level.isClientSide) {
            BlockPos blockPos = hit.getBlockPos();
            Entity entity = projectile.getOwner();
            if (projectile.isOnFire() && projectile.mayInteract(level, blockPos)) {
                explode(level, blockPos, entity instanceof LivingEntity ? (LivingEntity) entity : null);
                level.removeBlock(blockPos, false);
            }
        }

    }

    @Override
    public boolean dropFromExplosion(Explosion explosion) {
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(UNSTABLE);
    }

    static {
        UNSTABLE = BlockStateProperties.UNSTABLE;
    }
}
