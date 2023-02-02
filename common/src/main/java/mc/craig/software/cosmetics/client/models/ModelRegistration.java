package mc.craig.software.cosmetics.client.models;

import com.google.common.base.Supplier;
import dev.architectury.injectables.annotations.ExpectPlatform;
import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.client.models.block.TenthDoctorChairModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;

public class ModelRegistration {
    public static ModelLayerLocation CLASSIC_DOOR, TOYOTA_ROTOR, TENTH_CHAIR, DAVROS_CHAIR, SPACE_SUIT_FEET_SLIM, SPACE_SUIT_SLIM, SPACE_SUIT, SPACE_SUIT_FEET, JACKET, JACKET_SLIM, BOWTIE, STETSON, FIRST_HAT, GASMASK, RASSILON_SASH, FEZ, SATCHEL, SCARF, STRAW_HAT, CELERY_STICK;

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
        SPACE_SUIT_SLIM = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "space_suit_slim"), () -> SlimSpaceSuitModel.createLayer(false));
        SPACE_SUIT = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "space_suit_steve"), () -> SteveSpaceSuitModel.createLayer(false));
        SPACE_SUIT_FEET = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "space_suit_feet"), () -> SteveSpaceSuitModel.createLayer(true));
        SPACE_SUIT_FEET_SLIM = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "space_suit_slim_feet"), () -> SlimSpaceSuitModel.createLayer(true));
        DAVROS_CHAIR = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "davros_chair"), DavrosChairModel::createBodyLayer);
        TENTH_CHAIR = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "tenth_chair"), TenthDoctorChairModel::createBodyLayer);
        TOYOTA_ROTOR = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "toyota_rotor"), ToyotaRotorModel::createBodyLayer);
        CLASSIC_DOOR = register(new ModelLayerLocation(new ResourceLocation(WhoCosmetics.MOD_ID, "model"), "classic_door"), ClassicDoorsModel::createBodyLayer);
    }

    @ExpectPlatform
    public static ModelLayerLocation register(ModelLayerLocation location, Supplier<LayerDefinition> definition) {
        throw new RuntimeException(WhoCosmetics.MAPPING_ERROR);
    }



}
