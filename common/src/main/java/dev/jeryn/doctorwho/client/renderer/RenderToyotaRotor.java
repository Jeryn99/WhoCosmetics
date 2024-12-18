package dev.jeryn.doctorwho.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.client.models.ModelRegistration;
import dev.jeryn.doctorwho.client.models.block.ToyotaRotorModel;
import dev.jeryn.doctorwho.common.blockentity.ToyotaRotorBlockEntity;
import dev.jeryn.doctorwho.common.blocks.FacingEntityBlock;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;

public class RenderToyotaRotor implements BlockEntityRenderer<ToyotaRotorBlockEntity>, BlockEntityRendererProvider<ToyotaRotorBlockEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(WhoCosmetics.MOD_ID, "textures/block/toyota_rotor.png");
    private final ToyotaRotorModel toyotaRotorModel;

    public RenderToyotaRotor(Context context) {
        toyotaRotorModel = new ToyotaRotorModel(context.bakeLayer(ModelRegistration.TOYOTA_ROTOR));
    }

    @Override
    public void render(ToyotaRotorBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        poseStack.pushPose();
        poseStack.translate(0.5D, 1.5, 0.5D);

        BlockState blockstate = blockEntity.getBlockState();
        poseStack.mulPose(Axis.ZP.rotationDegrees(180));
        poseStack.mulPose(Axis.YP.rotationDegrees(blockstate.getValue(FacingEntityBlock.ROTATION).floatValue() * 22.5F));
        toyotaRotorModel.renderToBuffer(blockEntity, poseStack, bufferSource.getBuffer(RenderType.entityTranslucent(TEXTURE)), packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
        poseStack.popPose();
    }


    @Override
    public BlockEntityRenderer<ToyotaRotorBlockEntity> create(Context context) {
        return new RenderToyotaRotor(context);
    }
}
