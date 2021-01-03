package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.whocraft.whocosmetics.util.ClientUtil;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;

/* Extend this class, and then do things as normal, but in the contructor
* of your model class, set all four of the below arms, this class will set them correctly
* Note: You MUST extend this class in the model!*/
public class BipedArmSupport extends BipedModel<LivingEntity> {

    ModelRenderer leftArmSteve, rightArmSteve, leftAlexArm, rightAlexArm;

    public BipedArmSupport(float modelSize) {
        super(modelSize);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void render(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        if(entity instanceof AbstractClientPlayerEntity){
            AbstractClientPlayerEntity playerEntity = (AbstractClientPlayerEntity) entity;
            bipedLeftArm = getModelForSkinType(!ClientUtil.isSteve(playerEntity), HandSide.LEFT);
            bipedRightArm = getModelForSkinType(!ClientUtil.isSteve(playerEntity), HandSide.RIGHT);
        }
        super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }

    public ModelRenderer getModelForSkinType(boolean isAlex, HandSide handSide) {
        if(isAlex){
            return handSide == HandSide.LEFT ? leftAlexArm : rightAlexArm;
        } else {
            return handSide == HandSide.LEFT ? leftArmSteve : rightArmSteve;
        }
    }
}
