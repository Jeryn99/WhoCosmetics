package me.craig.software.cosmetics.common.items;


import me.craig.software.cosmetics.WhoCosmetics;
import me.craig.software.cosmetics.common.WCItems;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;

import javax.annotation.Nullable;
import java.util.List;

public class ClothingItem extends ArmorItem implements DyeableLeatherItem, ICustomArmorTexture {

    private final int defaultColor;
    private boolean isColored = false;

    public ClothingItem(ArmorMaterial armorMaterial, EquipmentSlot EquipmentSlot) {
        this(armorMaterial, EquipmentSlot, false, DyeColor.RED.getMaterialColor().col);
    }

    public ClothingItem(ArmorMaterial armorMaterial, EquipmentSlot EquipmentSlot, boolean isColored, int defaultColor) {
        super(armorMaterial, EquipmentSlot, WCItems.GENERIC_PROPERTIES);
        this.defaultColor = defaultColor;
        this.isColored = isColored;
    }


    @Override
    public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return new ResourceLocation(WhoCosmetics.MOD_ID, "textures/entity/armor/" + Registry.ITEM.getKey(stack.getItem()).getPath() + ".png");
    }

    @Override
    public void fillItemCategory(CreativeModeTab category, NonNullList<ItemStack> items) {
        super.fillItemCategory(category, items);

        if (isColored) {
            for (DyeColor value : DyeColor.values()) {
                ItemStack stack = new ItemStack(this);
                setColor(stack, value.getMaterialColor().col);
                items.add(stack);
            }
        }
    }

    @Override
    public int getColor(ItemStack itemStack) {
        CompoundTag compoundNBT = itemStack.getTagElement("display");
        return compoundNBT != null && compoundNBT.contains("color", 99) ? compoundNBT.getInt("color") : defaultColor;
    }

    public boolean isColored() {
        return isColored;
    }
}