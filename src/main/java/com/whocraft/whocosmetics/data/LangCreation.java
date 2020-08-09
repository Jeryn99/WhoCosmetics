package com.whocraft.whocosmetics.data;

import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.common.WCItems;
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
        add(WCItems.ASTRAKHAN.get(), "Astrakhan Hat"); //Did you know the first Doctors hat was called this? I Didn't - Swirtzly
        add(WCItems.STRAW_HAT.get(), "Straw Hat"); //Nope, I thought you made the name up lol, but did you know that Straw Hat is actually named Straw hat??? - Bell
        add(WCItems.WINGS.get(), "Weeping Angels Wings"); //Nope! I didn't! Remember not to blink!
        add(WCItems.CELERY.get(), "Stick of Celery"); //Remember to stay nourished though
        add(WCItems.SCARF.get(), "Scarf"); //I will, Is it me or is it kinda cold outside?
        add(WCItems.SATCHEL.get(), "Satchel");
        add(WCItems.THREED_GLASSES.get(), "3D Glasses");
        add(WCItems.MAGNOLI.get(),"Magnoli Clothiers Glasses"); //Long ass name for some glasses
        add(WCItems.RED_CLOAK.get(), "Red Cloak");

        /* Item Groups */
        add("itemGroup.wc_clothes", "Who-Cosmetics Clothing");
        add("itemGroup.wc_clothes_dyeable", "Who-Cosmetics Clothing Dyed");

        /* Lang */
        add("whocosmetics.nbt.modeller", "Modeller: %s");
    }
}
