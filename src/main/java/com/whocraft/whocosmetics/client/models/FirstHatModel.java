package com.whocraft.whocosmetics.client.models;


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class FirstHatModel extends BipedModel {
	private final RendererModel first_fez;
	private final RendererModel first_hat;
	private final RendererModel tasel;

	public FirstHatModel() {
		textureWidth = 16;
		textureHeight = 16;

		first_fez = new RendererModel(this);
		first_fez.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		first_hat = new RendererModel(this);
		first_hat.setRotationPoint(0.25F, -8.25F, 0.5F);
		first_fez.addChild(first_hat);
		setRotationAngle(first_hat, -0.384F, 0.0F, 0.0F);
		first_hat.cubeList.add(new ModelBox(first_hat, 0, 0, -3.75F, -3.0F, 0.75F, 3, 3, 3, 0.0F, false));

		tasel = new RendererModel(this);
		tasel.setRotationPoint(-2.25F, -3.25F, 2.25F);
		first_hat.addChild(tasel);
		tasel.cubeList.add(new ModelBox(tasel, 6, 7, 0.4F, 0.1F, -1.25F, 1, 1, 2, 0.0F, false));
		tasel.cubeList.add(new ModelBox(tasel, 6, 7, -1.4F, 0.1F, -1.25F, 1, 1, 2, 0.0F, false));
		tasel.cubeList.add(new ModelBox(tasel, 0, 9, 0.4F, 0.1F, 0.65F, 1, 3, 1, 0.0F, false));
		tasel.cubeList.add(new ModelBox(tasel, 0, 9, -1.4F, 0.1F, 0.65F, 1, 3, 1, 0.0F, false));
		bipedHead = first_fez;
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