package me.craig.software.cosmetics.client.models;

import com.google.common.base.Supplier;
import dev.architectury.injectables.annotations.ExpectPlatform;
import me.craig.software.cosmetics.WhoCosmetics;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;

public class ModelRegistration {

    public static ModelLayerLocation BOWTIE, FIRST_HAT, GASMASK, RASSILON_SASH;

    public static void init() {
        BOWTIE = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "bowtie"), BowTieModel::createBodyLayer);
        FIRST_HAT = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "first_hat"), FirstHatModel::createBodyLayer);
        GASMASK = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "gasmask"), GasMaskModel::createBodyLayer);
        RASSILON_SASH = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "rassilon_sash"), GasMaskModel::createBodyLayer);

    }

    @ExpectPlatform
    public static ModelLayerLocation register(ModelLayerLocation location, Supplier<LayerDefinition> definition) {
        throw new RuntimeException(WhoCosmetics.MAPPING_ERROR);
    }

}
