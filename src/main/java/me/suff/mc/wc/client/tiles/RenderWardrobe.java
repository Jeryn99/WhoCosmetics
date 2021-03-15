package me.suff.mc.wc.client.tiles;

import com.mojang.blaze3d.matrix.MatrixStack;
import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.client.models.tiles.WardrobeModel;
import me.suff.mc.wc.common.block.WardrobeBlock;
import me.suff.mc.wc.common.tiles.WardrobeTile;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MobEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

import javax.annotation.Nullable;

/* Created by Craig on 14/03/2021 */
public class RenderWardrobe extends TileEntityRenderer< WardrobeTile > {

    private static WardrobeModel wardrobeModel = new WardrobeModel();
    private static ResourceLocation texture = new ResourceLocation(WhoCosmetics.MODID, "textures/wardrobe.png");
    BipedModel armorModel = new BipedModel(0.5F);
    BipedModel armorModelFeet = new BipedModel(1.0F);

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
        matrixStackIn.translate(0.4, -2, -0.7);
        for (int i = 0; i < 9; i++) {
            matrixStackIn.push();
            matrixStackIn.scale(0.8F, 0.8F, 0.8F);
            matrixStackIn.translate(renderOffset, 2.5, 0.8);
            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
            matrixStackIn.rotate(Vector3f.YN.rotationDegrees(90));
            Minecraft.getInstance().getItemRenderer().renderItem(tileEntityIn.getStackInSlot(i), ItemCameraTransforms.TransformType.FIXED, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
            renderOffset += 0.06125 * 4;
            matrixStackIn.pop();
        }
        matrixStackIn.pop();

        float armorRenderOffset = 0.5F;
        armorModel.isChild = false;
        armorModel.setVisible(false);
        armorModel.bipedLeftLeg.showModel = true;
        armorModel.bipedRightLeg.showModel = true;

        armorModelFeet.isChild = false;
        armorModelFeet.setVisible(false);
        armorModelFeet.bipedLeftLeg.showModel = true;
        armorModelFeet.bipedRightLeg.showModel = true;

        renderStackModel(matrixStackIn, tileEntityIn.getStackInSlot(9), new float[]{armorRenderOffset, -0.2F, 0}, bufferIn, combinedLightIn, combinedOverlayIn);
        renderStackModel(matrixStackIn, tileEntityIn.getStackInSlot(10), new float[]{armorRenderOffset, -0.2F, 0}, bufferIn, combinedLightIn, combinedOverlayIn);
        renderStackModel(matrixStackIn, tileEntityIn.getStackInSlot(11), new float[]{-armorRenderOffset, -0.2F, 0}, bufferIn, combinedLightIn, combinedOverlayIn);
        renderStackModel(matrixStackIn, tileEntityIn.getStackInSlot(12), new float[]{-armorRenderOffset, -0.2F, 0}, bufferIn, combinedLightIn, combinedOverlayIn);


        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180));
        wardrobeModel.Left.rotateAngleY = (tileEntityIn.getOpenAmount() * ((float) Math.PI / 2F));
        wardrobeModel.Right.rotateAngleY = -(tileEntityIn.getOpenAmount() * ((float) Math.PI / 2F));
        wardrobeModel.render(matrixStackIn, bufferIn.getBuffer(RenderType.getEntityTranslucent(texture)), combinedLightIn, combinedOverlayIn, 1, 1, 1, 1);
        matrixStackIn.pop();


    }

    public void renderStackModel(MatrixStack matrixStackIn, ItemStack stack, float[] floats, IRenderTypeBuffer buffer, int light, int combinedOverlayIn) {
        matrixStackIn.push();
        matrixStackIn.translate(floats[0], floats[1], floats[2]);
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180));
        Item item = stack.getItem();
        BipedModel< ? > model = item.getArmorModel(Minecraft.getInstance().player, stack, MobEntity.getSlotForItemStack(stack), armorModel);
        if (model == null) {
            model = MobEntity.getSlotForItemStack(stack) == EquipmentSlotType.FEET ? armorModelFeet : armorModel;
        }
        String texture = item.getArmorTexture(stack, Minecraft.getInstance().player, MobEntity.getSlotForItemStack(stack), null);

        if (texture == null && item instanceof ArmorItem) {
            texture = getArmorResource(Minecraft.getInstance().player, stack, MobEntity.getSlotForItemStack(stack), null).toString();
        }

        if (model != null && texture != null) {
            model.render(matrixStackIn, buffer.getBuffer(RenderType.getEntityTranslucent(new ResourceLocation(texture))), light, combinedOverlayIn, 1, 1, 1, 1);
        }
        matrixStackIn.pop();
    }

    public ResourceLocation getArmorResource(Entity entity, ItemStack stack, EquipmentSlotType slot, @Nullable String type) {
        ArmorItem item = (ArmorItem) stack.getItem();
        String texture = item.getArmorMaterial().getName();
        String domain = "minecraft";
        int idx = texture.indexOf(':');
        if (idx != -1) {
            domain = texture.substring(0, idx);
            texture = texture.substring(idx + 1);
        }
        String s1 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", domain, texture, (isLegSlot(slot) ? 2 : 1), type == null ? "" : String.format("_%s", type));

        s1 = net.minecraftforge.client.ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
        return new ResourceLocation(s1);
    }

    private boolean isLegSlot(EquipmentSlotType slot) {
        return slot == EquipmentSlotType.LEGS;
    }
}
