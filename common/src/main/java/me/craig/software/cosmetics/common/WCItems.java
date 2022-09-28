package me.craig.software.cosmetics.common;

import dev.architectury.injectables.annotations.ExpectPlatform;
import me.craig.software.cosmetics.WhoCosmetics;
import me.craig.software.cosmetics.common.items.ClothingItem;
import me.craig.software.cosmetics.common.items.JSONClothingItem;
import me.craig.software.cosmetics.registry.DeferredRegistry;
import me.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class WCItems {

    public static final DeferredRegistry<Item> ITEMS = DeferredRegistry.create(WhoCosmetics.MOD_ID, Registry.ITEM_REGISTRY);
    public static CreativeModeTab MAIN = getCreativeTab();
    public static Item.Properties GENERIC_PROPERTIES = new Item.Properties().tab(MAIN).stacksTo(1);

    public static final RegistrySupplier<Item> FEZ = ITEMS.register("fez", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, true, DyeColor.RED.getMaterialColor().col));
    public static final RegistrySupplier<Item> BOW_TIE = ITEMS.register("bowtie", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST, true, DyeColor.RED.getMaterialColor().col));
    public static final RegistrySupplier<Item> CELERY = ITEMS.register("celery", () -> new ClothingItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST));
    public static final RegistrySupplier<Item> SATCHEL = ITEMS.register("satchel", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST));
    public static final RegistrySupplier<Item> STETSON = ITEMS.register("stetson", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> ASTRAKHAN = ITEMS.register("astrakhan", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> STRAW_HAT = ITEMS.register("straw_hat", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> MONDAS = ITEMS.register("mondas", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> THREED_GLASSES = ITEMS.register("3d_glasses", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> MAGNOLI = ITEMS.register("magnoli_clothiers", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> RAINBOW_SCARF = ITEMS.register("rainbow_scarf", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST));
    public static final RegistrySupplier<Item> RED_SCARF = ITEMS.register("red_scarf", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST));
    // public static final RegistrySupplier< Item > UMBRELLA = ITEMS.register("umbrella", () -> new UmbrellaItem(properties));
    // public static final RegistrySupplier< Item > UMBRELLA_MISSY = ITEMS.register("m_umbrella", () -> new UmbrellaItem(properties));
    public static final RegistrySupplier<Item> SCARF = ITEMS.register("scarf", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST, false, DyeColor.GRAY.getMaterialColor().col));
    public static final RegistrySupplier<Item> CRICKET_JACKET = ITEMS.register("cricket_jacket", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST));

    public static final RegistrySupplier<Item> SECOND_JACKET = ITEMS.register("second_jacket", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST));
    public static final RegistrySupplier<Item> VELVET_COAT = ITEMS.register("velvet_coat", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST));
    public static final RegistrySupplier<Item> TENTH_COAT = ITEMS.register("tenth_coat", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST));
    public static final RegistrySupplier<Item> SASH = ITEMS.register("sash", () -> new ClothingItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST));

    public static final RegistrySupplier<Item> FRUIT_HAT = ITEMS.register("fruit_hat", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> FEATHER_HAT = ITEMS.register("feather_hat", () -> new JSONClothingItem(EquipmentSlot.HEAD));

    public static final RegistrySupplier<Item> SPACE_HELMET = ITEMS.register("space_helmet", () -> new ClothingItem(ArmorMaterials.IRON, EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> SPACE_CHEST = ITEMS.register("space_chest", () -> new ClothingItem(ArmorMaterials.IRON, EquipmentSlot.CHEST));
    public static final RegistrySupplier<Item> SPACE_LEGS = ITEMS.register("space_legs", () -> new ClothingItem(ArmorMaterials.IRON, EquipmentSlot.LEGS));
    public static final RegistrySupplier<Item> SPACE_FEET = ITEMS.register("space_feet", () -> new ClothingItem(ArmorMaterials.IRON, EquipmentSlot.FEET));

    public static final RegistrySupplier<Item> ANTLERS = ITEMS.register("antlers", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> GASMASK = ITEMS.register("gas_mask", () -> new ClothingItem(ArmorMaterials.CHAIN, EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> EYE_STALK = ITEMS.register("eye_stalk", () -> new JSONClothingItem(EquipmentSlot.HEAD));

    @ExpectPlatform
    private static CreativeModeTab getCreativeTab() {
        throw new RuntimeException(WhoCosmetics.MAPPING_ERROR);
    }

}
