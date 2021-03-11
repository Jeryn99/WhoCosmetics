package me.suff.mc.wc.client.models;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IDyeableArmorItem;

public class ScarfModel extends BipedModel<LivingEntity> implements LivingArmor {
    private final ModelRenderer first_scarf;
    private final ModelRenderer firsts_scarf;
    private LivingEntity living;

    public ScarfModel() {
        super(0);
        textureWidth = 32;
        textureHeight = 32;

        first_scarf = new ModelRenderer(this);
        first_scarf.setRotationPoint(0.0F, 0.0F, 0.0F);


        firsts_scarf = new ModelRenderer(this);
        firsts_scarf.setRotationPoint(-1.5F, 10.5F, -3.5F);
        first_scarf.addChild(firsts_scarf);
        firsts_scarf.setTextureOffset(0, 3).addBox(-2.75F, -10.75F, 0.5F, 3.0F, 10.0F, 1.0F, 0.0F, false);
        firsts_scarf.setTextureOffset(8, 6).addBox(-2.75F, -0.75F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, false);
        firsts_scarf.setTextureOffset(8, 6).addBox(2.75F, -2.75F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, true);
        firsts_scarf.setTextureOffset(0, 20).addBox(-2.25F, -10.5F, 0.25F, 2.0F, 7.0F, 1.0F, 0.0F, false);
        firsts_scarf.setTextureOffset(19, 5).addBox(3.25F, -10.5F, 0.25F, 2.0F, 6.0F, 1.0F, 0.0F, false);
        firsts_scarf.setTextureOffset(12, 14).addBox(2.75F, -10.75F, 0.5F, 3.0F, 8.0F, 1.0F, 0.0F, false);
        firsts_scarf.setTextureOffset(0, 0).addBox(-2.5F, -10.5F, 5.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
        firsts_scarf.setTextureOffset(0, 14).addBox(-2.75F, -10.75F, 1.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        firsts_scarf.setTextureOffset(8, 8).addBox(3.75F, -10.75F, 1.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        firsts_scarf.setTextureOffset(8, 3).addBox(-1.0F, -6.0F, 0.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        bipedBody = first_scarf;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        if (living.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() instanceof IDyeableArmorItem) {
            IDyeableArmorItem iDyeableArmorItem = (IDyeableArmorItem) living.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem();
            int color = iDyeableArmorItem.getColor(living.getItemStackFromSlot(EquipmentSlotType.CHEST));
            red = (float) (color >> 16 & 255) / 255.0F;
            green = (float) (color >> 8 & 255) / 255.0F;
            blue = (float) (color & 255) / 255.0F;
            bipedHeadwear.showModel = false;
            bipedLeftArm.showModel = false;
            bipedRightArm.showModel = false;
            super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        }
    }

    @Override
    public void setLiving(LivingEntity livingEntity) {
        this.living = livingEntity;
    }

    @Override
    public LivingEntity getLiving() {
        return living;
    }
}