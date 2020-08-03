package com.whocraft.whocosmetics.client.models;// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class StetsonModel extends BipedModel {
	private final RendererModel stetson;
	private final RendererModel hats;

	public StetsonModel() {
		Predicate<RendererModel> isHead = m -> m == bipedHead;
		textureWidth = 64;
		textureHeight = 64;

		stetson = new RendererModel(this);
		stetson.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		hats = new RendererModel(this);
		hats.setRotationPoint(5.5F, -7.25F, 0.5F);
		stetson.addChild(hats);
		hats.cubeList.add(new ModelBox(hats, 0, 0, -10.0F, 0.25F, -6.0F, 9, 1, 11, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 20, 38, -9.5F, -0.75F, -4.75F, 8, 1, 1, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 0, 12, -9.5F, -1.75F, -4.5F, 8, 1, 8, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 8, 15, -8.5F, -2.0F, 1.25F, 6, 1, 2, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 8, 15, -8.5F, -2.0F, -4.25F, 6, 1, 2, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 20, 21, -9.0F, -2.25F, -3.5F, 7, 1, 6, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 10, 30, -7.0F, -2.75F, -3.5F, 3, 1, 6, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 39, 0, -8.0F, -3.0F, -3.5F, 1, 1, 6, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 24, 12, -4.0F, -3.0F, -3.5F, 1, 1, 6, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 29, 0, -9.75F, -0.75F, -4.5F, 1, 1, 8, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 32, 19, -9.5F, -0.75F, 2.75F, 8, 1, 1, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 0, 30, -2.25F, -0.75F, -4.5F, 1, 1, 8, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 19, 28, -1.0F, 0.25F, -5.0F, 1, 1, 9, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 19, 28, -11.0F, 0.25F, -5.0F, 1, 1, 9, 0.0F, true));
		hats.cubeList.add(new ModelBox(hats, 32, 9, -11.5F, -0.25F, -4.5F, 1, 1, 8, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 30, 28, -0.5F, -0.25F, -4.5F, 1, 1, 8, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 11, 38, -12.0F, -1.0F, -4.0F, 1, 1, 7, 0.0F, false));
		hats.cubeList.add(new ModelBox(hats, 32, 37, 0.0F, -1.0F, -4.0F, 1, 1, 7, 0.0F, false));
		bipedHead = stetson;
	}

	@Override
	public void render(LivingEntity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
		super.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
		bipedHeadwear.isHidden = true;
	}


	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}