package com.whocraft.whocosmetics.common;

import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.common.items.ClothingItem;
import com.whocraft.whocosmetics.common.items.JSONClothingItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WCItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, WhoCosmetics.MODID);

    static ItemGroup itemGroup = new ItemGroup("wc_clothes") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(WCItems.FEZ.get());
        }
    };

    public static Item.Properties properties = new Item.Properties().group(itemGroup);

    public static final RegistryObject<Item> FEZ = ITEMS.register("fez", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD, true));
    public static final RegistryObject<Item> STETSON = ITEMS.register("stetson", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> ASTRAKHAN = ITEMS.register("astrakhan", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> STRAW_HAT = ITEMS.register("straw_hat", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> MONDAS = ITEMS.register("mondas", () -> new JSONClothingItem(EquipmentSlotType.HEAD));

    public static final RegistryObject<Item> BOW_TIE = ITEMS.register("bowtie", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST, true));
}
