package com.whocraft.whocosmetics.client.models;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class StrawHatModel extends BipedModel {
    private final ModelRenderer seventh_hat;

    public StrawHatModel() {
        super(0);
        textureWidth = 64;
        textureHeight = 64;

        bipedHead = new ModelRenderer(this);
        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);

        seventh_hat = new ModelRenderer(this);
        seventh_hat.setRotationPoint(0.25F, -10.5F, -1.5F);
        seventh_hat.setTextureOffset(0, 0).addBox(-5.25F, 3.5F, -3.5F, 10.0F, 1.0F, 10.0F, 0.0F, false);
        seventh_hat.setTextureOffset(0, 11).addBox(-4.75F, 2.5F, -3.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
        seventh_hat.setTextureOffset(24, 24).addBox(-4.25F, 1.75F, -2.5F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        seventh_hat.setTextureOffset(0, 21).addBox(-4.25F, 0.75F, -2.5F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        seventh_hat.setTextureOffset(27, 11).addBox(-3.25F, 0.5F, -2.5F, 6.0F, 1.0F, 8.0F, 0.0F, false);
        seventh_hat.setTextureOffset(17, 33).addBox(2.75F, 0.5F, -1.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        seventh_hat.setTextureOffset(9, 30).addBox(-4.25F, 0.5F, -1.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        seventh_hat.setTextureOffset(30, 0).addBox(-0.75F, 0.0F, -2.0F, 1.0F, 1.0F, 7.0F, 0.0F, true);
   		bipedHead.addChild(seventh_hat);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        bipedHeadwear.showModel = false;
    }

}