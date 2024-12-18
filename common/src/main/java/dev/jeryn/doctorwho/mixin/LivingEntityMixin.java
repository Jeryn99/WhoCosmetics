package dev.jeryn.doctorwho.mixin;

import dev.jeryn.doctorwho.common.items.JSONClothingItem;
import dev.jeryn.doctorwho.common.items.UmbrellaItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(at = @At("HEAD"), method = "getEquipmentSlotForItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private static void getEquipmentSlotForItem(ItemStack item, CallbackInfoReturnable<EquipmentSlot> cir) {
        if(item.getItem() instanceof JSONClothingItem jsonClothingItem){
            cir.setReturnValue(jsonClothingItem.getSlot());
        }
    }


    @Inject(at = @At("HEAD"), method = "swing(Lnet/minecraft/world/InteractionHand;Z)V", cancellable = true)
    private void swing(InteractionHand hand, boolean updateSelf, CallbackInfo ci) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;

        for (InteractionHand interactionHand : InteractionHand.values()) {
            if (livingEntity.getItemInHand(interactionHand).getItem() instanceof UmbrellaItem) {
                ItemStack stack = livingEntity.getItemInHand(interactionHand);
                UmbrellaItem.setOpen(stack, UmbrellaItem.getIsOpen(stack));
                return;
            }
        }
    }


}
