package com.whocraft.whocosmetics.client.models;

import com.whocraft.whocosmetics.util.ClientUtil;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;

/* Extend this class, and then do things as normal, but in the contructor
* of your model class, set all four of the below arms, this class will set them correctly
* Note: You MUST extend this class in the model!*/
public class BipedArmSupport extends BipedModel {

    RendererModel leftArmSteve, rightArmSteve, leftAlexArm, rightAlexArm;

    @Override
    public void render(LivingEntity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
        if(p_78088_1_ instanceof AbstractClientPlayerEntity){
            AbstractClientPlayerEntity playerEntity = (AbstractClientPlayerEntity) p_78088_1_;
            bipedLeftArm = getModelForSkinType(!ClientUtil.isSteve(playerEntity), HandSide.LEFT);
            bipedRightArm = getModelForSkinType(!ClientUtil.isSteve(playerEntity), HandSide.RIGHT);
        }
        super.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
    }

    public RendererModel getModelForSkinType(boolean isAlex, HandSide handSide) {
        if(isAlex){
            return handSide == HandSide.LEFT ? leftAlexArm : rightAlexArm;
        } else {
            return handSide == HandSide.LEFT ? leftArmSteve : rightArmSteve;
        }
    }
}
