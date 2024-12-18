package dev.jeryn.doctorwho.client.models.vehicle;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class StickOfCeleryModel<T extends Entity> extends HumanoidModel {
	public StickOfCeleryModel(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition celery = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));


		PartDefinition celery_stick = celery.addOrReplaceChild("celery_stick", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(7, 2).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(0, 5).addBox(-0.6F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(4, 0).addBox(-0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(4, 6).addBox(-0.5F, -1.55F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(3, 3).addBox(-0.5F, -1.45F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.8764F, 1.6048F, -2.15F, 0.0F, 0.0F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

}