package mc.craig.software.cosmetics.common.blocks;

import mc.craig.software.cosmetics.common.WCBlocks;
import mc.craig.software.cosmetics.common.blockentity.AnimatedBlockEntityBase;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FacingEntityBlock extends BaseEntityBlock {

    public static final IntegerProperty ROTATION = BlockStateProperties.ROTATION_16;
    private final TileBlock tileBlock;


    public FacingEntityBlock(Properties properties, TileBlock tileBlock) {
        super(properties.noOcclusion());
        this.tileBlock = tileBlock;
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState p_60550_) {
        if(p_60550_.getBlock() == WCBlocks.TUBE_LIGHT.get()){
            return RenderShape.MODEL;
        }

        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(ROTATION, Mth.floor((double)(context.getRotation() * 16.0F / 360.0F) + 0.5) & 15);
    }
    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(ROTATION, rotation.rotate(state.getValue(ROTATION), 16));
    }
    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.setValue(ROTATION, mirror.mirror(state.getValue(ROTATION), 16));
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(ROTATION);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        return (level1, blockPos, blockState, blockEntity) -> {
            if(blockEntity instanceof AnimatedBlockEntityBase animatedBlockEntityBase){
                animatedBlockEntityBase.tick(level1, blockPos, state, blockEntity);
            }
        };
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return tileBlock.newBlockEntity(pos, state);
    }

    public interface TileBlock {
        BlockEntity newBlockEntity(BlockPos pos, BlockState state);
    }
}
