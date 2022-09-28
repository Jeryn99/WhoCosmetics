package me.craig.software.cosmetics.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class StickOfCeleryModel<T extends Entity> extends EntityModel<T> {
	private final ModelPart celery;

	public StickOfCeleryModel(ModelPart root) {
		this.celery = root.getChild("celery");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition celery = partdefinition.addOrReplaceChild("celery", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition celery_stick = celery.addOrReplaceChild("celery_stick", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(7, 2).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(0, 5).addBox(-0.6F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(4, 0).addBox(-0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(4, 6).addBox(-0.5F, -1.55F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(3, 3).addBox(-0.5F, -1.45F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.8764F, 1.6048F, -2.15F, 0.0F, 0.0F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		celery.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}