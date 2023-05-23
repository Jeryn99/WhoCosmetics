package mc.craig.software.cosmetics.client.models.block;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mc.craig.software.cosmetics.common.blockentity.ClassicDoorsBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class ClassicDoorsModel extends HierarchicalModel {


    public static final AnimationDefinition OPENING = AnimationDefinition.Builder.withLength(5f)
            .addAnimation("left_door",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 125f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(5f, KeyframeAnimations.degreeVec(0f, 125f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("right_door",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(3f, KeyframeAnimations.degreeVec(0f, -
                                    125f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(5f, KeyframeAnimations.degreeVec(0f, -
                                    125f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM))).build();

    public static final AnimationDefinition CLOSING = AnimationDefinition.Builder.withLength(3f)
            .addAnimation("left_door",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 125f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("right_door",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -
                                    125f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM))).build();

    private final ModelPart classic_doors;
    private final ModelPart root;

    public ClassicDoorsModel(ModelPart root) {
        this.root = root;
        this.classic_doors = root.getChild("classic_doors");

    }


    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition classic_doors = partdefinition.addOrReplaceChild("classic_doors", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition left_door = classic_doors.addOrReplaceChild("left_door", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, -48.0F, 0.0F, 16.0F, 48.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, 0.0F, -8.0F));

        PartDefinition right_door = classic_doors.addOrReplaceChild("right_door", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -48.0F, 0.0F, 16.0F, 48.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(16.0F, 0.0F, -8.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        classic_doors.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void renderToBuffer(ClassicDoorsBlockEntity classicDoorsBlockEntity, PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        animate(classicDoorsBlockEntity.ANIM_OPEN, OPENING, Minecraft.getInstance().player.tickCount);
        classic_doors.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return root;
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }
}