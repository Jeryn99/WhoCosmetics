package me.suff.mc.wc.client;

import com.mojang.blaze3d.matrix.MatrixStack;
import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.client.models.tiles.WardrobeModel;
import me.suff.mc.wc.common.block.WardrobeBlock;
import me.suff.mc.wc.common.tiles.WardrobeTile;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

/* Created by Craig on 14/03/2021 */
public class RenderWardrobe extends TileEntityRenderer< WardrobeTile > {

    private static WardrobeModel wardrobeModel = new WardrobeModel();
    private static ResourceLocation texture = new ResourceLocation(WhoCosmetics.MODID, "textures/wardrobe.png");

    public RenderWardrobe(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(WardrobeTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        matrixStackIn.push();
        matrixStackIn.translate(0.5, 0, 0.5);
        matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
        matrixStackIn.translate(0, -1.5, 0);
        BlockState blockstate = tileEntityIn.getBlockState();
        float rotation = 22.5F * (float) blockstate.get(WardrobeBlock.ROTATION);
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(rotation));


        matrixStackIn.push();
        float renderOffset = -1.5F;
        matrixStackIn.translate(0, -2, -0.5);
        for (int i = 0; i < 9; i++) {
            matrixStackIn.push();
            matrixStackIn.scale(0.5F, 0.5F, 0.5F);
            matrixStackIn.translate(renderOffset, 3.5, 0.8);
            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
            matrixStackIn.rotate(Vector3f.YN.rotationDegrees(90));
            Minecraft.getInstance().getItemRenderer().renderItem(tileEntityIn.getStackInSlot(i), ItemCameraTransforms.TransformType.FIXED, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
            renderOffset += 0.06125 * 6;
            matrixStackIn.pop();
        }
        matrixStackIn.pop();


        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180));
        wardrobeModel.Left.rotateAngleY = (tileEntityIn.getOpenAmount() * ((float) Math.PI / 2F));
        wardrobeModel.Right.rotateAngleY = -(tileEntityIn.getOpenAmount() * ((float) Math.PI / 2F));
        wardrobeModel.render(matrixStackIn, bufferIn.getBuffer(RenderType.getEntityTranslucent(texture)), combinedLightIn, combinedOverlayIn, 1, 1, 1, 1);
        matrixStackIn.pop();


    }
}
