package dev.jeryn.doctorwho;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import dev.jeryn.doctorwho.common.WCBlockEntities;
import dev.jeryn.doctorwho.common.WCBlocks;
import dev.jeryn.doctorwho.common.WCItems;
import dev.jeryn.doctorwho.common.WCSounds;
import dev.jeryn.doctorwho.common.entity.Entities;
import dev.jeryn.doctorwho.fix.WCDataFix;
import net.minecraft.util.datafix.DataFixers;

import java.util.function.BiFunction;

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


    private void registerDataFixes() {
     /*   int dataVersion = 1; // Increment this when you add more fixes
        Schema schema = new Schema(dataVersion, null);

        // Create a builder for registering data fixes
        DataFixerBuilder fixerBuilder = new DataFixerBuilder(dataVersion);

        // Add your WCDataFix
        fixerBuilder.addFixer(new WCDataFix(schema, false));

        // Build and register the DataFixer
        DataFixers.getDataFixer().update()*/
    }
}
