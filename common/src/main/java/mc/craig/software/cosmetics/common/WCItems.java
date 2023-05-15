package mc.craig.software.cosmetics.common;

import dev.architectury.injectables.annotations.ExpectPlatform;
import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.entity.DavrosChair;
import mc.craig.software.cosmetics.common.items.*;
import mc.craig.software.cosmetics.registry.DeferredRegistry;
import mc.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class WCItems {

    public static final DeferredRegistry<Item> ITEMS = DeferredRegistry.create(WhoCosmetics.MOD_ID, Registry.ITEM_REGISTRY);
    public static CreativeModeTab MAIN = getCreativeTab();
    public static Item.Properties GENERIC_PROPERTIES = new Item.Properties().tab(MAIN).stacksTo(1);
    public static Item.Properties GRENADE_PROP = new Item.Properties().tab(MAIN).stacksTo(8);

    public static final RegistrySupplier<Item> FEZ = ITEMS.register("fez", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, true, DyeColor.RED.getMaterialColor().col));
    public static final RegistrySupplier<Item> BOW_TIE = ITEMS.register("bowtie", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST, true, DyeColor.RED.getMaterialColor().col));
    public static final RegistrySupplier<Item> TOP_HAT = ITEMS.register("top_hat", () -> new JSONClothingItem(EquipmentSlot.HEAD, true, DyeColor.BLUE.getMaterialColor().col));

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
    public static final RegistrySupplier<Item> SCARF = ITEMS.register("scarf", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST, false, DyeColor.GRAY.getMaterialColor().col));
    public static final RegistrySupplier<Item> CRICKET_JACKET = ITEMS.register("cricket_jacket", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST).enableAlexSupport());

    public static final RegistrySupplier<Item> SECOND_JACKET = ITEMS.register("second_jacket", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST).enableAlexSupport());
    public static final RegistrySupplier<Item> VELVET_COAT = ITEMS.register("velvet_coat", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST).enableAlexSupport());
    public static final RegistrySupplier<Item> TENTH_COAT = ITEMS.register("tenth_coat", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST).enableAlexSupport());
    public static final RegistrySupplier<Item> RAINBOW_COAT = ITEMS.register("rainbow_coat", () -> new ClothingItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST).enableAlexSupport());
    public static final RegistrySupplier<Item> SASH = ITEMS.register("sash", () -> new ClothingItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST));

    public static final RegistrySupplier<Item> FRUIT_HAT = ITEMS.register("fruit_hat", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> FEATHER_HAT = ITEMS.register("feather_hat", () -> new JSONClothingItem(EquipmentSlot.HEAD));

    public static final RegistrySupplier<Item> DAVROS_GOLD = ITEMS.register("davros_gold", () -> new DavrosSpawnerItem(WCItems.GENERIC_PROPERTIES, DavrosChair.Variant.GOLD));
    public static final RegistrySupplier<Item> DAVROS_BLACK = ITEMS.register("davros_black", () -> new DavrosSpawnerItem(WCItems.GENERIC_PROPERTIES, DavrosChair.Variant.BLACK));


    public static final RegistrySupplier<Item> SPACE_HELMET = ITEMS.register("space_helmet", () -> new ClothingItem(ArmorMaterials.IRON, EquipmentSlot.HEAD).enableAlexSupport().setTextureOverride("space_suit"));
    public static final RegistrySupplier<Item> SPACE_CHEST = ITEMS.register("space_chest", () -> new ClothingItem(ArmorMaterials.IRON, EquipmentSlot.CHEST).enableAlexSupport().setTextureOverride("space_suit"));
    public static final RegistrySupplier<Item> SPACE_LEGS = ITEMS.register("space_legs", () -> new ClothingItem(ArmorMaterials.IRON, EquipmentSlot.LEGS).enableAlexSupport().setTextureOverride("space_suit"));
    public static final RegistrySupplier<Item> SPACE_FEET = ITEMS.register("space_feet", () -> new ClothingItem(ArmorMaterials.IRON, EquipmentSlot.FEET).enableAlexSupport().setTextureOverride("space_suit"));

    public static final RegistrySupplier<Item> ANTLERS = ITEMS.register("antlers", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> GASMASK = ITEMS.register("gas_mask", () -> new ClothingItem(ArmorMaterials.CHAIN, EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> EYE_STALK = ITEMS.register("eye_stalk", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> ACES_BAT = ITEMS.register("aces_bat", () -> new SwordItem(Tiers.IRON, 3, -2.4F, (new Item.Properties()).tab(MAIN)));

    public static final RegistrySupplier<Item> UNIT_BERRET_R = ITEMS.register("unit_berret_red", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> UNIT_BERRET_G = ITEMS.register("unit_berret_green", () -> new JSONClothingItem(EquipmentSlot.HEAD));
    public static final RegistrySupplier<Item> UNIT_BERRET_B = ITEMS.register("unit_berret_blue", () -> new JSONClothingItem(EquipmentSlot.HEAD));


    public static final RegistrySupplier<Item> UMBRELLA = ITEMS.register("umbrella", () -> new UmbrellaItem(GENERIC_PROPERTIES));

    public static final RegistrySupplier<Item> UMBRELLA_MISSY = ITEMS.register("missy_umbrella", () -> new UmbrellaItem(GENERIC_PROPERTIES));

    public static final RegistrySupplier<Item> SONIC_10 = ITEMS.register("sonic_10", () -> new SonicItem(GENERIC_PROPERTIES));
    public static final RegistrySupplier<Item> SONIC_12 = ITEMS.register("sonic_12", () -> new SonicItem(GENERIC_PROPERTIES));
    public static final RegistrySupplier<Item> SONIC_13 = ITEMS.register("sonic_13", () -> new SonicItem(GENERIC_PROPERTIES));
    public static final RegistrySupplier<Item> SONIC_TROWEL = ITEMS.register("sonic_trowel", () -> new SonicItem(GENERIC_PROPERTIES));
    public static final RegistrySupplier<Item> SONIC_RIVER = ITEMS.register("sonic_river", () -> new SonicItem(GENERIC_PROPERTIES));
    public static final RegistrySupplier<Item> GRENADE = ITEMS.register("grenade", () -> new GrenadeItem(GRENADE_PROP));


    @ExpectPlatform
    private static CreativeModeTab getCreativeTab() {
        throw new RuntimeException(WhoCosmetics.MAPPING_ERROR);
    }

}
