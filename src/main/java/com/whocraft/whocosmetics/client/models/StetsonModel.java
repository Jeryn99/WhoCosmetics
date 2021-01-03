package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class StetsonModel extends BipedModel<LivingEntity> implements IClothingModel{
    private final ModelRenderer stetson;
    private final ModelRenderer hats;
    private LivingEntity living;

    public StetsonModel() {
        super(0);
        textureWidth = 64;
        textureHeight = 64;

        stetson = new ModelRenderer(this);
        stetson.setRotationPoint(0.0F, 0.0F, 0.0F);


        hats = new ModelRenderer(this);
        hats.setRotationPoint(5.5F, -7.25F, 0.5F);
        stetson.addChild(hats);
        hats.setTextureOffset(0, 0).addBox(-10.0F, 0.25F, -6.0F, 9.0F, 1.0F, 11.0F, 0.0F, false);
        hats.setTextureOffset(20, 38).addBox(-9.5F, -0.75F, -4.75F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        hats.setTextureOffset(0, 12).addBox(-9.5F, -1.75F, -4.5F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        hats.setTextureOffset(8, 15).addBox(-8.5F, -2.0F, 1.25F, 6.0F, 1.0F, 2.0F, 0.0F, false);
        hats.setTextureOffset(8, 15).addBox(-8.5F, -2.0F, -4.25F, 6.0F, 1.0F, 2.0F, 0.0F, false);
        hats.setTextureOffset(20, 21).addBox(-9.0F, -2.25F, -3.5F, 7.0F, 1.0F, 6.0F, 0.0F, false);
        hats.setTextureOffset(10, 30).addBox(-7.0F, -2.75F, -3.5F, 3.0F, 1.0F, 6.0F, 0.0F, false);
        hats.setTextureOffset(39, 0).addBox(-8.0F, -3.0F, -3.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        hats.setTextureOffset(24, 12).addBox(-4.0F, -3.0F, -3.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        hats.setTextureOffset(29, 0).addBox(-9.75F, -0.75F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        hats.setTextureOffset(32, 19).addBox(-9.5F, -0.75F, 2.75F, 8.0F, 1.0F, 1.0F, 0.0F, false);
        hats.setTextureOffset(0, 30).addBox(-2.25F, -0.75F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        hats.setTextureOffset(19, 28).addBox(-1.0F, 0.25F, -5.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
        hats.setTextureOffset(19, 28).addBox(-11.0F, 0.25F, -5.0F, 1.0F, 1.0F, 9.0F, 0.0F, true);
        hats.setTextureOffset(32, 9).addBox(-11.5F, -0.25F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        hats.setTextureOffset(30, 28).addBox(-0.5F, -0.25F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
        hats.setTextureOffset(11, 38).addBox(-12.0F, -1.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        hats.setTextureOffset(32, 37).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        bipedHead = stetson;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        matrixStackIn.push();
        matrixStackIn.scale(1.1F, 1.1F, 1.1F);
        bipedHeadwear.showModel = false;
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        matrixStackIn.pop();
    }

    @Override
    public void setLiving(LivingEntity livingEntity) {
        this.living = livingEntity;
    }
}