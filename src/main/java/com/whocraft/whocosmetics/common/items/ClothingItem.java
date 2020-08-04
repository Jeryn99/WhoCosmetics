package com.whocraft.whocosmetics.common.items;

import com.whocraft.whocosmetics.client.ClothingManager;
import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ClothingItem extends ArmorItem implements IDyeableArmorItem {

    private final int defaultColor;
    private boolean isColored = false;

    public ClothingItem(IArmorMaterial armorMaterial, EquipmentSlotType equipmentSlotType) {
        this(armorMaterial, equipmentSlotType, false, DyeColor.RED.getColorValue());
    }

    public ClothingItem(IArmorMaterial armorMaterial, EquipmentSlotType equipmentSlotType, boolean isColored, int defaultColor) {
        super(armorMaterial, equipmentSlotType, WCItems.properties);
        this.defaultColor = defaultColor;
        this.isColored = isColored;
    }

    @Override
    public void onCreated(ItemStack p_77622_1_, World p_77622_2_, PlayerEntity p_77622_3_) {
        super.onCreated(p_77622_1_, p_77622_2_, p_77622_3_);
    }

    @Override
    public void fillItemGroup(ItemGroup itemGroup, NonNullList<ItemStack> items) {
        super.fillItemGroup(itemGroup, items);

        if (isColored && itemGroup == WCItems.itemGroupDye) {
            for (DyeColor value : DyeColor.values()) {
                ItemStack stack = new ItemStack(this);
                setColor(stack, value.getColorValue());
                items.add(stack);
            }
        }
    }

    @Override
    public int getColor(ItemStack itemStack) {
        CompoundNBT compoundNBT = itemStack.getChildTag("display");
        return compoundNBT != null && compoundNBT.contains("color", 99) ? compoundNBT.getInt("color") : defaultColor;
    }

    @Nullable
    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) ClothingManager.getDataForItem(itemStack.getItem()).getModel(armorSlot);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return ClothingManager.getDataForItem(stack.getItem()).getModelTexture().toString();
    }

    public boolean isColored() {
        return isColored;
    }
}
