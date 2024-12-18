
package dev.jeryn.doctorwho.common.blocks;

import dev.jeryn.doctorwho.common.blockentity.ClassicDoorsBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class ClassicDoorsBlock extends Block implements EntityBlock {

    public static BooleanProperty OPEN = BlockStateProperties.OPEN;
    public static DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 32.0D, 0.25D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 15.75D, 16.0D, 32.0D, 16.0D);
    protected static final VoxelShape EAST_AABB= Block.box(15.75D, 0.0D, 0.0D, 16.0D, 32.0D, 16.0D);
    protected static final VoxelShape WEST_AABB = Block.box(0.0D, 0.0D, 0.0D, 0.25D, 32.0D, 16.0D);
    protected static final VoxelShape EMPTY_AABB = Block.box(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);

    public ClassicDoorsBlock(Properties properties) {
        super(properties.noOcclusion());
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return switch (blockState.getValue(FACING)) {
            case EAST -> EAST_AABB;
            case WEST -> WEST_AABB;
            case NORTH -> NORTH_AABB;
            default -> SOUTH_AABB;
        };
    }

    @Override
    public boolean isCollisionShapeFullBlock(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return super.isCollisionShapeFullBlock(blockState, blockGetter, blockPos);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {

        if(isOpen(blockState)){
            return EMPTY_AABB;
        }

        return this.getShape(blockState, blockGetter, blockPos, collisionContext);
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
            level.setBlock(pos, state.setValue(OPEN, open), Block.UPDATE_ALL_IMMEDIATE);
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
            state = state.cycle(OPEN);
            level.setBlock(pos, state, Block.UPDATE_ALL_IMMEDIATE);
            level.gameEvent(player, this.isOpen(state) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
            boolean open = isOpen(state);

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
        boolean open = isOpen(state);

        ClassicDoorsBlockEntity classicDoorsBlockEntity = new ClassicDoorsBlockEntity(pos, state);

        if (open && !classicDoorsBlockEntity.ANIM_OPEN.isStarted()) {
            classicDoorsBlockEntity.ANIM_OPEN.start(12);
            classicDoorsBlockEntity.ANIM_CLOSE.stop();
        }

        if (!open && !classicDoorsBlockEntity.ANIM_CLOSE.isStarted()) {
            classicDoorsBlockEntity.ANIM_CLOSE.start(12);
            classicDoorsBlockEntity.ANIM_OPEN.stop();
        }

        return new ClassicDoorsBlockEntity(pos, state);
    }

}

