package com.whocraft.whocosmetics.common.items;

import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.client.ClothingData;
import com.whocraft.whocosmetics.client.ClothingManager;
import com.whocraft.whocosmetics.client.models.LivingArmor;
import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

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
    public void onCreated(ItemStack stack, World worldIn, PlayerEntity player) {
        super.onCreated(stack, worldIn, player);
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
        A model = (A) ClothingManager.getDataForItem(itemStack.getItem()).getModel(armorSlot);
        if(model instanceof LivingArmor){
            LivingArmor livingArmor = (LivingArmor) model;
            livingArmor.setLiving(entityLiving);
        }
        return model;
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return ClothingManager.getDataForItem(stack.getItem()).getModelTexture(entity).toString();
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        ClothingData data = ClothingManager.getDataForItem(stack.getItem());
        if (data != null) {
            if (data.getModeller() != null) {
                tooltip.add(new TranslationTextComponent(WhoCosmetics.MODID + ".nbt.modeller", data.getModeller().getModellerName()));
            }
        }
    }

    public boolean isColored() {
        return isColored;
    }
}
