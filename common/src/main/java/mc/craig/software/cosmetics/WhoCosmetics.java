package mc.craig.software.cosmetics;

import mc.craig.software.cosmetics.common.WCBlockEntities;
import mc.craig.software.cosmetics.common.WCBlocks;
import mc.craig.software.cosmetics.common.WCItems;
import mc.craig.software.cosmetics.common.WCSounds;
import mc.craig.software.cosmetics.common.entity.Entities;

public class WhoCosmetics {
    public static final String MOD_ID = "whocosmetics";
    public static final String MAPPING_ERROR = "Something has went terribly wrong with expect platform";

    public static void init() {
        WCItems.ITEMS.register();
        WCItems.TABS.register();
        Entities.ENTITY_TYPES.register();
        WCBlocks.BLOCKS.register();
        WCBlockEntities.TILES.register();
        WCSounds.SOUNDS.register();
    }
}
