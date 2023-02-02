package mc.craig.software.cosmetics.common.blocks;

import mc.craig.software.cosmetics.Platform;
import mc.craig.software.cosmetics.compat.TardisRefinedCompat;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;

public class MonitorBlock extends HorizontalDirectionalBlock {

    public MonitorBlock(Properties properties) {
        super(properties.noOcclusion());
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {

        if (Platform.isModLoaded("tardis_refined")) {
            if (player instanceof ServerPlayer serverPlayer && level instanceof ServerLevel serverLevel) {
                TardisRefinedCompat.openMonitor(serverPlayer, serverLevel);
                return InteractionResult.SUCCESS;
            }
        }

        return super.use(state, level, pos, player, hand, hit);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getClockWise());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HorizontalDirectionalBlock.FACING);
    }
}
