
package mc.craig.software.cosmetics.common.blocks;

import mc.craig.software.cosmetics.common.blockentity.ClassicDoorsBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class ClassicDoorsBlock extends Block implements EntityBlock {

    public static BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public ClassicDoorsBlock(Properties properties) {
        super(properties.noOcclusion());
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    public boolean isOpen(BlockState state) {
        return state.getValue(OPEN);
    }

    public void setOpen(@Nullable Entity entity, Level level, BlockState state, BlockPos pos, boolean open) {
        if (state.is(this) && state.getValue(OPEN) != open) {
            level.setBlock(pos, state.setValue(OPEN, open), 10);
            level.gameEvent(entity, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
        }
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(level, pos, state, player);
        BlockPos upperPos = pos.above();
        if(level.getBlockState(upperPos).getBlock() instanceof BarrierBlock){
            level.removeBlock(upperPos, false);
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (this.material == Material.METAL) {
            return InteractionResult.PASS;
        } else {
            state = state.cycle(OPEN);
            level.setBlock(pos, state, 10);
            level.gameEvent(player, this.isOpen(state) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
            boolean open = isOpen(state);

            if(open && level.getBlockState(pos.above()).getBlock() == Blocks.BARRIER){
                level.removeBlock(pos.above(), false);
            }

            if(!open && level.getBlockState(pos.above()).getBlock() == Blocks.AIR){
                level.setBlock(pos.above(), Blocks.BARRIER.defaultBlockState(), Block.UPDATE_ALL);
            }


            if (level.getBlockEntity(pos) instanceof ClassicDoorsBlockEntity classicDoorsBlockEntity) {

                if (open && !classicDoorsBlockEntity.ANIM_OPEN.isStarted()) {
                    classicDoorsBlockEntity.ANIM_OPEN.start(player.tickCount);
                    classicDoorsBlockEntity.ANIM_CLOSE.stop();
                }

                if (!open && !classicDoorsBlockEntity.ANIM_CLOSE.isStarted()) {
                    classicDoorsBlockEntity.ANIM_CLOSE.start(player.tickCount);
                    classicDoorsBlockEntity.ANIM_OPEN.stop();
                }
            }

            return InteractionResult.sidedSuccess(level.isClientSide);
        }
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockPos = context.getClickedPos();
        Level level = context.getLevel();
        if (blockPos.getY() < level.getMaxBuildHeight() - 1 && level.getBlockState(blockPos.above()).canBeReplaced(context)) {
            boolean bl = level.hasNeighborSignal(blockPos) || level.hasNeighborSignal(blockPos.above());
            return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection()).setValue(OPEN, bl);
        } else {
            return null;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN);
    }

    @Override
    public void destroy(LevelAccessor level, BlockPos pos, BlockState state) {
        super.destroy(level, pos, state);
    }

    @Override
    public ClassicDoorsBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ClassicDoorsBlockEntity(pos, state);
    }
}

