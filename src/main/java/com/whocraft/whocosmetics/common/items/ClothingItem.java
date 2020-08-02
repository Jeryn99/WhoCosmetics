package com.whocraft.whocosmetics.common.items;

import com.whocraft.whocosmetics.client.ClothingManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.NonNullList;

import javax.annotation.Nullable;

public class ClothingItem extends ArmorItem implements IDyeableArmorItem {
    public ClothingItem(IArmorMaterial armorMaterial, EquipmentSlotType equipmentSlotType, Properties properties) {
        super(armorMaterial, equipmentSlotType, properties);
    }

    @Override
    public void fillItemGroup(ItemGroup itemGroup, NonNullList<ItemStack> items) {
        super.fillItemGroup(itemGroup, items);

        if(isInGroup(itemGroup)){
            for (DyeColor value : DyeColor.values()) {
                ItemStack stack = new ItemStack(this);
                setColor(stack, value.getColorValue());
                items.add(stack);
            }
        }
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
}
