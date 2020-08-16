package com.whocraft.whocosmetics.client.models;// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class FeatherHatModel extends BipedModel<LivingEntity> {
    private final RendererModel Hat;
    private final RendererModel Main;

    public FeatherHatModel() {
        textureWidth = 64;
        textureHeight = 64;

        Hat = new RendererModel(this);
        Hat.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(Hat, 0.0F, 0.0F, 0.0F);


        Main = new RendererModel(this);
        Main.setRotationPoint(2.0F, -7.75F, 0.0F);
        Hat.addChild(Main);
        setRotationAngle(Main, 0.0F, 0.0F, 0.5672F);
        Main.cubeList.add(new ModelBox(Main, 30, 2, 0.1112F, -4.0116F, -4.1F, 3, 4, 4, 0.0F, false));
        Main.cubeList.add(new ModelBox(Main, 37, 5, 3.1112F, -4.0116F, -0.1F, 0, 1, 1, 0.0F, false));
        Main.cubeList.add(new ModelBox(Main, 0, 0, -6.0F, 0.0F, -5.0F, 10, 1, 10, 0.0F, false));
        Main.cubeList.add(new ModelBox(Main, 0, 22, -5.0F, -2.0F, -4.0F, 8, 2, 8, 0.0F, false));
        Main.cubeList.add(new ModelBox(Main, 0, 11, -5.0F, -3.0F, -4.0F, 8, 3, 8, 0.2F, false));
        bipedHead = Hat;
        bipedHeadwear.isHidden = true;
    }



    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}