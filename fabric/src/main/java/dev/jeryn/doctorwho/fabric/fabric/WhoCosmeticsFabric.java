package dev.jeryn.doctorwho.fabric.fabric;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.fabric.PlatformImpl;
import net.fabricmc.api.ModInitializer;

public class WhoCosmeticsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        WhoCosmetics.init();
        PlatformImpl.init();
    }
}
