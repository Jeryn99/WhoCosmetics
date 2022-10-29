package mc.craig.software.cosmetics.forge.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mc.craig.software.cosmetics.client.ArmorModelManager;
import mc.craig.software.cosmetics.common.items.ClothingItem;
import mc.craig.software.cosmetics.common.items.ICustomArmorTexture;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;

@Mixin(HumanoidArmorLayer.class)
public abstract class HumanoidArmorLayerMixin<T extends LivingEntity, M extends HumanoidModel<T>, A extends HumanoidModel<T>> extends RenderLayer<T, M> {

    public HumanoidArmorLayerMixin(RenderLayerParent<T, M> renderLayerParent) {
        super(renderLayerParent);
    }

    @Shadow
    protected abstract void setPartVisibility(A model, EquipmentSlot slot);

    @Shadow protected abstract boolean usesInnerModel(EquipmentSlot slot);

    @Inject(at = @At("HEAD"), method = "getArmorResource", cancellable = true, remap = false)
    private void getArmorResource(Entity entity, ItemStack stack, EquipmentSlot slot, @Nullable String type, CallbackInfoReturnable<ResourceLocation> callbackInfoReturnable) {
        if (stack.getItem() instanceof ICustomArmorTexture customArmorTexture) {
            callbackInfoReturnable.setReturnValue(customArmorTexture.getArmorTexture(stack, entity, slot, type));
        }
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Inject(at = @At("HEAD"), method = "getArmorModelHook", cancellable = true, remap = false)
    private void getArmorModelHook(LivingEntity entity, ItemStack itemStack, EquipmentSlot slot, HumanoidModel<?> model, CallbackInfoReturnable<Model> ci) {
        HumanoidModel m = ArmorModelManager.getArmorModel(itemStack, entity, slot);

        if(m == null) return;

        if (model != null) {
            model.copyPropertiesTo(m);
            this.setPartVisibility((A) m, slot);
            ci.setReturnValue(m);
        }
    }

    @SuppressWarnings("unchecked")
    @Inject(at = @At("HEAD"), method = "renderArmorPiece", cancellable = true)
    private void renderArmorPiece(PoseStack poseStack, MultiBufferSource multiBufferSource, T livingEntity, EquipmentSlot equipmentSlot, int i, A humanoidModel, CallbackInfo callbackInfo) {
        ItemStack itemStack = livingEntity.getItemBySlot(equipmentSlot);
        if (itemStack.getItem() instanceof ICustomArmorTexture) {
            ArmorItem armorItem = (ArmorItem) itemStack.getItem();

            HumanoidModel<?> model = ArmorModelManager.getArmorModel(itemStack, livingEntity, equipmentSlot);

            if (model != null) {
                humanoidModel = (A) model;
            }

            if (armorItem.getSlot() == equipmentSlot) {
                this.getParentModel().copyPropertiesTo(humanoidModel);
                this.setPartVisibility(humanoidModel, equipmentSlot);
                boolean bl = this.usesInnerModel(equipmentSlot);
                boolean bl2 = itemStack.hasFoil();
                if (armorItem instanceof ClothingItem clothingItem && clothingItem.isColored()) {
                    int j = clothingItem.getColor(itemStack);
                    float f = (float) (j >> 16 & 255) / 255.0F;
                    float g = (float) (j >> 8 & 255) / 255.0F;
                    float h = (float) (j & 255) / 255.0F;
                    RenderSystem.setShaderFogColor(f, g, h);
                    this.renderModel(poseStack, multiBufferSource, i, livingEntity, itemStack, equipmentSlot, bl2, humanoidModel, bl, f, g, h, null);
                } else {
                    this.renderModel(poseStack, multiBufferSource, i, livingEntity, itemStack, equipmentSlot, bl2, humanoidModel, bl, 1.0F, 1.0F, 1.0F, null);
                }

            }
            callbackInfo.cancel();
        }
    }

    private void renderModel(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, T livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, boolean bl, A humanoidModel, boolean bl2, float f, float g, float h, @org.jetbrains.annotations.Nullable String string) {
        ResourceLocation texture = ((ICustomArmorTexture) itemStack.getItem()).getArmorTexture(itemStack, livingEntity, equipmentSlot, string);
        VertexConsumer vertexConsumer = ItemRenderer.getArmorFoilBuffer(multiBufferSource, RenderType.armorCutoutNoCull(texture), false, bl);
        humanoidModel.renderToBuffer(poseStack, vertexConsumer, i, OverlayTexture.NO_OVERLAY, f, g, h, 1.0F);
    }
}