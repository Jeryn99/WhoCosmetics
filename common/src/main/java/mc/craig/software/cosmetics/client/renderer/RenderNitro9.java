package mc.craig.software.cosmetics.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import mc.craig.software.cosmetics.common.WCBlocks;
import mc.craig.software.cosmetics.common.entity.Nitro9Entity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TntMinecartRenderer;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.block.Blocks;

@Environment(EnvType.CLIENT)
public class RenderNitro9 extends EntityRenderer<Nitro9Entity> {
    private final BlockRenderDispatcher blockRenderer;

    public RenderNitro9(EntityRendererProvider.Context context) {
        super(context);
        this.shadowRadius = 0.5F;
        this.blockRenderer = context.getBlockRenderDispatcher();
    }

    @Override
    public void render(Nitro9Entity entity, float entityYaw, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int packedLight) {
        matrixStack.pushPose();
        matrixStack.translate(0.0, 0.5, 0.0);
        int fuseTime = entity.getFuse();
        if ((float)fuseTime - partialTicks + 1.0F < 10.0F) {
            float f = 1.0F - ((float)fuseTime - partialTicks + 1.0F) / 10.0F;
            f = Mth.clamp(f, 0.0F, 1.0F);
            f *= f;
            f *= f;
            float g = 1.0F + f * 0.3F;
            matrixStack.scale(g, g, g);
        }

        matrixStack.mulPose(Axis.YP.rotationDegrees(-90.0F));

        // Calculate the amount of translation along the Y-axis
        float yOffset = (float)Math.sin(entity.tickCount + partialTicks) * 0.05f;
        matrixStack.translate(-0.5, -0.5 + yOffset, 0.5); // Move the matrix along the Y-axis based on the calculated offset

        matrixStack.mulPose(Axis.YP.rotationDegrees(90.0F));
        TntMinecartRenderer.renderWhiteSolidBlock(this.blockRenderer, WCBlocks.NITRO_9.get().defaultBlockState(), matrixStack, buffer, packedLight, fuseTime / 5 % 2 == 0);
        matrixStack.popPose();
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }


    /**
     * Returns the location of an entity's texture.
     */
    @Override
    public ResourceLocation getTextureLocation(Nitro9Entity entity) {
        return TextureAtlas.LOCATION_BLOCKS;
    }
}
