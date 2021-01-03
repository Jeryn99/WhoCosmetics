package com.whocraft.whocosmetics.client.models;


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class SatchelModel extends BipedModel<LivingEntity> {
    private final ModelRenderer side_bag;
    private final ModelRenderer strap;

    public SatchelModel() {
    	super(0);
		textureWidth = 32;
		textureHeight = 32;

		side_bag = new ModelRenderer(this);
		side_bag.setRotationPoint(0.0F, 0.0F, 0.0F);
		side_bag.setTextureOffset(12, 0).addBox(3.0F, -0.25F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		side_bag.setTextureOffset(7, 12).addBox(-4.9F, 10.0F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);
		side_bag.setTextureOffset(7, 0).addBox(-5.15F, 12.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		strap = new ModelRenderer(this);
		strap.setRotationPoint(3.5F, 0.25F, -2.0F);
		side_bag.addChild(strap);
		setRotationAngle(strap, 0.0F, 0.0F, 0.6109F);
		strap.setTextureOffset(0, 0).addBox(-0.3036F, 0.1228F, -0.5F, 1.0F, 12.0F, 5.0F, 0.0F, false);

        bipedBody = side_bag;
        bipedHeadwear.showModel = false;
        bipedLeftArm.showModel = false;
        bipedRightArm.showModel = false;

    }


    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}