package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class StetsonModel extends BipedModel<LivingEntity> implements LivingArmor {
    private final ModelRenderer Head;

    private LivingEntity living;

    public StetsonModel() {
        super(1);
        textureWidth = 64;
        textureHeight = 64;

        Head = new ModelRenderer(this);
        Head.setRotationPoint(8.0F, -29.0F, -8.0F);
        Head.setTextureOffset(0, 16).addBox(-12.0F, 19.6F, 4.0F, 8.0F, 3.0F, 8.0F, 0.6F, false);
        Head.setTextureOffset(0, 28).addBox(-12.0F, 19.4F, 4.0F, 8.0F, 3.0F, 8.0F, 0.8F, false);
        Head.setTextureOffset(0, 0).addBox(-15.0F, 21.2F, 1.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
        bipedHead = Head;
        bipedHeadwear.showModel = false;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        matrixStackIn.push();
        matrixStackIn.translate(0,-2,0);
        Head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
        matrixStackIn.pop();
    }

    @Override
    public void setLiving(LivingEntity livingEntity) {
        this.living = livingEntity;
    }

    @Override
    public LivingEntity getLiving() {
        return living;
    }
}