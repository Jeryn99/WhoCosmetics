package com.whocraft.whocosmetics.client.models;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;


public class FirstHatModel extends BipedModel<LivingEntity> {
    private final ModelRenderer first_fez;
    private final ModelRenderer first_hat;
    private final ModelRenderer tasel;

    public FirstHatModel(){
    	this(0);
	}

    public FirstHatModel(float modelSize) {
        super(modelSize);
        textureWidth = 16;
        textureHeight = 16;

        first_fez = new ModelRenderer(this);
        first_fez.setRotationPoint(0.0F, 0.0F, 0.0F);


        first_hat = new ModelRenderer(this);
        first_hat.setRotationPoint(0.25F, -8.25F, 0.5F);
        first_fez.addChild(first_hat);
        setRotationAngle(first_hat, -0.384F, 0.0F, 0.0F);
        first_hat.setTextureOffset(0, 0).addBox(-3.75F, -3.0F, 0.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        tasel = new ModelRenderer(this);
        tasel.setRotationPoint(-2.25F, -3.25F, 2.25F);
        first_hat.addChild(tasel);
        tasel.setTextureOffset(6, 7).addBox(0.4F, 0.1F, -1.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        tasel.setTextureOffset(6, 7).addBox(-1.4F, 0.1F, -1.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        tasel.setTextureOffset(0, 9).addBox(0.4F, 0.1F, 0.65F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        tasel.setTextureOffset(0, 9).addBox(-1.4F, 0.1F, 0.65F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        bipedHead = first_fez;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        bipedHeadwear.showModel = false;
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}