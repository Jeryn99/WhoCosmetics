package com.whocraft.whocosmetics.client.models;

import com.whocraft.whocosmetics.util.ClientUtil;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class GenericJacketModel extends BipedModel<LivingEntity> implements EntityModel {

    private final ModelRenderer Body;
    private final ModelRenderer JacketFlow;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;

    public GenericJacketModel() {
        super(0);
        textureWidth = 64;
        textureHeight = 64;
        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.35F, false);

        JacketFlow = new ModelRenderer(this);
        JacketFlow.setRotationPoint(0.0F, 12.0F, 2.0F);
        Body.addChild(JacketFlow);
        setRotationAngle(JacketFlow, 0.0873F, 0.0F, 0.0F);
        JacketFlow.setTextureOffset(24, 0).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 6.0F, 0.0F, 0.35F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        RightArm.setTextureOffset(0, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        LeftArm.setTextureOffset(16, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        bipedLeftArm = LeftArm;
        bipedRightArm = RightArm;
        bipedBody = Body;
    }

    @Override
    public void render(LivingEntity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
        if (ClientUtil.isSteve(p_78088_1_)) {
            bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
            bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        } else {
            bipedLeftArm.setRotationPoint(-5, 2.5F, 0);
            bipedRightArm.setRotationPoint(5, 2.5F, 0);
        }

        super.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
