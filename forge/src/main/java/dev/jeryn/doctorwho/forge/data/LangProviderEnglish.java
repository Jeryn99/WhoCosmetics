package dev.jeryn.doctorwho.forge.data;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.common.WCBlocks;
import dev.jeryn.doctorwho.common.WCItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LangProviderEnglish extends LanguageProvider {

    public LangProviderEnglish(DataGenerator gen) {
        super(gen.getPackOutput(), WhoCosmetics.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(WCItems.BOW_TIE.get(), "Bowtie");
        add(WCItems.FEZ.get(), "Fez");
        add(WCItems.ANTLERS.get(), "Antlers");
        add(WCItems.ASTRAKHAN.get(), "Astrakhan");
        add(WCItems.CELERY.get(), "Stick of Celery");
        add(WCItems.CRICKET_JACKET.get(), "Cricket Jacket");
        add(WCItems.EYE_STALK.get(), "Dalek Eyestalk");
        add(WCItems.FEATHER_HAT.get(), "Feather Hat");
        add(WCItems.FRUIT_HAT.get(), "Fruit Hat");
        add(WCItems.GASMASK.get(), "Gasmask");
        add(WCItems.MAGNOLI.get(), "Magnoli Glasses");
        add(WCItems.MONDAS.get(), "Mondas Cyber-Helmet");
        add(WCItems.RAINBOW_SCARF.get(), "Rainbow Scarf");
        add(WCItems.RED_SCARF.get(), "Red Scarf");
        add(WCItems.SASH.get(), "Sash of Rassilon");
        add(WCItems.SATCHEL.get(), "Satchel");
        add(WCItems.SECOND_JACKET.get(), "Smart Jacket");
        add(WCItems.VELVET_COAT.get(), "Velvet Jacket");
        add(WCItems.THREED_GLASSES.get(), "Glasses");
        add(WCItems.STRAW_HAT.get(), "Straw Hat");
        add(WCItems.STETSON.get(), "Stetson");
        add(WCItems.SCARF.get(), "Scarf");
        add(WCItems.TENTH_COAT.get(), "Trenchcoat");
        add(WCItems.RAINBOW_COAT.get(), "Rainbow Coat");
        add(WCItems.ACES_BAT.get(), "Ace's Bat");
        add(WCItems.UMBRELLA_MISSY.get(), "Umbrella");
        add(WCItems.UMBRELLA.get(), "Umbrella");

        add(WCItems.SONIC_10.get(), "Sonic Screwdriver");
        add(WCItems.SONIC_12.get(), "Sonic Screwdriver");
        add(WCItems.SONIC_13.get(), "Sonic Screwdriver");
        add(WCItems.SONIC_14.get(), "Sonic Screwdriver");
        add(WCItems.SONIC_RIVER.get(), "Sonic Screwdriver");
        add(WCItems.SONIC_TROWEL.get(), "Sonic Trowel");
        add(WCItems.TOP_HAT.get(), "Top Hat");

        add(WCItems.SPACE_FEET.get(), "Spacesuit (Feet)");
        add(WCItems.SPACE_HELMET.get(), "Spacesuit (Helmet)");
        add(WCItems.SPACE_LEGS.get(), "Spacesuit (Legs)");
        add(WCItems.SPACE_CHEST.get(), "Spacesuit (Chest)");

        add(WCBlocks.CORAL_CHAIR.get(), "Coral Chair");
        add(WCItems.DAVROS_BLACK.get(), "Davros Chair (Black)");
        add(WCItems.DAVROS_GOLD.get(), "Davros Chair (Gold)");
        add(WCItems.GRENADE.get(), "Grenade");

        add(WCItems.UNIT_BERRET_R.get(), "Unit Berret");
        add(WCItems.UNIT_BERRET_G.get(), "Unit Berret");
        add(WCItems.UNIT_BERRET_B.get(), "Unit Berret");

        add(WCBlocks.TOYOTA_ROTOR.get(), "Toyota Rotor");
        add(WCBlocks.VICTORIAN_MONITOR.get(), "Victorian Monitor");
        add(WCBlocks.CLASSIC_DOORS.get(), "Classic Doors");
        add(WCBlocks.CLASSIC_ROTOR.get(), "Classic Rotor");
        add(WCBlocks.WHIRLY_GIG.get(), "Whirlygig");
        add(WCBlocks.TUBE_LIGHT.get(), "Tube Light");
        add(WCBlocks.NITRO_9.get(), "Nitro 9");

        add(WCBlocks.ROUNDEL_BLACK.get(), "Roundel Black");
        add(WCBlocks.ROUNDEL_BLACK_ELECTRICAL.get(), "Roundel Black Electrical");
        add(WCBlocks.ROUNDEL_ELECTRICAL.get(), "Roundel Electrical");
        add(WCBlocks.ROUNDEL_FIRE.get(), "Roundel Fire");
        add(WCBlocks.ROUNDEL_GOLD_BOXED.get(), "Roundel Gold Boxed");
        add(WCBlocks.ROUNDEL_GOLD_HEX.get(), "Roundel Gold Hex");
        add(WCBlocks.ROUNDEL_GOLD_INNER.get(), "Roundel Gold Inner");
        add(WCBlocks.ROUNDEL_GREY.get(), "Roundel Grey");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR.get(), "Roundel Grey Circular");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_2.get(), "Roundel Grey Circular 2");
        add(WCBlocks.ROUNDEL_GREY_HEX.get(), "Roundel Grey Hex");
        add(WCBlocks.ROUNDEL_TIME.get(), "Roundel Time");
        add(WCBlocks.ROUNDEL_CORAL.get(), "Roundel Coral");
        add(WCBlocks.ROUNDEL_CRYSTAL.get(), "Roundel Crystal");
        add(WCBlocks.ROUNDEL_CLASSIC.get(), "Roundel Classic");
        add(WCBlocks.ROUNDEL_WARGAMES.get(), "Roundel War Games");

        add(WCBlocks.ROUNDEL_CLASSIC_HALF.get(), "Roundel Classic Half");
        add(WCBlocks.ROUNDEL_WARGAMES_HALF.get(), "Roundel War Games Half");
        add(WCBlocks.ROUNDEL_BLACK_HALF.get(), "Roundel Black Half");
        add(WCBlocks.ROUNDEL_BLACK_ELECTRICAL_HALF.get(), "Roundel Black Electrical Half");
        add(WCBlocks.ROUNDEL_ELECTRICAL_HALF.get(), "Roundel Electrical Half");
        add(WCBlocks.ROUNDEL_FIRE_HALF.get(), "Roundel Fire Half");
        add(WCBlocks.ROUNDEL_GOLD_BOXED_HALF.get(), "Roundel Gold Boxed Half");
        add(WCBlocks.ROUNDEL_GOLD_HEX_HALF.get(), "Roundel Gold Hex Half");
        add(WCBlocks.ROUNDEL_GOLD_INNER_HALF.get(), "Roundel Gold Inner Half");
        add(WCBlocks.ROUNDEL_GREY_HALF.get(), "Roundel Grey Half");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_HALF.get(), "Roundel Grey Circular Half");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_2_HALF.get(), "Roundel Grey Circular 2 Half");
        add(WCBlocks.ROUNDEL_GREY_HEX_HALF.get(), "Roundel Grey Hex Half");
        add(WCBlocks.ROUNDEL_TIME_HALF.get(), "Roundel Time Half");
        add(WCBlocks.ROUNDEL_CORAL_HALF.get(), "Roundel Coral Half");
        add(WCBlocks.ROUNDEL_CRYSTAL_HALF.get(), "Roundel Crystal Half");

        add(WCBlocks.ROUNDEL_WARGAMES_ENDCAP.get(), "Roundel War Games Base");
        add(WCBlocks.ROUNDEL_BLACK_ENDCAP.get(), "Roundel Black Base");
        add(WCBlocks.ROUNDEL_BLACK_ELECTRICAL_ENDCAP.get(), "Roundel Black Electrical Base");
        add(WCBlocks.ROUNDEL_GOLD_BOXED_ENDCAP.get(), "Roundel Gold Boxed Base");
        add(WCBlocks.ROUNDEL_GOLD_HEX_ENDCAP.get(), "Roundel Gold Hex Base");
        add(WCBlocks.ROUNDEL_GOLD_INNER_ENDCAP.get(), "Roundel Gold Inner Base");
        add(WCBlocks.ROUNDEL_GREY_ENDCAP.get(), "Roundel Grey Base");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_ENDCAP.get(), "Roundel Grey Circular Base");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_2_ENDCAP.get(), "Roundel Grey Circular Base");
        add(WCBlocks.ROUNDEL_GREY_HEX_ENDCAP.get(), "Roundel Grey Hex Base");
        add(WCBlocks.ROUNDEL_TIME_ENDCAP.get(), "Roundel Time Base");
        add(WCBlocks.ROUNDEL_CORAL_ENDCAP.get(), "Roundel Coral Base");
        add(WCBlocks.ROUNDEL_CRYSTAL_ENDCAP.get(), "Roundel Crystal Base");

        add(WCBlocks.ROUNDEL_BLACK_SLAB.get(), "Roundel Black Slab");
        add(WCBlocks.ROUNDEL_BLACK_ELECTRICAL_SLAB.get(), "Roundel Black Electrical Slab");
        add(WCBlocks.ROUNDEL_ELECTRICAL_SLAB.get(), "Roundel Electrical Slab");
        add(WCBlocks.ROUNDEL_FIRE_SLAB.get(), "Roundel Fire Slab");
        add(WCBlocks.ROUNDEL_GOLD_BOXED_SLAB.get(), "Roundel Gold Boxed Slab");
        add(WCBlocks.ROUNDEL_GOLD_HEX_SLAB.get(), "Roundel Gold Hex Slab");
        add(WCBlocks.ROUNDEL_GOLD_INNER_SLAB.get(), "Roundel Gold Inner Slab");
        add(WCBlocks.ROUNDEL_GREY_SLAB.get(), "Roundel Grey Slab");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_SLAB.get(), "Roundel Grey Circular Slab");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_2_SLAB.get(), "Roundel Grey Circular Slab");
        add(WCBlocks.ROUNDEL_GREY_HEX_SLAB.get(), "Roundel Grey Hex Slab");
        add(WCBlocks.ROUNDEL_TIME_SLAB.get(), "Roundel Time Slab");
        add(WCBlocks.ROUNDEL_CORAL_SLAB.get(), "Roundel Coral Slab");
        add(WCBlocks.ROUNDEL_CRYSTAL_SLAB.get(), "Roundel Crystal Slab");
        add(WCBlocks.ROUNDEL_CLASSIC_SLAB.get(), "Roundel Classic Slab");
        add(WCBlocks.ROUNDEL_WARGAMES_SLAB.get(), "Roundel War Games Slab");

        add(WCBlocks.ROUNDEL_BLACK_SLAB_TOP_HALF.get(), "Roundel Black Top Half");
        add(WCBlocks.ROUNDEL_BLACK_ELECTRICAL_TOP_HALF.get(), "Roundel Black Electrical Top Half");
        add(WCBlocks.ROUNDEL_ELECTRICAL_TOP_HALF.get(), "Roundel Electrical Top Half");
        add(WCBlocks.ROUNDEL_FIRE_TOP_HALF.get(), "Roundel Fire Top Half");
        add(WCBlocks.ROUNDEL_GOLD_BOXED_TOP_HALF.get(), "Roundel Gold Boxed Top Half");
        add(WCBlocks.ROUNDEL_GOLD_HEX_TOP_HALF.get(), "Roundel Gold Hex Top Half");
        add(WCBlocks.ROUNDEL_GOLD_INNER_TOP_HALF.get(), "Roundel Gold Inner Top Half");
        add(WCBlocks.ROUNDEL_GREY_TOP_HALF.get(), "Roundel Grey Top Half");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_TOP_HALF.get(), "Roundel Grey Circular Top Half");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_2_TOP_HALF.get(), "Roundel Grey Circular 2 Top Half");
        add(WCBlocks.ROUNDEL_GREY_HEX_TOP_HALF.get(), "Roundel Grey Hex Top Half");
        add(WCBlocks.ROUNDEL_TIME_TOP_HALF.get(), "Roundel Time Top Half");
        add(WCBlocks.ROUNDEL_CORAL_TOP_HALF.get(), "Roundel Coral Top Half");
        add(WCBlocks.ROUNDEL_CRYSTAL_TOP_HALF.get(), "Roundel Crystal Top Half");
        add(WCBlocks.ROUNDEL_CLASSIC_TOP_HALF.get(), "Roundel Classic Top Half");
        add(WCBlocks.ROUNDEL_WARGAMES_TOP_HALF.get(), "Roundel War Games Top Half");

        add(WCBlocks.ROUNDEL_BLACK_SLAB_BOTTOM_HALF.get(), "Roundel Black Bottom Half");
        add(WCBlocks.ROUNDEL_BLACK_ELECTRICAL_BOTTOM_HALF.get(), "Roundel Black Electrical Bottom Half");
        add(WCBlocks.ROUNDEL_ELECTRICAL_BOTTOM_HALF.get(), "Roundel Electrical Bottom Half");
        add(WCBlocks.ROUNDEL_FIRE_BOTTOM_HALF.get(), "Roundel Fire Bottom Half");
        add(WCBlocks.ROUNDEL_GOLD_BOXED_BOTTOM_HALF.get(), "Roundel Gold Boxed Bottom Half");
        add(WCBlocks.ROUNDEL_GOLD_HEX_BOTTOM_HALF.get(), "Roundel Gold Hex Bottom Half");
        add(WCBlocks.ROUNDEL_GOLD_INNER_BOTTOM_HALF.get(), "Roundel Gold Inner Bottom Half");
        add(WCBlocks.ROUNDEL_GREY_BOTTOM_HALF.get(), "Roundel Grey Bottom Half");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_BOTTOM_HALF.get(), "Roundel Grey Circular Bottom Half");
        add(WCBlocks.ROUNDEL_GREY_CIRCULAR_2_BOTTOM_HALF.get(), "Roundel Grey Circular 2 Bottom Half");
        add(WCBlocks.ROUNDEL_GREY_HEX_BOTTOM_HALF.get(), "Roundel Grey Hex Bottom Half");
        add(WCBlocks.ROUNDEL_TIME_BOTTOM_HALF.get(), "Roundel Time Bottom Half");
        add(WCBlocks.ROUNDEL_CORAL_BOTTOM_HALF.get(), "Roundel Coral Bottom Half");
        add(WCBlocks.ROUNDEL_CRYSTAL_BOTTOM_HALF.get(), "Roundel Crystal Bottom Half");
        add(WCBlocks.ROUNDEL_CLASSIC_BOTTOM_HALF.get(), "Roundel Classic Bottom Half");
        add(WCBlocks.ROUNDEL_WARGAMES_BOTTOM_HALF.get(), "Roundel War Games Bottom Half");

        add(WCItems.CREATIVE_TAB, "WhoCosmetics");
    }
}
