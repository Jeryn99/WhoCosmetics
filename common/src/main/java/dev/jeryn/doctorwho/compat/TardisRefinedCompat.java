package dev.jeryn.doctorwho.compat;


import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import whocraft.tardis_refined.common.capability.tardis.TardisLevelOperator;
import whocraft.tardis_refined.common.network.messages.screens.S2COpenMonitor;

public class TardisRefinedCompat {

    public static void openMonitor(ServerPlayer serverPlayer, ServerLevel serverLevel) {
        TardisLevelOperator.get(serverLevel).ifPresent(operator -> {
            new S2COpenMonitor(operator.getInteriorManager().isWaitingToGenerate(), operator.getPilotingManager().getCurrentLocation(), operator.getPilotingManager().getTargetLocation(), operator.getUpgradeHandler(), operator.getAestheticHandler().getShellTheme()).send(serverPlayer);
        });
    }

}
