package dev.jeryn.doctorwho.client.models.block;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class TenthDoctorChairModel extends EntityModel {
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone5;
    private final ModelPart bone4;
    private final ModelPart bb_main;

    public TenthDoctorChairModel(ModelPart root) {
        this.bone2 = root.getChild("bone2");
        this.bone3 = root.getChild("bone3");
        this.bone5 = root.getChild("bone5");
        this.bone4 = root.getChild("bone4");
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(46, 27).addBox(-6.5F, 0.0F, -2.5F, 13.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.5F, -5.5F, 0.3927F, 0.0F, 0.0F));

        PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 44).addBox(-6.5F, -14.5F, -2.0F, 13.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.5F, 6.0F, -0.3054F, 0.0F, 0.0F));

        PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, -1.0F, -11.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(38, 16).addBox(-1.0F, 0.5F, -9.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(47, 55).addBox(-3.0F, -0.5F, -7.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 13.0F, 5.5F, 0.0F, 0.1309F, 0.0F));

        PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(44, 0).addBox(-5.0F, -7.5F, 0.0F, 12.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(31, 47).addBox(-4.0F, -3.5F, -1.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -2.5F, 0.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-12.0F, -1.0F, -11.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 16).mirror().addBox(-7.0F, 0.5F, -9.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(47, 55).mirror().addBox(0.0F, -0.5F, -7.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.0F, 13.0F, 5.5F, 0.0F, -0.1309F, 0.0F));

        PartDefinition bone7 = bone4.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-7.0F, -7.5F, 0.0F, 12.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(31, 47).mirror().addBox(-1.0F, -3.5F, -1.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -2.5F, 0.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(37, 34).addBox(-5.0F, -2.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-1.5F, -10.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 16).addBox(-6.5F, -11.5F, -5.5F, 13.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(50, 47).addBox(-1.5F, -7.5F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.5F))
                .texOffs(0, 16).addBox(-4.5F, -6.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-7.5F, -13.0F, -7.0F, 15.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }
}