package mc.craig.software.cosmetics.client.models;

import com.google.common.base.Supplier;
import dev.architectury.injectables.annotations.ExpectPlatform;
import mc.craig.software.cosmetics.WhoCosmetics;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;

public class ModelRegistration {
    public static ModelLayerLocation SPACE_SUIT_SLIM, SPACE_SUIT, SPACE_SUIT_FEET, JACKET, JACKET_SLIM, BOWTIE, STETSON, FIRST_HAT, GASMASK, RASSILON_SASH, FEZ, SATCHEL, SCARF, STRAW_HAT, CELERY_STICK;

    public static void init() {
        BOWTIE = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "bowtie"), BowTieModel::createBodyLayer);
        FIRST_HAT = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "first_hat"), FirstHatModel::createBodyLayer);
        GASMASK = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "gasmask"), GasMaskModel::createBodyLayer);
        RASSILON_SASH = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "rassilon_sash"), RassilonSashModel::createBodyLayer);
        FEZ = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "fez"), FezModel::createBodyLayer);
        SATCHEL = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "satchel"), SatchelModel::createBodyLayer);
        SCARF = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "scarf"), ScarfModel::createBodyLayer);
        STRAW_HAT = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "straw_hat"), StrawHatModel::createBodyLayer);
        CELERY_STICK = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "celery_stick"), StickOfCeleryModel::createBodyLayer);
        STETSON = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "stetson"), StetsonModel::createBodyLayer);
        JACKET = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "jacket"), () -> GenericJacketModel.createBodyLayer(false));
        JACKET_SLIM = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "jacket_slim"), () -> GenericJacketModel.createBodyLayer(true));
        SPACE_SUIT_SLIM = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "space_suit_slim"), () -> SteveSpaceSuitModel.createLayer(false, false));
        SPACE_SUIT = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "space_suit_steve"), () -> SteveSpaceSuitModel.createLayer(false, true));
        SPACE_SUIT_FEET = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "space_suit_feet"), () -> SteveSpaceSuitModel.createLayer(true, false));
    }

    @ExpectPlatform
    public static ModelLayerLocation register(ModelLayerLocation location, Supplier<LayerDefinition> definition) {
        throw new RuntimeException(WhoCosmetics.MAPPING_ERROR);
    }



}
