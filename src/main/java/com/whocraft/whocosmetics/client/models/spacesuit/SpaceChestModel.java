package com.whocraft.whocosmetics.client.models.spacesuit;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class SpaceChestModel extends BipedModel<LivingEntity> {
    private final RendererModel left_arm;
    private final RendererModel LeftArm11;
    private final RendererModel LeftArm10;
    private final RendererModel LeftArm9;
    private final RendererModel LeftArm8;
    private final RendererModel LeftArm7;
    private final RendererModel LeftArm6;
    private final RendererModel LeftArm5;
    private final RendererModel LeftArm4;
    private final RendererModel LeftArm3;
    private final RendererModel LeftArm2;
    private final RendererModel LeftArm1;
    private final RendererModel right_arm;
    private final RendererModel RightArm10;
    private final RendererModel RightArm9;
    private final RendererModel RightArm8;
    private final RendererModel RightArm7;
    private final RendererModel RightArm6;
    private final RendererModel RightArm5;
    private final RendererModel RightArm4;
    private final RendererModel RightArm3;
    private final RendererModel RightArm2;
    private final RendererModel RightArm1;
    private final RendererModel chest;
    private final RendererModel Torso11;
    private final RendererModel Torso10;
    private final RendererModel Torso9;
    private final RendererModel Torso8;
    private final RendererModel Torso7;
    private final RendererModel Torso5;
    private final RendererModel Torso6;
    private final RendererModel Torso4;
    private final RendererModel Torso3;
    private final RendererModel Torso2;
    private final RendererModel Torso1;

    public SpaceChestModel() {
        textureWidth = 128;
        textureHeight = 128;

        left_arm = new RendererModel(this);
        left_arm.setRotationPoint(5.0F, 2.0F, 0.0F);


        LeftArm11 = new RendererModel(this);
        LeftArm11.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm11);
        LeftArm11.cubeList.add(new ModelBox(LeftArm11, 40, 53, 2.3F, -2.0F, -2.0F, 1, 9, 4, 0.3F, true));

        LeftArm10 = new RendererModel(this);
        LeftArm10.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm10);
        LeftArm10.cubeList.add(new ModelBox(LeftArm10, 65, 51, -1.0F, 7.0F, -2.2F, 4, 3, 1, 0.3F, false));

        LeftArm9 = new RendererModel(this);
        LeftArm9.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm9);
        LeftArm9.cubeList.add(new ModelBox(LeftArm9, 97, 56, -1.2F, 7.0F, -2.0F, 1, 3, 4, 0.3F, true));

        LeftArm8 = new RendererModel(this);
        LeftArm8.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm8);
        LeftArm8.cubeList.add(new ModelBox(LeftArm8, 78, 58, -1.0F, 9.2F, -2.0F, 4, 1, 4, 0.3F, false));

        LeftArm7 = new RendererModel(this);
        LeftArm7.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm7);
        LeftArm7.cubeList.add(new ModelBox(LeftArm7, 40, 16, -1.3F, -2.0F, -2.0F, 1, 9, 4, 0.3F, true));

        LeftArm6 = new RendererModel(this);
        LeftArm6.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm6);
        LeftArm6.cubeList.add(new ModelBox(LeftArm6, 53, 54, -1.0F, -2.0F, -2.3F, 4, 9, 1, 0.3F, false));

        LeftArm5 = new RendererModel(this);
        LeftArm5.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm5);
        LeftArm5.cubeList.add(new ModelBox(LeftArm5, 65, 51, -1.0F, 7.0F, 1.2F, 4, 3, 1, 0.3F, false));

        LeftArm4 = new RendererModel(this);
        LeftArm4.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm4);
        LeftArm4.cubeList.add(new ModelBox(LeftArm4, 53, 54, -1.0F, -2.0F, 1.3F, 4, 9, 1, 0.3F, false));

        LeftArm3 = new RendererModel(this);
        LeftArm3.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm3);
        LeftArm3.cubeList.add(new ModelBox(LeftArm3, 77, 51, -1.0F, -2.3F, -2.0F, 4, 1, 4, 0.3F, false));

        LeftArm2 = new RendererModel(this);
        LeftArm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm2);
        LeftArm2.cubeList.add(new ModelBox(LeftArm2, 114, 14, 2.5F, 2.0F, -1.0F, 1, 4, 2, 0.3F, true));

        LeftArm1 = new RendererModel(this);
        LeftArm1.setRotationPoint(0.0F, 0.0F, 0.0F);
        left_arm.addChild(LeftArm1);
        LeftArm1.cubeList.add(new ModelBox(LeftArm1, 65, 57, 2.2F, 7.0F, -2.0F, 1, 3, 4, 0.3F, true));

        right_arm = new RendererModel(this);
        right_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);


        RightArm10 = new RendererModel(this);
        RightArm10.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm10);
        RightArm10.cubeList.add(new ModelBox(RightArm10, 65, 51, -3.0F, 7.0F, -2.2F, 4, 3, 1, 0.3F, true));

        RightArm9 = new RendererModel(this);
        RightArm9.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm9);
        RightArm9.cubeList.add(new ModelBox(RightArm9, 65, 57, 0.2F, 7.0F, -2.0F, 1, 3, 4, 0.3F, true));

        RightArm8 = new RendererModel(this);
        RightArm8.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm8);
        RightArm8.cubeList.add(new ModelBox(RightArm8, 78, 58, -3.0F, 9.2F, -2.0F, 4, 1, 4, 0.3F, true));

        RightArm7 = new RendererModel(this);
        RightArm7.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm7);
        RightArm7.cubeList.add(new ModelBox(RightArm7, 53, 54, -3.0F, -2.0F, -2.3F, 4, 9, 1, 0.3F, true));

        RightArm6 = new RendererModel(this);
        RightArm6.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm6);
        RightArm6.cubeList.add(new ModelBox(RightArm6, 77, 51, -3.0F, -2.3F, -2.0F, 4, 1, 4, 0.3F, true));

        RightArm5 = new RendererModel(this);
        RightArm5.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm5);
        RightArm5.cubeList.add(new ModelBox(RightArm5, 40, 53, 0.3F, -2.0F, -2.0F, 1, 9, 4, 0.3F, true));

        RightArm4 = new RendererModel(this);
        RightArm4.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm4);
        RightArm4.cubeList.add(new ModelBox(RightArm4, 65, 57, -3.2F, 7.0F, -2.0F, 1, 3, 4, 0.3F, true));

        RightArm3 = new RendererModel(this);
        RightArm3.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm3);
        RightArm3.cubeList.add(new ModelBox(RightArm3, 65, 51, -3.0F, 7.0F, 1.2F, 4, 3, 1, 0.3F, true));

        RightArm2 = new RendererModel(this);
        RightArm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm2);
        RightArm2.cubeList.add(new ModelBox(RightArm2, 53, 54, -3.0F, -2.0F, 1.3F, 4, 9, 1, 0.3F, true));

        RightArm1 = new RendererModel(this);
        RightArm1.setRotationPoint(0.0F, 0.0F, 0.0F);
        right_arm.addChild(RightArm1);
        RightArm1.cubeList.add(new ModelBox(RightArm1, 40, 53, -3.3F, -2.0F, -2.0F, 1, 9, 4, 0.3F, true));

        chest = new RendererModel(this);
        chest.setRotationPoint(0.0F, 0.0F, 0.0F);


        Torso11 = new RendererModel(this);
        Torso11.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso11);
        setRotationAngle(Torso11, 0.0F, 0.0F, -0.4887F);
        Torso11.cubeList.add(new ModelBox(Torso11, 16, 23, -2.5F, 0.0F, 1.5F, 1, 4, 1, 0.3F, true));

        Torso10 = new RendererModel(this);
        Torso10.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso10);
        Torso10.cubeList.add(new ModelBox(Torso10, 13, 53, -4.0F, 0.0F, -2.3F, 8, 12, 1, 0.3F, true));

        Torso9 = new RendererModel(this);
        Torso9.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso9);
        setRotationAngle(Torso9, 0.0F, 0.0F, 0.4887F);
        Torso9.cubeList.add(new ModelBox(Torso9, 16, 23, 1.5F, 0.0F, 1.5F, 1, 4, 1, 0.3F, true));

        Torso8 = new RendererModel(this);
        Torso8.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso8);
        setRotationAngle(Torso8, 0.0F, 0.0F, -0.0175F);
        Torso8.cubeList.add(new ModelBox(Torso8, 115, 33, -3.5F, 0.0F, -2.5F, 1, 12, 1, 0.3F, true));

        Torso7 = new RendererModel(this);
        Torso7.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso7);
        Torso7.cubeList.add(new ModelBox(Torso7, 34, 54, -0.5F, 0.0F, 1.5F, 1, 12, 1, 0.3F, true));

        Torso5 = new RendererModel(this);
        Torso5.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso5);
        Torso5.cubeList.add(new ModelBox(Torso5, 0, 71, -4.0F, -0.3F, -2.0F, 8, 1, 4, 0.3F, true));

        Torso6 = new RendererModel(this);
        Torso6.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso6);
        Torso6.cubeList.add(new ModelBox(Torso6, 23, 22, -0.5F, 4.1F, -2.5F, 1, 8, 1, 0.3F, true));

        Torso4 = new RendererModel(this);
        Torso4.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso4);
        Torso4.cubeList.add(new ModelBox(Torso4, 0, 53, -4.3F, 0.0F, -2.0F, 1, 12, 4, 0.3F, true));

        Torso3 = new RendererModel(this);
        Torso3.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso3);
        Torso3.cubeList.add(new ModelBox(Torso3, 13, 53, -4.0F, 0.0F, 1.3F, 8, 12, 1, 0.3F, true));

        Torso2 = new RendererModel(this);
        Torso2.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso2);
        Torso2.cubeList.add(new ModelBox(Torso2, 0, 53, 3.3F, 0.0F, -2.0F, 1, 12, 4, 0.3F, true));

        Torso1 = new RendererModel(this);
        Torso1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chest.addChild(Torso1);
        setRotationAngle(Torso1, 0.0F, 0.0F, 0.0175F);
        Torso1.cubeList.add(new ModelBox(Torso1, 115, 33, 2.5F, 0.0F, -2.5F, 1, 12, 1, 0.3F, true));

        bipedBody = chest;
        bipedLeftArm = left_arm;
        bipedRightArm = right_arm;
    }


    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}