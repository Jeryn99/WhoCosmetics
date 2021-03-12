package me.suff.mc.wc.common;

import me.suff.mc.wc.Modeller;
import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.common.items.ClothingItem;
import me.suff.mc.wc.common.items.JSONClothingItem;
import me.suff.mc.wc.common.items.UmbrellaItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WCItems {

    public static final DeferredRegister< Item > ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WhoCosmetics.MODID);

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

    public static final RegistryObject< Item > FEZ = ITEMS.register("fez", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD, true, DyeColor.RED.getColorValue()));
    public static final RegistryObject< Item > BOW_TIE = ITEMS.register("bowtie", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST, true, DyeColor.RED.getColorValue()));
    public static final RegistryObject< Item > CELERY = ITEMS.register("celery", () -> new ClothingItem(ArmorMaterial.TURTLE, EquipmentSlotType.CHEST));
    public static final RegistryObject< Item > SATCHEL = ITEMS.register("satchel", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject< Item > STETSON = ITEMS.register("stetson", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD));
    public static final RegistryObject< Item > ASTRAKHAN = ITEMS.register("astrakhan", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD));
    public static final RegistryObject< Item > STRAW_HAT = ITEMS.register("straw_hat", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD));
    public static final RegistryObject< Item > MONDAS = ITEMS.register("mondas", () -> new JSONClothingItem(EquipmentSlotType.HEAD).setModeller(Modeller.VIOLET));
    public static final RegistryObject< Item > THREED_GLASSES = ITEMS.register("3d_glasses", () -> new JSONClothingItem(EquipmentSlotType.HEAD).setModeller(Modeller.ANGELA));
    public static final RegistryObject< Item > MAGNOLI = ITEMS.register("magnoli_clothiers", () -> new JSONClothingItem(EquipmentSlotType.HEAD).setModeller(Modeller.ANGELA));
    public static final RegistryObject< Item > RAINBOW_SCARF = ITEMS.register("rainbow_scarf", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject< Item > RED_SCARF = ITEMS.register("red_scarf", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject< Item > UMBRELLA = ITEMS.register("umbrella", () -> new UmbrellaItem(properties));
    public static final RegistryObject< Item > SCARF = ITEMS.register("scarf", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST, false, DyeColor.GRAY.getColorValue()));
    public static final RegistryObject< Item > CRICKET_JACKET = ITEMS.register("cricket_jacket", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));

    public static final RegistryObject< Item > SECOND_JACKET = ITEMS.register("second_jacket", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject< Item > VELVET_COAT = ITEMS.register("velvet_coat", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject< Item > TENTH_COAT = ITEMS.register("tenth_coat", () -> new ClothingItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST));
    public static final RegistryObject< Item > SASH = ITEMS.register("sash", () -> new ClothingItem(ArmorMaterial.DIAMOND, EquipmentSlotType.CHEST));

    public static final RegistryObject< Item > FRUIT_HAT = ITEMS.register("fruit_hat", () -> new JSONClothingItem(EquipmentSlotType.HEAD).setModeller(Modeller.ANGELA));
    public static final RegistryObject< Item > FEATHER_HAT = ITEMS.register("feather_hat", () -> new JSONClothingItem(EquipmentSlotType.HEAD).setModeller(Modeller.ANGELA));

    public static final RegistryObject< Item > SPACE_HELMET = ITEMS.register("space_helmet", () -> new ClothingItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD));
    public static final RegistryObject< Item > SPACE_CHEST = ITEMS.register("space_chest", () -> new ClothingItem(ArmorMaterial.IRON, EquipmentSlotType.CHEST));
    public static final RegistryObject< Item > SPACE_LEGS = ITEMS.register("space_legs", () -> new ClothingItem(ArmorMaterial.IRON, EquipmentSlotType.LEGS));
    public static final RegistryObject< Item > SPACE_FEET = ITEMS.register("space_feet", () -> new ClothingItem(ArmorMaterial.IRON, EquipmentSlotType.FEET));

    public static final RegistryObject< Item > ANTLERS = ITEMS.register("antlers", () -> new JSONClothingItem(EquipmentSlotType.HEAD).setModeller(Modeller.ANGELA));


}
