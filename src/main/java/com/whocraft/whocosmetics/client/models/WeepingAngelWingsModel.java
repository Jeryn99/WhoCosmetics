package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;

public class WeepingAngelWingsModel extends BipedModel<LivingEntity> {

    public ModelRenderer body;
    public ModelRenderer head;
    public ModelRenderer left_wing_1;
    public ModelRenderer right_wing_1;
    public ModelRenderer left_wing_2;
    public ModelRenderer left_wing_0;
    public ModelRenderer left_wing_3;
    public ModelRenderer left_wing_4;
    public ModelRenderer right_wing_2;
    public ModelRenderer right_wing_0;
    public ModelRenderer right_wing_3;
    public ModelRenderer right_wing_4;

    public WeepingAngelWingsModel() {
        this.textureWidth = 81;
        this.textureHeight = 34;
        this.right_wing_2 = new ModelRenderer(this, 42, 0);
        this.right_wing_2.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.right_wing_2.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(right_wing_2, 1.2292353921796064F, 0.0F, 0.0F);
        this.left_wing_3 = new ModelRenderer(this, 26, 0);
        this.left_wing_3.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.left_wing_3.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(left_wing_3, -1.2292353921796064F, 0.0F, 0.0F);
        this.right_wing_1 = new ModelRenderer(this, 8, 0);
        this.right_wing_1.setRotationPoint(-2.4F, 2.0F, 1.5F);
        this.right_wing_1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(right_wing_1, 1.53588974175501F, -0.9424777960769379F, 0.0F);
        this.left_wing_0 = new ModelRenderer(this, 6, 0);
        this.left_wing_0.setRotationPoint(2.4F, 2.0F, 1.5F);
        this.left_wing_0.addBox(-3.4F, -2.0F, -15.0F, 1, 11, 18, 0.0F);
        this.right_wing_3 = new ModelRenderer(this, 50, 0);
        this.right_wing_3.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.right_wing_3.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(right_wing_3, -1.2292353921796064F, 0.0F, 0.0F);
        this.left_wing_2 = new ModelRenderer(this, 16, 0);
        this.left_wing_2.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.left_wing_2.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(left_wing_2, 1.2292353921796064F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.head = new ModelRenderer(this, 0, 34);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 0, 0, 0, 0.0F);
        this.left_wing_1 = new ModelRenderer(this, 0, 0);
        this.left_wing_1.setRotationPoint(2.4F, 2.0F, 1.5F);
        this.left_wing_1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(left_wing_1, 1.53588974175501F, 0.9424777960769379F, 0.0F);
        this.right_wing_4 = new ModelRenderer(this, 64, 0);
        this.right_wing_4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.right_wing_4.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(right_wing_4, -1.1383037381507017F, 0.0F, 0.0F);
        this.left_wing_4 = new ModelRenderer(this, 34, 0);
        this.left_wing_4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.left_wing_4.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(left_wing_4, -1.1383037381507017F, 0.0F, 0.0F);
        this.right_wing_0 = new ModelRenderer(this, 44, 0);
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
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    @Override
    public void render(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {

        setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
        GlStateManager.pushMatrix(); //Matrix 1

        if (this.isChild) {
            //There appears to be duplicate rendering code here?
            GlStateManager.scalef(0.75F, 0.75F, 0.75F);
            GlStateManager.translatef(0.0F, 16.0F * scaleFactor, 0.0F);
            if (entityIn.isSneaking()) {
                GlStateManager.translatef(0.0F, 0.2F, 0.0F);
            }
            GlStateManager.popMatrix();// End Matrix 1 if entity is child

            GlStateManager.pushMatrix();//Start Matrix 2
            GlStateManager.scalef(0.5F, 0.5F, 0.5F);
            GlStateManager.translatef(0.0F, 24.0F * scaleFactor, 0.0F);
            if (entityIn.isSneaking()) {
                GlStateManager.translatef(0.0F, 0.2F, 0.0F);
            }
            renderWings(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
        } else {
            if (entityIn instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entityIn;
                if (player.isSneaking()) {
                    GlStateManager.translatef(0.0F, player.abilities.isFlying ? 0.0F : 0.2F, 0.0F); //Prevents translatation or rotatation if the player is sneaking whilst flying. (Player pose doesn't actually use sneak pose at this stage)
                    GlStateManager.rotated(player.abilities.isFlying ? 0 : 30, 1, 0, 0);
                }
           }
           else {
                if (entityIn.isSneaking()) {
                    GlStateManager.translatef(0.0F, 0.2F, 0.0F);
                    GlStateManager.rotated(30, 1, 0, 0);
                }
            }
            renderWings(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
        }

        GlStateManager.popMatrix(); // End Matrix 1 if not child or end matrix 2 if is child
    }

    public void renderWings(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        float motion = Math.abs(MathHelper.sin(limbSwing * 0.033F + (float) Math.PI) * 0.4F) * limbSwingAmount;
//       boolean flapWings = entity.world.isAirBlock(entity.getPosition().down());
//       boolean flapWings = false;
        boolean flapWings = entity.fallDistance > 2; //Make the wings flap if the entity is falling more than 2 blocks. This ensures it won't open when entity is jumping
        if (entity != null && entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)entity;
            flapWings = entity.fallDistance > 2 || player.abilities.isFlying; //Also make wings flap if flying in creative mode
        }

        float speed = 0.55f + 0.5f * motion;
        float y = MathHelper.sin(ageInTicks * 0.35F);
        float flap = y * 0.5f * speed;

        GlStateManager.pushMatrix();
        if (flapWings) {
            GlStateManager.rotated(flap * 20, 0, 1, 0);
        }
        left_wing_1.render(scaleFactor);
        GlStateManager.popMatrix();

        GlStateManager.pushMatrix();
        if (flapWings) {
            GlStateManager.rotated(-flap * 20, 0, 1, 0);
        }
        right_wing_1.render(scaleFactor);
        GlStateManager.popMatrix();
    }


    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
