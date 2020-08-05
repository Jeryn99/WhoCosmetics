package com.whocraft.whocosmetics.client.models;// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class SatchelModel extends BipedModel {
	private final RendererModel side_bag;
	private final RendererModel strap;

	public SatchelModel() {
		textureWidth = 32;
		textureHeight = 32;

		side_bag = new RendererModel(this);
		side_bag.setRotationPoint(0.0F, 0.0F, 0.0F);
		side_bag.cubeList.add(new ModelBox(side_bag, 12, 0, 3.0F, -0.25F, -2.5F, 1, 1, 5, 0.0F, false));
		side_bag.cubeList.add(new ModelBox(side_bag, 7, 12, -4.9F, 10.0F, -2.5F, 2, 7, 5, 0.0F, false));
		side_bag.cubeList.add(new ModelBox(side_bag, 7, 0, -5.15F, 12.0F, -0.5F, 2, 2, 1, 0.0F, false));

		strap = new RendererModel(this);
		strap.setRotationPoint(3.5F, 0.25F, -2.0F);
		side_bag.addChild(strap);
		setRotationAngle(strap, 0.0F, 0.0F, 0.6109F);
		strap.cubeList.add(new ModelBox(strap, 0, 0, -0.3036F, 0.1228F, -0.5F, 1, 12, 5, 0.0F, false));

		bipedBody = side_bag;
		bipedHeadwear.isHidden = true;
		bipedLeftArm.isHidden = true;
		bipedRightArm.isHidden = true;

	}


	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}