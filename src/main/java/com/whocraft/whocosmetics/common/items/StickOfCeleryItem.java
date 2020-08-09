package com.whocraft.whocosmetics.common.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class StickOfCeleryItem extends ClothingItem {


    public StickOfCeleryItem(IArmorMaterial armorMaterial, EquipmentSlotType equipmentSlotType) {
        super(armorMaterial, equipmentSlotType);
    }

    public StickOfCeleryItem(IArmorMaterial armorMaterial, EquipmentSlotType equipmentSlotType, boolean isColored, int defaultColor) {
        super(armorMaterial, equipmentSlotType, isColored, defaultColor);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        return super.onItemRightClick(p_77659_1_, p_77659_2_, p_77659_3_);
    }
}
