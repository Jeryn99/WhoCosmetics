
package me.craig.software.cosmetics.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class ScarfModel<T extends Entity> extends EntityModel<T> {
	private final ModelPart first_scarf;

	public ScarfModel(ModelPart root) {
		this.first_scarf = root.getChild("first_scarf");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition first_scarf = partdefinition.addOrReplaceChild("first_scarf", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition firsts_scarf = first_scarf.addOrReplaceChild("firsts_scarf", CubeListBuilder.create().texOffs(0, 3).addBox(-2.75F, -10.75F, 0.5F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 6).addBox(-2.75F, -0.75F, 1.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(8, 6).mirror().addBox(2.75F, -2.75F, 1.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 20).addBox(-2.25F, -10.5F, 0.25F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 5).addBox(3.25F, -10.5F, 0.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 14).addBox(2.75F, -10.75F, 0.5F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.5F, -10.5F, 5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-2.75F, -10.75F, 1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(8, 8).addBox(3.75F, -10.75F, 1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(8, 3).addBox(-1.0F, -6.0F, 0.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 10.5F, -3.5F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		first_scarf.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}