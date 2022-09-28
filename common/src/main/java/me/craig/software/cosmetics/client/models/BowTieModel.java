package me.craig.software.cosmetics.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class BowTieModel<T extends Entity> extends HumanoidModel<LivingEntity> {
    public BowTieModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bowties = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bowtie = bowties.addOrReplaceChild("bowtie", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -23.0F, -2.75F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.5F, -23.0F, -2.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 3).addBox(-0.5F, -23.0F, -2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.5F, 0.0F));

        PartDefinition angle2 = bowtie.addOrReplaceChild("angle2", CubeListBuilder.create().texOffs(0, 4).addBox(-0.55F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 2).addBox(-2.45F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -2.25F, 0.0F, 0.0F, -0.1745F));

        PartDefinition angle = bowtie.addOrReplaceChild("angle", CubeListBuilder.create().texOffs(0, 6).addBox(-0.55F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 7).addBox(-2.45F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -2.25F, 0.0F, 0.0F, 0.1745F));

        return LayerDefinition.create(meshdefinition, 16, 16);
    }

}