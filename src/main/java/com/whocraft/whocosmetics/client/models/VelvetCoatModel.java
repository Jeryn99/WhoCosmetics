package com.whocraft.whocosmetics.client.models;// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class VelvetCoatModel extends BipedModel<LivingEntity> {
    private final RendererModel Body;
    private final RendererModel CoatBaseLeft;
    private final RendererModel CoatBaseLeft2;
    private final RendererModel CoatBaseRight;
    private final RendererModel CoatBaseRight2;
    private final RendererModel CoatBaseBack;
    private final RendererModel Button1;
    private final RendererModel Button2;
    private final RendererModel Button3;
    private final RendererModel Button4;
    private final RendererModel Button5;
    private final RendererModel Button6;
    private final RendererModel LapelRight1;
    private final RendererModel LapelRight2;
    private final RendererModel LapelLeft1;
    private final RendererModel LapelLeft2;
    private final RendererModel RightArm;
    private final RendererModel CoatArmCuffR3;
    private final RendererModel CoatArmBack2;
    private final RendererModel CoatArmCuffR4;
    private final RendererModel CoatArmFront2;
    private final RendererModel CoatArmTop2;
    private final RendererModel CoatArmRight2;
    private final RendererModel CoatArmCuffL4;
    private final RendererModel CoatArmCuffL2;
    private final RendererModel CoatArmCuffL1;
    private final RendererModel CoatArmLeft2;
    private final RendererModel LeftArm;
    private final RendererModel CoatArmTop1;
    private final RendererModel CoatArmLeft1;
    private final RendererModel CoatArmFront1;
    private final RendererModel CoatArmRight1;
    private final RendererModel CoatArmBack1;
    private final RendererModel CoatArmCuffR1;
    private final RendererModel CoatArmCuffR2;
    private final RendererModel CoatArmCuffL3;

    public VelvetCoatModel() {
        textureWidth = 64;
        textureHeight = 64;

        Body = new RendererModel(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);


        CoatBaseLeft = new RendererModel(this);
        CoatBaseLeft.setRotationPoint(-3.1F, -0.1F, -2.5F);
        Body.addChild(CoatBaseLeft);
        CoatBaseLeft.cubeList.add(new ModelBox(CoatBaseLeft, 19, 0, -1.0F, 0.0F, 0.0F, 1, 18, 5, 0.0F, false));

        CoatBaseLeft2 = new RendererModel(this);
        CoatBaseLeft2.setRotationPoint(-2.1F, -0.1F, -2.5F);
        Body.addChild(CoatBaseLeft2);
        CoatBaseLeft2.cubeList.add(new ModelBox(CoatBaseLeft2, 32, 0, -1.0F, 0.0F, 0.0F, 1, 18, 4, 0.0F, false));

        CoatBaseRight = new RendererModel(this);
        CoatBaseRight.setRotationPoint(4.1F, -0.1F, -2.5F);
        Body.addChild(CoatBaseRight);
        CoatBaseRight.cubeList.add(new ModelBox(CoatBaseRight, 19, 24, -1.0F, 0.0F, 0.0F, 1, 18, 5, 0.0F, false));

        CoatBaseRight2 = new RendererModel(this);
        CoatBaseRight2.setRotationPoint(3.1F, -0.1F, -2.5F);
        Body.addChild(CoatBaseRight2);
        CoatBaseRight2.cubeList.add(new ModelBox(CoatBaseRight2, 32, 23, -1.0F, 0.0F, 0.0F, 1, 18, 4, 0.0F, false));

        CoatBaseBack = new RendererModel(this);
        CoatBaseBack.setRotationPoint(4.0F, -0.1F, 1.5F);
        Body.addChild(CoatBaseBack);
        CoatBaseBack.cubeList.add(new ModelBox(CoatBaseBack, 0, 0, -8.0F, 0.0F, 0.0F, 8, 18, 1, 0.0F, false));

        Button1 = new RendererModel(this);
        Button1.setRotationPoint(4.2F, 12.0F, -0.7F);
        Body.addChild(Button1);
        Button1.cubeList.add(new ModelBox(Button1, 52, 0, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));

        Button2 = new RendererModel(this);
        Button2.setRotationPoint(4.2F, 10.0F, -0.7F);
        Body.addChild(Button2);
        Button2.cubeList.add(new ModelBox(Button2, 52, 3, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));

        Button3 = new RendererModel(this);
        Button3.setRotationPoint(4.2F, 8.0F, -0.7F);
        Body.addChild(Button3);
        Button3.cubeList.add(new ModelBox(Button3, 52, 6, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));

        Button4 = new RendererModel(this);
        Button4.setRotationPoint(-3.2F, 12.0F, -0.7F);
        Body.addChild(Button4);
        Button4.cubeList.add(new ModelBox(Button4, 57, 0, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));

        Button5 = new RendererModel(this);
        Button5.setRotationPoint(-3.2F, 10.0F, -0.7F);
        Body.addChild(Button5);
        Button5.cubeList.add(new ModelBox(Button5, 57, 3, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));

        Button6 = new RendererModel(this);
        Button6.setRotationPoint(-3.2F, 8.0F, -0.7F);
        Body.addChild(Button6);
        Button6.cubeList.add(new ModelBox(Button6, 57, 6, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));

        LapelRight1 = new RendererModel(this);
        LapelRight1.setRotationPoint(3.2F, 0.0F, -2.8F);
        Body.addChild(LapelRight1);
        LapelRight1.cubeList.add(new ModelBox(LapelRight1, 43, 24, -1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));

        LapelRight2 = new RendererModel(this);
        LapelRight2.setRotationPoint(3.9F, 1.0F, -2.7F);
        Body.addChild(LapelRight2);
        LapelRight2.cubeList.add(new ModelBox(LapelRight2, 60, 10, -1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        LapelLeft1 = new RendererModel(this);
        LapelLeft1.setRotationPoint(-2.2F, 0.0F, -2.8F);
        Body.addChild(LapelLeft1);
        LapelLeft1.cubeList.add(new ModelBox(LapelLeft1, 43, 32, -1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));

        LapelLeft2 = new RendererModel(this);
        LapelLeft2.setRotationPoint(-2.9F, 1.0F, -2.7F);
        Body.addChild(LapelLeft2);
        LapelLeft2.cubeList.add(new ModelBox(LapelLeft2, 55, 10, -1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        RightArm = new RendererModel(this);
        RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);


        CoatArmCuffR3 = new RendererModel(this);
        CoatArmCuffR3.setRotationPoint(-1.5F, 6.3F, -2.5F);
        RightArm.addChild(CoatArmCuffR3);
        CoatArmCuffR3.cubeList.add(new ModelBox(CoatArmCuffR3, 52, 48, -1.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F, false));

        CoatArmBack2 = new RendererModel(this);
        CoatArmBack2.setRotationPoint(2.5F, -8.0F, 4.0F);
        CoatArmCuffR3.addChild(CoatArmBack2);
        CoatArmBack2.cubeList.add(new ModelBox(CoatArmBack2, 43, 12, -3.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, false));

        CoatArmCuffR4 = new RendererModel(this);
        CoatArmCuffR4.setRotationPoint(9.4F, 6.3F, -2.5F);
        RightArm.addChild(CoatArmCuffR4);
        CoatArmCuffR4.cubeList.add(new ModelBox(CoatArmCuffR4, 52, 40, -1.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F, false));

        CoatArmFront2 = new RendererModel(this);
        CoatArmFront2.setRotationPoint(1.0F, -1.7F, -2.5F);
        RightArm.addChild(CoatArmFront2);
        CoatArmFront2.cubeList.add(new ModelBox(CoatArmFront2, 43, 0, -3.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, false));

        CoatArmTop2 = new RendererModel(this);
        CoatArmTop2.setRotationPoint(1.0F, -1.7F, -2.0F);
        RightArm.addChild(CoatArmTop2);
        CoatArmTop2.cubeList.add(new ModelBox(CoatArmTop2, 0, 21, -3.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        CoatArmRight2 = new RendererModel(this);
        CoatArmRight2.setRotationPoint(1.0F, -1.7F, -2.5F);
        RightArm.addChild(CoatArmRight2);
        CoatArmRight2.cubeList.add(new ModelBox(CoatArmRight2, 39, 48, -1.0F, 0.0F, 0.0F, 1, 10, 5, 0.0F, false));

        CoatArmCuffL4 = new RendererModel(this);
        CoatArmCuffL4.setRotationPoint(1.4F, 6.3F, -2.5F);
        RightArm.addChild(CoatArmCuffL4);
        CoatArmCuffL4.cubeList.add(new ModelBox(CoatArmCuffL4, 52, 32, -1.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F, false));

        CoatArmCuffL2 = new RendererModel(this);
        CoatArmCuffL2.setRotationPoint(1.0F, 6.3F, 1.8F);
        RightArm.addChild(CoatArmCuffL2);
        CoatArmCuffL2.cubeList.add(new ModelBox(CoatArmCuffL2, 56, 20, -3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

        CoatArmCuffL1 = new RendererModel(this);
        CoatArmCuffL1.setRotationPoint(1.0F, 6.3F, -2.8F);
        RightArm.addChild(CoatArmCuffL1);
        CoatArmCuffL1.cubeList.add(new ModelBox(CoatArmCuffL1, 56, 16, -3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

        CoatArmLeft2 = new RendererModel(this);
        CoatArmLeft2.setRotationPoint(-1.1F, -1.7F, -2.5F);
        RightArm.addChild(CoatArmLeft2);
        CoatArmLeft2.cubeList.add(new ModelBox(CoatArmLeft2, 26, 48, -1.0F, 0.0F, 0.0F, 1, 10, 5, 0.0F, false));

        LeftArm = new RendererModel(this);
        LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);


        CoatArmTop1 = new RendererModel(this);
        CoatArmTop1.setRotationPoint(2.0F, -1.7F, -2.0F);
        LeftArm.addChild(CoatArmTop1);
        CoatArmTop1.cubeList.add(new ModelBox(CoatArmTop1, 0, 27, -3.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        CoatArmLeft1 = new RendererModel(this);
        CoatArmLeft1.setRotationPoint(2.1F, -1.7F, -2.5F);
        LeftArm.addChild(CoatArmLeft1);
        CoatArmLeft1.cubeList.add(new ModelBox(CoatArmLeft1, 0, 48, -1.0F, 0.0F, 0.0F, 1, 10, 5, 0.0F, false));

        CoatArmFront1 = new RendererModel(this);
        CoatArmFront1.setRotationPoint(2.0F, -1.7F, -2.5F);
        LeftArm.addChild(CoatArmFront1);
        CoatArmFront1.cubeList.add(new ModelBox(CoatArmFront1, 0, 33, -3.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, false));

        CoatArmRight1 = new RendererModel(this);
        CoatArmRight1.setRotationPoint(0.0F, -1.7F, -2.5F);
        LeftArm.addChild(CoatArmRight1);
        CoatArmRight1.cubeList.add(new ModelBox(CoatArmRight1, 13, 48, -1.0F, 0.0F, 0.0F, 1, 10, 5, 0.0F, false));

        CoatArmBack1 = new RendererModel(this);
        CoatArmBack1.setRotationPoint(2.0F, -1.7F, 1.5F);
        LeftArm.addChild(CoatArmBack1);
        CoatArmBack1.cubeList.add(new ModelBox(CoatArmBack1, 9, 33, -3.0F, 0.0F, 0.0F, 3, 10, 1, 0.0F, false));

        CoatArmCuffR1 = new RendererModel(this);
        CoatArmCuffR1.setRotationPoint(2.0F, 6.3F, -2.8F);
        LeftArm.addChild(CoatArmCuffR1);
        CoatArmCuffR1.cubeList.add(new ModelBox(CoatArmCuffR1, 54, 60, -3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

        CoatArmCuffR2 = new RendererModel(this);
        CoatArmCuffR2.setRotationPoint(2.0F, 6.3F, 1.8F);
        LeftArm.addChild(CoatArmCuffR2);
        CoatArmCuffR2.cubeList.add(new ModelBox(CoatArmCuffR2, 54, 56, -3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

        CoatArmCuffL3 = new RendererModel(this);
        CoatArmCuffL3.setRotationPoint(2.5F, 6.3F, -2.5F);
        LeftArm.addChild(CoatArmCuffL3);
        CoatArmCuffL3.cubeList.add(new ModelBox(CoatArmCuffL3, 52, 24, -1.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F, false));
        bipedBody = Body;
        bipedRightArm = RightArm;
        bipedLeftArm = LeftArm;
    }

}