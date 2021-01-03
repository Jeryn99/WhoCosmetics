package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.whocraft.whocosmetics.util.ClientUtil;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;

/* Extend this class, and then do things as normal, but in the contructor
 * of your model class, set all four of the below arms, this class will set them correctly
 * Note: You MUST extend this class in the model!*/
public class BipedArmSupport extends BipedModel<LivingEntity> implements IClothingModel {

    ModelRenderer leftArmSteve, rightArmSteve, leftAlexArm, rightAlexArm;
    private LivingEntity living;

    public BipedArmSupport(float modelSize) {
        super(modelSize);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        if (living instanceof AbstractClientPlayerEntity) {
            AbstractClientPlayerEntity playerEntity = (AbstractClientPlayerEntity) living;
            bipedLeftArm = getModelForSkinType(!ClientUtil.isSteve(playerEntity), HandSide.LEFT);
            bipedRightArm = getModelForSkinType(!ClientUtil.isSteve(playerEntity), HandSide.RIGHT);
        }
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    public ModelRenderer getModelForSkinType(boolean isAlex, HandSide handSide) {
        if (isAlex) {
            return handSide == HandSide.LEFT ? leftAlexArm : rightAlexArm;
        } else {
            return handSide == HandSide.LEFT ? leftArmSteve : rightArmSteve;
        }
    }

    @Override
    public void setLiving(LivingEntity livingEntity) {
        this.living = livingEntity;
    }
}
