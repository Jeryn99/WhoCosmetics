package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public class WeepingAngelWingsModel extends BipedModel {

    public RendererModel body;
    public RendererModel head;
    public RendererModel left_wing_1;
    public RendererModel right_wing_1;
    public RendererModel left_wing_2;
    public RendererModel left_wing_0;
    public RendererModel left_wing_3;
    public RendererModel left_wing_4;
    public RendererModel right_wing_2;
    public RendererModel right_wing_0;
    public RendererModel right_wing_3;
    public RendererModel right_wing_4;

    public WeepingAngelWingsModel() {
        this.textureWidth = 81;
        this.textureHeight = 34;
        this.right_wing_2 = new RendererModel(this, 42, 0);
        this.right_wing_2.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.right_wing_2.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(right_wing_2, 1.2292353921796064F, 0.0F, 0.0F);
        this.left_wing_3 = new RendererModel(this, 26, 0);
        this.left_wing_3.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.left_wing_3.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(left_wing_3, -1.2292353921796064F, 0.0F, 0.0F);
        this.right_wing_1 = new RendererModel(this, 8, 0);
        this.right_wing_1.setRotationPoint(-2.4F, 2.0F, 1.5F);
        this.right_wing_1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(right_wing_1, 1.53588974175501F, -0.9424777960769379F, 0.0F);
        this.left_wing_0 = new RendererModel(this, 6, 0);
        this.left_wing_0.setRotationPoint(2.4F, 2.0F, 1.5F);
        this.left_wing_0.addBox(-3.4F, -2.0F, -15.0F, 1, 11, 18, 0.0F);
        this.right_wing_3 = new RendererModel(this, 50, 0);
        this.right_wing_3.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.right_wing_3.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(right_wing_3, -1.2292353921796064F, 0.0F, 0.0F);
        this.left_wing_2 = new RendererModel(this, 16, 0);
        this.left_wing_2.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.left_wing_2.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(left_wing_2, 1.2292353921796064F, 0.0F, 0.0F);
        this.body = new RendererModel(this, 0, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.head = new RendererModel(this, 0, 34);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 0, 0, 0, 0.0F);
        this.left_wing_1 = new RendererModel(this, 0, 0);
        this.left_wing_1.setRotationPoint(2.4F, 2.0F, 1.5F);
        this.left_wing_1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(left_wing_1, 1.53588974175501F, 0.9424777960769379F, 0.0F);
        this.right_wing_4 = new RendererModel(this, 64, 0);
        this.right_wing_4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.right_wing_4.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(right_wing_4, -1.1383037381507017F, 0.0F, 0.0F);
        this.left_wing_4 = new RendererModel(this, 34, 0);
        this.left_wing_4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.left_wing_4.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(left_wing_4, -1.1383037381507017F, 0.0F, 0.0F);
        this.right_wing_0 = new RendererModel(this, 44, 0);
        this.right_wing_0.setRotationPoint(-2.4F, 2.0F, 1.5F);
        this.right_wing_0.addBox(2.4F, -2.0F, -15.0F, 1, 11, 18, 0.0F);
        this.right_wing_1.addChild(this.right_wing_2);
        this.left_wing_2.addChild(this.left_wing_3);
        this.body.addChild(this.right_wing_1);
        this.left_wing_1.addChild(this.left_wing_0);
        this.right_wing_2.addChild(this.right_wing_3);
        this.left_wing_1.addChild(this.left_wing_2);
        this.body.addChild(this.left_wing_1);
        this.right_wing_3.addChild(this.right_wing_4);
        this.left_wing_3.addChild(this.left_wing_4);
        this.right_wing_1.addChild(this.right_wing_0);
    }

    @Override
    public void render(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float f5) {

        setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, f5);
        this.isChild = false;
        GlStateManager.pushMatrix();

        if (this.isChild) {
            GlStateManager.scalef(0.75F, 0.75F, 0.75F);
            GlStateManager.translatef(0.0F, 16.0F * f5, 0.0F);
            if (entityIn.isSneaking()) {
                GlStateManager.translatef(0.0F, 0.2F, 0.0F);
            }

            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scalef(0.5F, 0.5F, 0.5F);
            GlStateManager.translatef(0.0F, 24.0F * f5, 0.0F);
            if (entityIn.isSneaking()) {
                GlStateManager.translatef(0.0F, 0.2F, 0.0F);
            }
            renderWings(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, f5);
        } else {
            if (entityIn.isSneaking()) {
                GlStateManager.translatef(0.0F, 0.2F, 0.0F);
            }
            renderWings(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, f5);
        }

        GlStateManager.popMatrix();
    }

    public void renderWings(Entity player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float f5) {
        float motion = Math.abs(MathHelper.sin(limbSwing * 0.033F + (float) Math.PI) * 0.4F) * limbSwingAmount;
       // boolean flapWings = player.world.isAirBlock(player.getPosition().down());
        boolean flapWings = false;

        float speed = 0.55f + 0.5f * motion;
        float y = MathHelper.sin(ageInTicks * 0.35F);
        float flap = y * 0.5f * speed;

        GlStateManager.pushMatrix();
        if (flapWings) {
            GlStateManager.rotated(flap * 20, 0, 1, 0);
        }
        left_wing_1.render(f5);
        GlStateManager.popMatrix();

        GlStateManager.pushMatrix();
        if (flapWings) {
            GlStateManager.rotated(-flap * 20, 0, 1, 0);
        }
        right_wing_1.render(f5);
        GlStateManager.popMatrix();
    }


    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
