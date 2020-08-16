package com.whocraft.whocosmetics.client.models;// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class FruitHatModel extends BipedModel<LivingEntity> {
    private final RendererModel Hat;
    private final RendererModel Side;
    private final RendererModel Main;

    public FruitHatModel() {
        textureWidth = 64;
        textureHeight = 64;

        Hat = new RendererModel(this);
        Hat.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(Hat, 0.0F, 0.0F, 0.0F);


        Side = new RendererModel(this);
        Side.setRotationPoint(11.0F, -6.5F, 0.0F);
        Hat.addChild(Side);
        Side.cubeList.add(new ModelBox(Side, 20, 21, -7.8505F, -0.332F, -5.0F, 3, 1, 10, 0.0F, false));

        Main = new RendererModel(this);
        Main.setRotationPoint(2.0F, -7.75F, 0.0F);
        Hat.addChild(Main);
        setRotationAngle(Main, 0.0F, 0.0F, 0.5672F);
        Main.cubeList.add(new ModelBox(Main, 0, 0, -5.0F, 0.0F, -5.0F, 7, 1, 10, 0.0F, false));
        Main.cubeList.add(new ModelBox(Main, 0, 21, -4.0F, -2.0F, -4.0F, 7, 2, 8, 0.0F, false));
        Main.cubeList.add(new ModelBox(Main, 0, 11, -4.0F, -2.0F, -4.0F, 7, 2, 8, 0.2F, false));

        bipedHead = Hat;
        bipedHeadwear.isHidden = true;
    }


    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}