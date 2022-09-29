package mc.craig.software.cosmetics.client;

import mc.craig.software.cosmetics.client.models.*;
import mc.craig.software.cosmetics.common.WCItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;

public class ClientUtil {

    public static HashMap<Item, HumanoidModel<?>> ARMOR_MODELS = new HashMap<>();
    public static HashMap<Item, HumanoidModel<?>> ARMOR_MODELS_STEVE = new HashMap<>();

    public static <T extends LivingEntity> HumanoidModel<?> getArmorModel(ItemStack itemStack, T livingEntity) {

        if(!ClientUtil.isAlex(livingEntity) && ARMOR_MODELS_STEVE.containsKey(itemStack.getItem())){
            return ARMOR_MODELS_STEVE.get(itemStack.getItem());
        }

        if(ARMOR_MODELS.containsKey(itemStack.getItem())){
            return ARMOR_MODELS.get(itemStack.getItem());
        }
        return null;
    }

    public static void clothingModels() {
        if (!ARMOR_MODELS.isEmpty()) return;
        EntityModelSet entityModels = Minecraft.getInstance().getEntityModels();

        ARMOR_MODELS.put(WCItems.BOW_TIE.get(), new BowTieModel<>(entityModels.bakeLayer(ModelRegistration.BOWTIE)));
        ARMOR_MODELS.put(WCItems.FEZ.get(), new FezModel(entityModels.bakeLayer(ModelRegistration.FEZ)));
        ARMOR_MODELS.put(WCItems.GASMASK.get(), new GasMaskModel<>(entityModels.bakeLayer(ModelRegistration.GASMASK)));
        ARMOR_MODELS.put(WCItems.SATCHEL.get(), new SatchelModel<>(entityModels.bakeLayer(ModelRegistration.SATCHEL)));
        ARMOR_MODELS.put(WCItems.ASTRAKHAN.get(), new FirstHatModel<>(entityModels.bakeLayer(ModelRegistration.FIRST_HAT)));
        ARMOR_MODELS.put(WCItems.SCARF.get(), new ScarfModel<>(entityModels.bakeLayer(ModelRegistration.SCARF)));
        ARMOR_MODELS.put(WCItems.STRAW_HAT.get(), new StrawHatModel<>(entityModels.bakeLayer(ModelRegistration.STRAW_HAT)));
        ARMOR_MODELS.put(WCItems.CELERY.get(), new StickOfCeleryModel<>(entityModels.bakeLayer(ModelRegistration.CELERY_STICK)));
        ARMOR_MODELS.put(WCItems.STETSON.get(), new StetsonModel<>(entityModels.bakeLayer(ModelRegistration.STETSON)));
        ARMOR_MODELS.put(WCItems.SASH.get(), new RassilonSashModel<>(entityModels.bakeLayer(ModelRegistration.RASSILON_SASH)));


        ARMOR_MODELS.put(WCItems.SECOND_JACKET.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET_SLIM)));
        ARMOR_MODELS_STEVE.put(WCItems.SECOND_JACKET.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET)));

        ARMOR_MODELS.put(WCItems.TENTH_COAT.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET_SLIM)));
        ARMOR_MODELS_STEVE.put(WCItems.TENTH_COAT.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET)));

        ARMOR_MODELS.put(WCItems.VELVET_COAT.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET_SLIM)));
        ARMOR_MODELS_STEVE.put(WCItems.VELVET_COAT.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET)));

        ARMOR_MODELS.put(WCItems.CRICKET_JACKET.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET_SLIM)));
        ARMOR_MODELS_STEVE.put(WCItems.CRICKET_JACKET.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET)));


        ARMOR_MODELS.put(WCItems.RAINBOW_SCARF.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET_SLIM)));
        ARMOR_MODELS.put(WCItems.RED_SCARF.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET_SLIM)));
        ARMOR_MODELS.put(WCItems.SCARF.get(), new GenericJacketModel<>(entityModels.bakeLayer(ModelRegistration.JACKET_SLIM)));


    }

    public static boolean isAlex(Entity entity) {
        if (entity instanceof AbstractClientPlayer abstractClientPlayer) {
            if (abstractClientPlayer.playerInfo.getModelName().isEmpty()) {
                return false;
            }
            return abstractClientPlayer.playerInfo.getModelName().equals("slim");
        }
        return false;
    }
}
