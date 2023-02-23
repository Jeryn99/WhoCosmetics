package mc.craig.software.cosmetics.client.models.block;// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mc.craig.software.cosmetics.common.blockentity.WhirlygigBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import net.minecraft.client.model.geom.builders.PartDefinition;

public class WhirlyGigModel extends AnimateBlockEntityModel<WhirlygigBlockEntity> {
    private final ModelPart one;
    private final ModelPart two;
    private final ModelPart three;
    private final ModelPart spinny;

    public static final AnimationDefinition FLIGHT = AnimationDefinition.Builder.withLength(10f).looping()
            .addAnimation("one",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(10f, KeyframeAnimations.degreeVec(0f, 180f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("two",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(10f, KeyframeAnimations.degreeVec(0f, -270f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("three",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(10f, KeyframeAnimations.degreeVec(0f, 360f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    private final ModelPart root;

    public WhirlyGigModel(ModelPart root) {
        this.one = root.getChild("one");
        this.two = root.getChild("two");
        this.three = root.getChild("three");
        this.spinny = root.getChild("spinny");
        this.root = root;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition one = partdefinition.addOrReplaceChild("one", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

        PartDefinition bone276 = one.addOrReplaceChild("bone276", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -19.5F, 0.0F));

        PartDefinition bone277 = bone276.addOrReplaceChild("bone277", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone278 = bone277.addOrReplaceChild("bone278", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone279 = bone278.addOrReplaceChild("bone279", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone280 = bone279.addOrReplaceChild("bone280", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone281 = bone280.addOrReplaceChild("bone281", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone282 = bone281.addOrReplaceChild("bone282", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone283 = bone282.addOrReplaceChild("bone283", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone284 = bone283.addOrReplaceChild("bone284", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone285 = bone284.addOrReplaceChild("bone285", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone286 = bone285.addOrReplaceChild("bone286", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone287 = bone286.addOrReplaceChild("bone287", CubeListBuilder.create().texOffs(66, 66).addBox(-5.0F, -4.5F, 15.0F, 10.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone288 = one.addOrReplaceChild("bone288", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

        PartDefinition bone289 = bone288.addOrReplaceChild("bone289", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone290 = bone289.addOrReplaceChild("bone290", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone291 = bone290.addOrReplaceChild("bone291", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone292 = bone291.addOrReplaceChild("bone292", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone293 = bone292.addOrReplaceChild("bone293", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone294 = bone293.addOrReplaceChild("bone294", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone295 = bone294.addOrReplaceChild("bone295", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone296 = bone295.addOrReplaceChild("bone296", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone297 = bone296.addOrReplaceChild("bone297", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone298 = bone297.addOrReplaceChild("bone298", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone299 = bone298.addOrReplaceChild("bone299", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 8.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition two = partdefinition.addOrReplaceChild("two", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

        PartDefinition bone270 = two.addOrReplaceChild("bone270", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -29.5F, 0.0F));

        PartDefinition bone271 = bone270.addOrReplaceChild("bone271", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone272 = bone271.addOrReplaceChild("bone272", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone25 = bone272.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone27 = bone26.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone28 = bone27.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone29 = bone28.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone30 = bone29.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone32 = bone31.addOrReplaceChild("bone32", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone33 = bone32.addOrReplaceChild("bone33", CubeListBuilder.create().texOffs(47, 43).addBox(-6.5F, -6.5F, 17.0F, 13.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone34 = two.addOrReplaceChild("bone34", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, -32.25F, 0.0F, 0.0F, -0.2618F, 0.0F));

        PartDefinition bone35 = bone34.addOrReplaceChild("bone35", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone36 = bone35.addOrReplaceChild("bone36", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone37 = bone36.addOrReplaceChild("bone37", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone38 = bone37.addOrReplaceChild("bone38", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone39 = bone38.addOrReplaceChild("bone39", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone40 = bone39.addOrReplaceChild("bone40", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone41 = bone40.addOrReplaceChild("bone41", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone42 = bone41.addOrReplaceChild("bone42", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone43 = bone42.addOrReplaceChild("bone43", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone44 = bone43.addOrReplaceChild("bone44", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone45 = bone44.addOrReplaceChild("bone45", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 16.5F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition three = partdefinition.addOrReplaceChild("three", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

        PartDefinition bone264 = three.addOrReplaceChild("bone264", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -43.5F, 0.0F));

        PartDefinition bone265 = bone264.addOrReplaceChild("bone265", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone46 = bone265.addOrReplaceChild("bone46", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone47 = bone46.addOrReplaceChild("bone47", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone48 = bone47.addOrReplaceChild("bone48", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone49 = bone48.addOrReplaceChild("bone49", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone50 = bone49.addOrReplaceChild("bone50", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone51 = bone50.addOrReplaceChild("bone51", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone52 = bone51.addOrReplaceChild("bone52", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone53 = bone52.addOrReplaceChild("bone53", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone54 = bone53.addOrReplaceChild("bone54", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone55 = bone54.addOrReplaceChild("bone55", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F, -4.5F, 25.0F, 18.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone56 = three.addOrReplaceChild("bone56", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, -44.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

        PartDefinition bone57 = bone56.addOrReplaceChild("bone57", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone58 = bone57.addOrReplaceChild("bone58", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone59 = bone58.addOrReplaceChild("bone59", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone60 = bone59.addOrReplaceChild("bone60", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone61 = bone60.addOrReplaceChild("bone61", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone62 = bone61.addOrReplaceChild("bone62", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone63 = bone62.addOrReplaceChild("bone63", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone64 = bone63.addOrReplaceChild("bone64", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone65 = bone64.addOrReplaceChild("bone65", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone66 = bone65.addOrReplaceChild("bone66", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone67 = bone66.addOrReplaceChild("bone67", CubeListBuilder.create().texOffs(37, 66).addBox(-1.0F, -4.5F, 24.75F, 2.0F, 13.0F, 12.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition spinny = partdefinition.addOrReplaceChild("spinny", CubeListBuilder.create(), PartPose.offset(0.0F, 88.0F, 0.0F));

        PartDefinition bone181 = spinny.addOrReplaceChild("bone181", CubeListBuilder.create().texOffs(57, 30).addBox(-4.0F, -6.5F, -0.175F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -59.5F, 0.0F));

        PartDefinition bone247 = bone181.addOrReplaceChild("bone247", CubeListBuilder.create().texOffs(57, 30).addBox(-4.0F, -6.5F, -0.175F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone248 = bone247.addOrReplaceChild("bone248", CubeListBuilder.create().texOffs(57, 30).addBox(-4.0F, -6.5F, -0.175F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone249 = bone248.addOrReplaceChild("bone249", CubeListBuilder.create().texOffs(57, 30).addBox(-4.0F, -6.5F, -0.175F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone250 = bone249.addOrReplaceChild("bone250", CubeListBuilder.create().texOffs(57, 30).addBox(-4.0F, -6.5F, -0.175F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone251 = bone250.addOrReplaceChild("bone251", CubeListBuilder.create().texOffs(57, 30).addBox(-4.0F, -6.5F, -0.175F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone68 = spinny.addOrReplaceChild("bone68", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -107.5F, 0.0F));

        PartDefinition bone69 = bone68.addOrReplaceChild("bone69", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone70 = bone69.addOrReplaceChild("bone70", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone71 = bone70.addOrReplaceChild("bone71", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone72 = bone71.addOrReplaceChild("bone72", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone73 = bone72.addOrReplaceChild("bone73", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone74 = bone73.addOrReplaceChild("bone74", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone75 = bone74.addOrReplaceChild("bone75", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone76 = bone75.addOrReplaceChild("bone76", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone77 = bone76.addOrReplaceChild("bone77", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone78 = bone77.addOrReplaceChild("bone78", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone79 = bone78.addOrReplaceChild("bone79", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -4.5F, -1.0F, 18.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone252 = spinny.addOrReplaceChild("bone252", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -6.5F, 7.765F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -59.5F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone253 = bone252.addOrReplaceChild("bone253", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -6.5F, 7.765F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone254 = bone253.addOrReplaceChild("bone254", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -6.5F, 7.765F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone255 = bone254.addOrReplaceChild("bone255", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -6.5F, 7.765F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone256 = bone255.addOrReplaceChild("bone256", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -6.5F, 7.765F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone257 = bone256.addOrReplaceChild("bone257", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -6.5F, 7.765F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone258 = spinny.addOrReplaceChild("bone258", CubeListBuilder.create(), PartPose.offset(0.0F, -53.5F, 0.0F));

        PartDefinition cube_r1 = bone258.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone2 = bone258.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r5 = bone5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r6 = bone6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r7 = bone7.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r8 = bone8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r9 = bone9.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r10 = bone10.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r11 = bone11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone12 = bone11.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r12 = bone12.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone13 = spinny.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -53.5F, 0.0F, 0.0F, -0.2618F, 0.0F));

        PartDefinition cube_r13 = bone13.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r14 = bone14.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone15 = bone14.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r15 = bone15.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r16 = bone16.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r17 = bone17.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r18 = bone18.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone19 = bone18.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r19 = bone19.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone20 = bone19.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r20 = bone20.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone21 = bone20.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r21 = bone21.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r22 = bone22.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone23 = bone22.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r23 = bone23.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bone24 = bone23.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r24 = bone24.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, -16.0F, -0.7854F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }


    @Override
    public void renderToBuffer(WhirlygigBlockEntity blockEntity, PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        this.root().getAllParts().forEach(ModelPart::resetPose);
        animate(blockEntity.FLY, FLIGHT, Minecraft.getInstance().player.tickCount);

        one.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        two.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        three.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        spinny.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return root;
    }
}