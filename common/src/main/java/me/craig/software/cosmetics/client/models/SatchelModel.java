package me.craig.software.cosmetics.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class SatchelModel<T extends Entity> extends EntityModel<T> {
	private final ModelPart side_bag;

	public SatchelModel(ModelPart root) {
		this.side_bag = root.getChild("side_bag");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition side_bag = partdefinition.addOrReplaceChild("side_bag", CubeListBuilder.create().texOffs(12, 0).addBox(3.0F, -0.25F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(7, 12).addBox(-4.9F, 10.0F, -2.5F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(7, 0).addBox(-5.15F, 12.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition strap = side_bag.addOrReplaceChild("strap", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3036F, 0.1228F, -0.5F, 1.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 0.25F, -2.0F, 0.0F, 0.0F, 0.6109F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		side_bag.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}