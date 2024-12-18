package dev.jeryn.doctorwho.compat;


import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import whocraft.tardis_refined.common.capability.TardisLevelOperator;


import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import whocraft.tardis_refined.common.network.messages.screens.OpenMonitorMessage;

public class TardisRefinedCompat {

    public static void openMonitor(ServerPlayer serverPlayer, ServerLevel serverLevel) {
        TardisLevelOperator.get(serverLevel).ifPresent(operator -> {
            new OpenMonitorMessage(operator.getInteriorManager().isWaitingToGenerate(), operator.getPilotingManager().getCurrentLocation(), operator.getPilotingManager().getTargetLocation(), operator.getUpgradeHandler()).send(serverPlayer);
        });
    }

}
