package dev.jeryn.doctorwho.mixin;

import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MultiPlayerGameMode.class)
public class MultiPlayerGameModeMixin {

    @Inject(method = "attack", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/MultiPlayerGameMode;ensureHasSentCarriedItem()V"))
    private void attack(Player player, Entity targetEntity, CallbackInfo ci) {
   /*     if(!player.level.isClientSide()) {
            for (InteractionHand interactionHand : InteractionHand.values()) {
                if (player.getItemInHand(interactionHand).getItem() instanceof UmbrellaItem) {
                    ItemStack stack = player.getItemInHand(interactionHand);
                    UmbrellaItem.setOpen(stack, UmbrellaItem.getIsOpen(stack));
                }
            }
        }*/
    }

}
