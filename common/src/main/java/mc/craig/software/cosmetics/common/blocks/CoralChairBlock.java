package mc.craig.software.cosmetics.common.blocks;

import mc.craig.software.cosmetics.common.blockentity.CoralChairBlockEntity;
import mc.craig.software.cosmetics.common.entity.Chair;
import mc.craig.software.cosmetics.common.entity.Entities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CoralChairBlock extends Block implements EntityBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;



    public CoralChairBlock(Properties properties) {
        super(properties.noOcclusion());
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState p_60550_) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }


    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {

        if(hand == InteractionHand.MAIN_HAND){
            if(level.getBlockEntity(pos) instanceof CoralChairBlockEntity blockChair){
                Chair chair = null;
                if (blockChair.getChairEntity() == null || !blockChair.chairEntity.isAlive()) {
                    chair = new Chair(Entities.CHAIR.get(), level);
                    chair.moveTo(pos, state.getValue(FACING).toYRot(), player.xRotO);
                    blockChair.setChairEntity(chair);
                    level.addFreshEntity(chair);
                } else {
                    chair = blockChair.getChairEntity();
                }

                if (!chair.hasPassenger(player)) {
                    player.startRiding(chair);
                }

            }
        }
        return super.use(state, level, pos, player, hand, hit);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CoralChairBlockEntity(pos, state);
    }
}
