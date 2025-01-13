package dev.jeryn.doctorwho.common.blocks;

import dev.jeryn.doctorwho.Platform;
import dev.jeryn.doctorwho.compat.TardisRefinedCompat;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MonitorBlockPillar extends RotatedPillarBlock {

    public MonitorBlockPillar(Properties properties) {
        super(properties);
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
}
