package dev.jeryn.doctorwho.fix;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.datafix.fixes.References;

public class WCDataFix extends DataFix {

    public WCDataFix(Schema outputSchema, boolean changesType) {
        super(outputSchema, changesType);
    }

    @Override
    protected TypeRewriteRule makeRule() {
        return fixTypeEverywhereTyped(
                "WCDataFix",
                getInputSchema().getType(References.ITEM_STACK),
                typed -> typed.update(
                        DSL.remainderFinder(),
                        this::updateModId
                )
        );
    }

    private <T> Dynamic<T> updateModId(Dynamic<T> dynamic) {
        return dynamic.update(
                "id", // Field to update
                id -> {
                    String idString = id.asString("").startsWith("whocosmetics:")
                            ? id.asString("").replace("whocosmetics:", "doctor_who:")
                            : id.asString("");
                    return id.createString(idString);
                }
        );
    }
}
