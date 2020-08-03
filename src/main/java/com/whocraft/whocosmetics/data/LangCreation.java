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
        add(WCItems.ASTRAKHAN.get(), "Astrakhan Hat"); //Did you know the first Doctors hat was called this? I Didn't

        /* Item Groups */
        add("itemGroup.wc_clothes", "Who-Cosmetics Clothing");
    }
}
