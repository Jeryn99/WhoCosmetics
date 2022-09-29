package mc.craig.software.cosmetics.forge;

import mc.craig.software.cosmetics.WhoCosmetics;
import net.minecraftforge.fml.common.Mod;

@Mod(WhoCosmetics.MOD_ID)
public class WhoCosmeticsForge {
    public WhoCosmeticsForge() {
        WhoCosmetics.init();
    }
}
