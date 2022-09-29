package mc.craig.software.cosmetics.fabric.fabric;

import mc.craig.software.cosmetics.WhoCosmetics;
import net.fabricmc.api.ModInitializer;

public class WhoCosmeticsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        WhoCosmetics.init();
    }
}
