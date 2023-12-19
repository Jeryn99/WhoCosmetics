package mc.craig.software.cosmetics.fabric.fabric;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.fabric.PlatformImpl;
import net.fabricmc.api.ModInitializer;

public class WhoCosmeticsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        WhoCosmetics.init();
        PlatformImpl.init();
    }
}
