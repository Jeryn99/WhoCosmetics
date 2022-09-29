package me.craig.software.cosmetics.common.items;


import me.craig.software.cosmetics.WhoCosmetics;
import me.craig.software.cosmetics.client.ClientUtil;
import me.craig.software.cosmetics.common.WCItems;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class ClothingItem extends ArmorItem implements DyeableLeatherItem, ICustomArmorTexture {

    private final int defaultColor;
    private boolean isColored = false, alexSupport = false;

    public ClothingItem(ArmorMaterial armorMaterial, EquipmentSlot EquipmentSlot) {
        this(armorMaterial, EquipmentSlot, false, DyeColor.RED.getMaterialColor().col);
    }

    public ClothingItem(ArmorMaterial armorMaterial, EquipmentSlot EquipmentSlot, boolean isColored, int defaultColor) {
        super(armorMaterial, EquipmentSlot, WCItems.GENERIC_PROPERTIES);
        this.defaultColor = defaultColor;
        this.isColored = isColored;
    }

    public Item enableAlexSupport() {
        alexSupport = true;
        return this;
    }

    @Override
    public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        ResourceLocation baseResourceLocation = new ResourceLocation(WhoCosmetics.MOD_ID, "textures/entity/armor/" + Registry.ITEM.getKey(stack.getItem()).getPath() + ".png");

        if(alexSupport){
            ResourceLocation steveLocation = new ResourceLocation(WhoCosmetics.MOD_ID, "textures/entity/armor/steve_" + Registry.ITEM.getKey(stack.getItem()).getPath() + ".png");
            ResourceLocation alexLocation = new ResourceLocation(WhoCosmetics.MOD_ID, "textures/entity/armor/slim_" + Registry.ITEM.getKey(stack.getItem()).getPath() + ".png");
            return ClientUtil.isAlex(entity) ? alexLocation : steveLocation;
        }

        return baseResourceLocation;
    }

    @Override
    public void fillItemCategory(CreativeModeTab category, NonNullList<ItemStack> items) {
        super.fillItemCategory(category, items);

        if (isColored && getItemCategory() == category) {
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