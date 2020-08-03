package com.whocraft.whocosmetics.common.items;

import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class JSONClothingItem extends Item {
    private final EquipmentSlotType slotType;

    public JSONClothingItem(EquipmentSlotType slot) {
        super(WCItems.properties);
        this.slotType = slot;
    }

    @Nullable
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack) {
        return slotType;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack playerEntityHeldItem = playerEntity.getHeldItem(hand);
        EquipmentSlotType equipmentSlotType = MobEntity.getSlotForItemStack(playerEntityHeldItem);
        ItemStack stack = playerEntity.getItemStackFromSlot(equipmentSlotType);
        if (stack.isEmpty()) {
            playerEntity.setItemStackToSlot(equipmentSlotType, playerEntityHeldItem.copy());
            playerEntityHeldItem.setCount(0);
            return new ActionResult(ActionResultType.SUCCESS, playerEntityHeldItem);
        } else {
            return new ActionResult(ActionResultType.FAIL, playerEntityHeldItem);
        }
    }
}
