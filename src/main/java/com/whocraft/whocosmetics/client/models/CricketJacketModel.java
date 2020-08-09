package com.whocraft.whocosmetics.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class CricketJacketModel extends BipedModel<LivingEntity> {
    private final RendererModel Body;
    private final RendererModel RightArm;
    private final RendererModel LeftArm;

    public CricketJacketModel() {
        textureWidth = 64;
        textureHeight = 64;

        Body = new RendererModel(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.cubeList.add(new ModelBox(Body, 19, 0, -4.1F, -0.1F, -2.5F, 1, 18, 5, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 32, 0, -3.1F, -0.1F, -2.5F, 1, 18, 4, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 19, 24, 3.1F, -0.1F, -2.5F, 1, 18, 5, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 32, 23, 2.1F, -0.1F, -2.5F, 1, 18, 4, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, -0.1F, 1.5F, 8, 18, 1, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 58, 16, 3.2F, 11.0F, -1.0F, 1, 1, 2, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 58, 20, -4.2F, 11.0F, -1.0F, 1, 1, 2, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 57, 3, -3.2F, 8.7F, 1.7F, 1, 1, 1, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 57, 6, 1.8F, 8.7F, 1.7F, 1, 1, 1, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 43, 24, 2.2F, 0.0F, -2.8F, 1, 6, 1, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 55, 10, -3.9F, 1.0F, -2.7F, 1, 4, 1, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 43, 32, -3.2F, 0.0F, -2.8F, 1, 6, 1, 0.3F, true));
        Body.cubeList.add(new ModelBox(Body, 60, 10, 2.9F, 1.0F, -2.7F, 1, 4, 1, 0.3F, true));

        RightArm = new RendererModel(this);
        RightArm.setRotationPoint(-5.0F, 2.5F, 0.0F);
        RightArm.cubeList.add(new ModelBox(RightArm, 43, 0, -2.0F, -2.2F, -2.5F, 3, 9, 1, 0.3F, true));
        RightArm.cubeList.add(new ModelBox(RightArm, 0, 21, -2.0F, -2.2F, -2.0F, 3, 1, 4, 0.3F, true));
        RightArm.cubeList.add(new ModelBox(RightArm, 43, 12, -2.0F, -2.2F, 1.5F, 3, 9, 1, 0.3F, true));
        RightArm.cubeList.add(new ModelBox(RightArm, 26, 48, -2.1F, -2.2F, -2.5F, 1, 9, 5, 0.3F, true));
        RightArm.cubeList.add(new ModelBox(RightArm, 39, 48, 0.0F, -2.2F, -2.5F, 1, 9, 5, 0.3F, true));

        LeftArm = new RendererModel(this);
        LeftArm.setRotationPoint(5.0F, 2.5F, 0.0F);
        LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 33, -1.0F, -2.2F, -2.5F, 3, 9, 1, 0.3F, true));
        LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 27, -1.0F, -2.2F, -2.0F, 3, 1, 4, 0.3F, true));
        LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 48, 1.1F, -2.2F, -2.5F, 1, 9, 5, 0.3F, true));
        LeftArm.cubeList.add(new ModelBox(LeftArm, 13, 48, -1.0F, -2.2F, -2.5F, 1, 9, 5, 0.3F, true));
        LeftArm.cubeList.add(new ModelBox(LeftArm, 9, 33, -1.0F, -2.2F, 1.5F, 3, 9, 1, 0.3F, true));

        bipedLeftArm = LeftArm;
        bipedRightArm = RightArm;
        bipedBody = Body;

    }

    @Override
    public void render(LivingEntity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {

        super.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
    }
}
