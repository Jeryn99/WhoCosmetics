package com.whocraft.whocosmetics.client.models;

import com.whocraft.whocosmetics.util.ClientUtil;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class GenericJacketModel extends BipedModel<LivingEntity> {

    private final RendererModel Body;
    private final RendererModel JacketFlow;
    private final RendererModel RightArm;
    private final RendererModel LeftArm;

    public GenericJacketModel() {
        textureWidth = 64;
        textureHeight = 64;

        Body = new RendererModel(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.35F, false));

        JacketFlow = new RendererModel(this);
        JacketFlow.setRotationPoint(0.0F, 12.0F, 2.0F);
        Body.addChild(JacketFlow);
        setRotationAngle(JacketFlow, 0.0873F, 0.0F, 0.0F);
        JacketFlow.cubeList.add(new ModelBox(JacketFlow, 24, 0, -4.0F, 0.0F, 0.0F, 8, 6, 0, 0.35F, false));

        RightArm = new RendererModel(this);
        RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        RightArm.cubeList.add(new ModelBox(RightArm, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));

        LeftArm = new RendererModel(this);
        LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        LeftArm.cubeList.add(new ModelBox(LeftArm, 16, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F, false));

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

    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
