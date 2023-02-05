package mc.craig.software.cosmetics.client.models.vehicle;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class SlimSpaceSuitModel<T extends Entity> extends HumanoidModel {

    public SlimSpaceSuitModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static LayerDefinition createLayer(boolean isFeet) {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F))
				.texOffs(0, 69).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F))
				.texOffs(32, 70).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.75F))
				.texOffs(26, 71).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, 8.0F, 2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(28, 28).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(52, 44).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(52, 28).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(36, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(20, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(44, 12).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		if(isFeet) {
			PartDefinition RightBoot = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(60, 16).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.01F))
					.texOffs(10, 60).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.26F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

			PartDefinition LeftBoot = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(42, 60).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.01F))
					.texOffs(26, 60).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.26F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		}

		return LayerDefinition.create(meshdefinition, 128, 128);
    }

}