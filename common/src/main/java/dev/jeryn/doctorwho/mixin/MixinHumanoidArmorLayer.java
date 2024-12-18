package dev.jeryn.doctorwho.mixin;

import dev.jeryn.doctorwho.common.entity.DavrosChair;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = HumanoidModel.class)
public abstract class MixinHumanoidArmorLayer {

    @Inject(at = @At("TAIL"), cancellable = true, method = "setupAnim(Lnet/minecraft/world/entity/LivingEntity;FFFFF)V")
    private void setupAnimPre(LivingEntity livingEntity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, CallbackInfo callbackInfo) {
        if (livingEntity.getVehicle() instanceof DavrosChair davrosChair) {
            HumanoidModel model = (HumanoidModel) (Object) this;
            model.leftLeg.visible = model.rightLeg.visible = false;
        }
    }

}
