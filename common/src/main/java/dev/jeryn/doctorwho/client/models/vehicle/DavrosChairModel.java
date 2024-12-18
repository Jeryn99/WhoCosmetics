package dev.jeryn.doctorwho.client.models.vehicle;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.jeryn.doctorwho.common.entity.DavrosChair;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class DavrosChairModel extends EntityModel<DavrosChair> {

    private final ModelPart bone;

    public DavrosChairModel(ModelPart root) {
        this.bone = root.getChild("bone");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 13.0F, -9.5F, 13.0F, 12.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-5.0F, 25.0F, -11.0F, 15.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(41, 28).addBox(-2.0F, 9.0F, 2.5F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 51).addBox(-3.0F, 9.0F, -3.5F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(25, 47).addBox(7.0F, 9.0F, -3.5F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 20).addBox(-5.0F, 11.025F, -5.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 11).addBox(6.0F, 11.025F, -5.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(41, 20).addBox(-5.0F, 11.025F, -10.5F, 15.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(14, 47).addBox(0.0F, 10.525F, -10.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(52, 51).addBox(5.5F, 10.525F, -10.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(6.0F, 10.425F, -9.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(47, 12).addBox(0.5F, 10.775F, -6.75F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 6).addBox(3.25F, 10.025F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-3.75F, 10.025F, -9.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).addBox(-3.5F, 10.0F, 2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).mirror().addBox(5.5F, 10.0F, 2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, -4.0F, 3.0F));

        PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 59).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 10.0F, 3.5F, 0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(-1.0F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, 10.0F, -1.5F, 0.0F, 0.0F, -0.2182F));

        PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 47).addBox(0.0F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 10.0F, -1.5F, 0.0F, 0.0F, 0.2182F));

        PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(2.5F, 14.0F, -9.5F));

        PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 53).addBox(-4.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 53).addBox(-0.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 53).addBox(3.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r5 = bone4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 53).addBox(0.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 53).addBox(-4.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r6 = bone4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 53).addBox(0.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 53).addBox(-4.5F, 0.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(2.5F, 14.0F, 4.5F));

        PartDefinition cube_r7 = bone5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(14, 53).addBox(-4.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 53).addBox(-0.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 53).addBox(3.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r8 = bone5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 53).addBox(0.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 53).addBox(-4.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 8.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r9 = bone5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 53).addBox(0.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 53).addBox(-4.5F, 0.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(9.0F, 14.0F, -2.0F));

        PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(43, 35).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -0.5F, 0.0F, 0.0F, -0.3491F));

        PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-4.0F, 14.0F, -2.0F));

        PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(0.0F, 0.0F, -6.0F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

        PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(0.0F, 0.0F, -6.0F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

        PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(43, 35).mirror().addBox(0.0F, 0.0F, -6.0F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, -0.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition bone9 = bone.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(47, 0).addBox(-4.5F, -9.0F, -2.0F, 9.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 9.0F, 3.5F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone8 = bone.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(11, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(11, 0).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 10.525F, -9.0F, -0.7418F, 0.0F, 0.0F));

        PartDefinition bone7 = bone.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(41, 20).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.25F, 10.025F, -7.75F, -0.5236F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(DavrosChair entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }
}