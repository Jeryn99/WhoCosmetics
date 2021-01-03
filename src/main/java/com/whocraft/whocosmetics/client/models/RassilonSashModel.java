package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class RassilonSashModel extends BipedModel<LivingEntity>  {
    private final ModelRenderer sash;
    private final ModelRenderer fourth_scarf;
    private final ModelRenderer bends;
    private final ModelRenderer bone4;
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer bone5;

    public RassilonSashModel() {
        super(0);
        textureWidth = 32;
        textureHeight = 32;

        sash = new ModelRenderer(this);
        sash.setRotationPoint(0.0F, 0.0F, 0.0F);
        sash.setTextureOffset(23, 0).addBox(-0.2775F, 6.5517F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        sash.setTextureOffset(24, 21).addBox(-1.7416F, 6.5517F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        fourth_scarf = new ModelRenderer(this);
        fourth_scarf.setRotationPoint(-1.5F, 10.5F, -3.5F);
        sash.addChild(fourth_scarf);
        fourth_scarf.setTextureOffset(23, 10).addBox(3.5F, -10.5F, 5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(8, 8).addBox(-1.5F, -10.5F, 5.0F, 6.0F, 2.0F, 1.0F, -0.25F, false);
        fourth_scarf.setTextureOffset(19, 19).addBox(3.5F, -10.5F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(20, 15).addBox(0.5F, -10.5F, 5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(0, 22).addBox(-2.5F, -10.5F, 5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(12, 20).addBox(-2.5F, -10.5F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(0, 25).addBox(-2.75F, -10.75F, 1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(23, 23).addBox(-2.75F, -10.75F, 4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(6, 23).addBox(-2.75F, -10.75F, 3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(12, 24).addBox(3.75F, -10.75F, 1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(22, 7).addBox(3.75F, -10.75F, 4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(17, 22).addBox(3.75F, -10.75F, 3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(8, 11).addBox(3.85F, -10.85F, 2.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);
        fourth_scarf.setTextureOffset(8, 0).addBox(-2.85F, -10.85F, 2.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);

        bends = new ModelRenderer(this);
        bends.setRotationPoint(1.5F, 13.5F, 3.5F);
        fourth_scarf.addChild(bends);


        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0744F, -16.5153F, -2.0F);
        bends.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, 0.5236F);
        bone4.setTextureOffset(24, 5).addBox(-1.0392F, -1.6321F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0744F, -16.5153F, -2.0F);
        bends.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, -0.5236F);
        bone3.setTextureOffset(24, 18).addBox(-1.1062F, -1.716F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-3.0F, -22.0F, 0.5F);
        bends.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, 0.4363F);
        bone2.setTextureOffset(23, 26).addBox(4.3442F, -2.9583F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        bone2.setTextureOffset(25, 3).addBox(4.3442F, -1.3083F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        bone2.setTextureOffset(18, 25).addBox(4.3442F, 0.3917F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        bone2.setTextureOffset(0, 15).addBox(4.3442F, -2.9583F, -3.0F, 2.0F, 6.0F, 1.0F, -0.25F, false);

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-3.0F, -22.0F, 0.5F);
        bends.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.0F, -0.4363F);
        bone.setTextureOffset(26, 16).addBox(-0.9063F, -0.4226F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        bone.setTextureOffset(6, 26).addBox(-0.9063F, 1.2274F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        bone.setTextureOffset(25, 14).addBox(-0.9063F, 2.9274F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        bone.setTextureOffset(6, 16).addBox(-0.9063F, -0.4226F, -3.0F, 2.0F, 6.0F, 1.0F, -0.25F, false);

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
        sash.addChild(bone5);
        bone5.setTextureOffset(18, 13).addBox(-1.5F, -15.9483F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bone5.setTextureOffset(17, 4).addBox(-1.5F, -12.9483F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bone5.setTextureOffset(15, 11).addBox(-1.5F, -9.9483F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bone5.setTextureOffset(15, 0).addBox(-1.5F, -5.4483F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bone5.setTextureOffset(18, 2).addBox(-1.5F, -14.4483F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bone5.setTextureOffset(12, 18).addBox(-1.5F, -11.4483F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bone5.setTextureOffset(8, 5).addBox(-1.5F, -6.9483F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bone5.setTextureOffset(12, 16).addBox(-1.5F, -8.4483F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bone5.setTextureOffset(15, 6).addBox(-1.5F, -3.9483F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bone5.setTextureOffset(0, 0).addBox(-1.5F, -17.4483F, -2.5F, 3.0F, 14.0F, 1.0F, -0.25F, false);
        bipedBody = sash;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        bipedLeftArm.showModel = false;
        bipedRightArm.showModel = false;
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}