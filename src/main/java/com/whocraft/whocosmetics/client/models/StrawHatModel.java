package com.whocraft.whocosmetics.client.models;


import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class StrawHatModel extends BipedModel<LivingEntity> {
	private final RendererModel seven_hat;
	private final RendererModel seventh_hat;

	public StrawHatModel() {
		textureWidth = 64;
		textureHeight = 64;

		seven_hat = new RendererModel(this);
		seven_hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		seventh_hat = new RendererModel(this);
		seventh_hat.setRotationPoint(0.25F, -10.5F, -1.5F);
		seven_hat.addChild(seventh_hat);
		seventh_hat.cubeList.add(new ModelBox(seventh_hat, 0, 0, -5.25F, 3.5F, -3.5F, 10, 1, 10, 0.0F, false));
		seventh_hat.cubeList.add(new ModelBox(seventh_hat, 0, 11, -4.75F, 2.5F, -3.0F, 9, 1, 9, 0.0F, false));
		seventh_hat.cubeList.add(new ModelBox(seventh_hat, 24, 24, -4.25F, 1.75F, -2.5F, 8, 1, 8, 0.0F, false));
		seventh_hat.cubeList.add(new ModelBox(seventh_hat, 0, 21, -4.25F, 0.75F, -2.5F, 8, 1, 8, 0.0F, false));
		seventh_hat.cubeList.add(new ModelBox(seventh_hat, 27, 11, -3.25F, 0.5F, -2.5F, 6, 1, 8, 0.0F, false));
		seventh_hat.cubeList.add(new ModelBox(seventh_hat, 17, 33, 2.75F, 0.5F, -1.5F, 1, 1, 6, 0.0F, false));
		seventh_hat.cubeList.add(new ModelBox(seventh_hat, 9, 30, -4.25F, 0.5F, -1.5F, 1, 1, 6, 0.0F, false));
		seventh_hat.cubeList.add(new ModelBox(seventh_hat, 30, 0, -0.75F, 0.0F, -2.0F, 1, 1, 7, 0.0F, true));
		bipedHead = seven_hat;
	}

	@Override
	public void render(LivingEntity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
		GlStateManager.pushMatrix();
		GlStateManager.translatef(0F, 0.1F , 0F);
		GlStateManager.scalef(1.1F, 1.1F, 1.1F);
		super.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
		bipedHeadwear.isHidden = true;
		GlStateManager.popMatrix();
	}

}