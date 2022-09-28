package me.craig.software.cosmetics.fabric;

import me.craig.software.cosmetics.WhoCosmetics;
import net.fabricmc.api.ModInitializer;

public class WhoCosmeticsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        WhoCosmetics.init();
    }
}
