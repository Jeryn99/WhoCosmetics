package dev.jeryn.doctorwho.mixin;

import dev.jeryn.doctorwho.compat.TardisRefinedCompat;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import whocraft.tardis_refined.common.items.ScrewdriverItem;
import whocraft.tardis_refined.common.items.ScrewdriverMode;

@Mixin(value = ScrewdriverItem.class, remap = false)
public abstract class ScrewdriverItemMixin {

    @Shadow
    public abstract boolean isScrewdriverMode(ItemStack stack, ScrewdriverMode mode);

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true, remap = false)
    public void useOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> cir) {
        if (isScrewdriverMode(context.getItemInHand(), ScrewdriverMode.ENABLED) && !context.getPlayer().isCrouching()) {
            cir.setReturnValue(TardisRefinedCompat.doSonicInteraction(context));
        }
    }

}
