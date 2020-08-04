package com.whocraft.whocosmetics.common.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class UmbrellaItem extends Item {
    public UmbrellaItem(Properties p_i48487_1_) {
        super(p_i48487_1_.maxStackSize(1));
        this.addPropertyOverride(new ResourceLocation("is_open"), (itemStack, world, livingEntity) -> {
            return getIsOpen(itemStack) ? 1.0F : 0.0F;
        });
    }

    @Override
    public void onCreated(ItemStack itemStack, World world, PlayerEntity playerEntity) {
        super.onCreated(itemStack, world, playerEntity);
        setOpen(itemStack, false);
    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {

        if (entity.isSneaking()) {
            ItemStack itemStack = entity.getHeldItemMainhand();
            setOpen(itemStack, !getIsOpen(itemStack));
        }

        return false;
    }

    public static boolean getIsOpen(ItemStack itemStack) {

        if(itemStack.getTag() == null){
            itemStack.setTag(new CompoundNBT());
        }

        if (!itemStack.getTag().contains("isOpen")) {
            itemStack.getTag().putBoolean("isOpen", false);
        }
        return itemStack.getTag().getBoolean("isOpen");
    }

    public static void setOpen(ItemStack itemStack, boolean isOpen) {
        itemStack.getTag().putBoolean("isOpen", isOpen);
    }

}
