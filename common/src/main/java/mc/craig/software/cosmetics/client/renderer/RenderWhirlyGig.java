package mc.craig.software.cosmetics.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.client.models.ModelRegistration;
import mc.craig.software.cosmetics.client.models.block.ToyotaRotorModel;
import mc.craig.software.cosmetics.client.models.block.WhirlyGigModel;
import mc.craig.software.cosmetics.common.blockentity.ToyotaRotorBlockEntity;
import mc.craig.software.cosmetics.common.blockentity.WhirlygigBlockEntity;
import mc.craig.software.cosmetics.common.blocks.CoralChairBlock;
import mc.craig.software.cosmetics.common.blocks.FacingEntityBlock;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.BlockState;

public class RenderWhirlyGig implements BlockEntityRenderer<WhirlygigBlockEntity>, BlockEntityRendererProvider<WhirlygigBlockEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(WhoCosmetics.MOD_ID, "textures/block/whirlygig.png");
    private static final ResourceLocation TEXTURE_GLOW = new ResourceLocation(WhoCosmetics.MOD_ID, "textures/block/whirlygig_glow.png");
    private final WhirlyGigModel whirlyGigModel;

    public RenderWhirlyGig(Context context) {
        whirlyGigModel = new WhirlyGigModel(context.bakeLayer(ModelRegistration.WHIRLYGIG));
    }

    @Override
    public void render(WhirlygigBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        poseStack.pushPose();
        poseStack.translate(0.5D, 1.5, 0.5D);
        poseStack.mulPose(Axis.ZP.rotationDegrees(180));
      //  poseStack.mulPose(Axis.YP.rotationDegrees(blockstate.getValue(FacingEntityBlock.ROTATION).floatValue() * 22.5F));
        whirlyGigModel.renderToBuffer(blockEntity, poseStack, bufferSource.getBuffer(RenderType.entityTranslucent(TEXTURE)), packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);

        poseStack.pushPose();
        whirlyGigModel.renderToBuffer(blockEntity, poseStack, bufferSource.getBuffer(RenderType.entityTranslucentEmissive(TEXTURE_GLOW)), 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1F);
        poseStack.popPose();

        poseStack.popPose();
    }


    @Override
    public BlockEntityRenderer<WhirlygigBlockEntity> create(Context context) {
        return new RenderWhirlyGig(context);
    }
}
