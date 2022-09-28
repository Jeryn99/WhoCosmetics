package me.craig.software.cosmetics.forge;

import me.craig.software.cosmetics.WhoCosmetics;
import net.minecraftforge.fml.common.Mod;

@Mod(WhoCosmetics.MOD_ID)
public class WhoCosmeticsForge {
    public WhoCosmeticsForge() {
        WhoCosmetics.init();
    }
}
