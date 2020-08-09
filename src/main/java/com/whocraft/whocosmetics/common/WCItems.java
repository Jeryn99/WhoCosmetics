package com.whocraft.whocosmetics.common;

import com.whocraft.whocosmetics.Modeller;
import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.common.items.ClothingItem;
import com.whocraft.whocosmetics.common.items.JSONClothingItem;
import com.whocraft.whocosmetics.common.items.UmbrellaItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WCItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, WhoCosmetics.MODID);

    public static ItemGroup itemGroup = new ItemGroup("wc_clothes") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(WCItems.FEZ.get());
        }
    };

    public static ItemGroup itemGroupDye = new ItemGroup("wc_clothes_dyeable") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(WCItems.BOW_TIE.get());
        }
    };


    public static Item.Properties properties = new Item.Properties().group(itemGroup);

    //If the line has // after it, it needs a recipe

    public static final RegistryObject<Item> FEZ = ITEMS.register("fez", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD, true, DyeColor.RED.getColorValue()));
    public static final RegistryObject<Item> BOW_TIE = ITEMS.register("bowtie", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST, true, DyeColor.RED.getColorValue()));
    public static final RegistryObject<Item> CELERY = ITEMS.register("celery", () -> new ClothingItem(ArmorMaterial.TURTLE, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> SATCHEL = ITEMS.register("satchel", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> STETSON = ITEMS.register("stetson", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> ASTRAKHAN = ITEMS.register("astrakhan", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> STRAW_HAT = ITEMS.register("straw_hat", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> MONDAS = ITEMS.register("mondas", () -> new JSONClothingItem(EquipmentSlotType.HEAD).setModeller(Modeller.VIOLET));
    public static final RegistryObject<Item> THREED_GLASSES = ITEMS.register("3d_glasses", () -> new JSONClothingItem(EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> MAGNOLI = ITEMS.register("magnoli_clothiers", () -> new JSONClothingItem(EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> RAINBOW_SCARF = ITEMS.register("rainbow_scarf", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> UMBRELLA = ITEMS.register("umbrella", () -> new UmbrellaItem(properties));
    public static final RegistryObject<Item> WINGS = ITEMS.register("wings", () -> new ClothingItem(ArmorMaterial.GOLD, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> SCARF = ITEMS.register("scarf", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> CLOAK = ITEMS.register("cloak", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> CRICKET_JACKET = ITEMS.register("cricket_jacket", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));

}
