package me.suff.mc.wc.data;

import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.common.WCItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LangCreation extends LanguageProvider {

    public LangCreation(DataGenerator gen) {
        super(gen, WhoCosmetics.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        /* Items */
        add(WCItems.FEZ.get(), "Fez");
        add(WCItems.STETSON.get(), "Stetson");
        add(WCItems.BOW_TIE.get(), "Bowtie");
        add(WCItems.MONDAS.get(), "Mondas");
        add(WCItems.RAINBOW_SCARF.get(), "Rainbow Scarf");
        add(WCItems.UMBRELLA.get(), "Umbrella");
        add(WCItems.ASTRAKHAN.get(), "Astrakhan Hat");
        add(WCItems.STRAW_HAT.get(), "Straw Hat");
        add(WCItems.CELERY.get(), "Stick of Celery");
        add(WCItems.SCARF.get(), "Scarf");
        add(WCItems.SATCHEL.get(), "Satchel");
        add(WCItems.THREED_GLASSES.get(), "3D Glasses");
        add(WCItems.MAGNOLI.get(),"Magnoli Clothiers Glasses");
        add(WCItems.CRICKET_JACKET.get(), "Cricket Jacket");
        add(WCItems.SPACE_HELMET.get(), "Space-Suit (Helmet)");
        add(WCItems.SPACE_CHEST.get(), "Space-Suit (Body)");
        add(WCItems.SPACE_LEGS.get(), "Space-Suit (Legs)");
        add(WCItems.SPACE_FEET.get(), "Space-Suit (Feet)");
        add(WCItems.VELVET_COAT.get(), "Velvet Coat");
        add(WCItems.SECOND_JACKET.get(), "Velvet Coat");
        add(WCItems.FRUIT_HAT.get(), "Fruit Hat");
        add(WCItems.FEATHER_HAT.get(), "Feather Hat");
        add(WCItems.SASH.get(), "Sash of Rassilon");
        add(WCItems.TENTH_COAT.get(), "Trenchcoat");
        add(WCItems.RED_SCARF.get(), "Red Scarf");
        add(WCItems.ANTLERS.get(), "Antlers");
        /* Item Groups */
        add("itemGroup.wc_clothes", "Who-Cosmetics Clothing");
        add("itemGroup.wc_clothes_dyeable", "Who-Cosmetics Clothing (Dyed)");

        /* Lang */
        add("whocosmetics.nbt.modeller", "Modeller: %s");
    }
}
