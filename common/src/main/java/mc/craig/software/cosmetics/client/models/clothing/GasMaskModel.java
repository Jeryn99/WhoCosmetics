package mc.craig.software.cosmetics.client.models.clothing;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class GasMaskModel<T extends Entity> extends HumanoidModel {

	public GasMaskModel(ModelPart modelPart) {
		super(modelPart);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gas_mask = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(24, 24).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));


		PartDefinition bipedHead_r1 = gas_mask.addOrReplaceChild("bipedHead_r1", CubeListBuilder.create().texOffs(2, 45).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, -1.0F, -5.0F, 0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}