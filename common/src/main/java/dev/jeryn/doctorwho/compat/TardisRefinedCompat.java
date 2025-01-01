package dev.jeryn.doctorwho.compat;


import dev.jeryn.doctorwho.common.SonicHandler;
import dev.jeryn.doctorwho.common.WCSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import whocraft.tardis_refined.common.capability.tardis.TardisLevelOperator;
import whocraft.tardis_refined.common.items.ScrewdriverItem;
import whocraft.tardis_refined.common.items.ScrewdriverMode;
import whocraft.tardis_refined.common.network.messages.screens.S2COpenMonitor;

public class TardisRefinedCompat {

    public static void openMonitor(ServerPlayer serverPlayer, ServerLevel serverLevel) {
        TardisLevelOperator.get(serverLevel).ifPresent(operator -> {
            new S2COpenMonitor(operator.getInteriorManager().isWaitingToGenerate(), operator.getPilotingManager().getCurrentLocation(), operator.getPilotingManager().getTargetLocation(), operator.getUpgradeHandler(), operator.getAestheticHandler().getShellTheme()).send(serverPlayer);
        });
    }


    public static InteractionResult doSonicInteraction(UseOnContext context) {
        if (context.getItemInHand().getItem() instanceof ScrewdriverItem screwdriverItem) {
            if (!context.getPlayer().isCrouching() && screwdriverItem.isScrewdriverMode(context.getItemInHand(), ScrewdriverMode.ENABLED)) {

                BlockPos blockPos = context.getClickedPos();
                Level level = context.getLevel();
                Player player = context.getPlayer();

                InteractionResult sonicResult = SonicHandler.onSonic(player, level, blockPos);
                if (sonicResult == InteractionResult.SUCCESS) {
                    player.swing(context.getHand());
                    player.playSound(WCSounds.SONIC.get());
                    level.gameEvent(player, GameEvent.ITEM_INTERACT_FINISH, blockPos);
                    ParticleUtils.spawnParticlesOnBlockFaces(level, blockPos, ParticleTypes.WAX_OFF, UniformInt.of(3, 5));
                    player.getCooldowns().addCooldown(screwdriverItem, 100);
                    return sonicResult;
                }
            }
        }
        return InteractionResult.CONSUME;
    }

    public static ScrewdriverItem getSonicItem() {
        return new ScrewdriverItem(new Item.Properties().stacksTo(1));
    }

}
