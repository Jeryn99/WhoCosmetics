package me.craig.software.cosmetics.client;

import me.craig.software.cosmetics.client.models.BowTieModel;
import me.craig.software.cosmetics.client.models.ModelRegistration;
import me.craig.software.cosmetics.common.WCItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.HashMap;

public class ClientUtil {

    public static HashMap<Item, HumanoidModel<?>> ARMOR_MODELS = new HashMap<>();
    public static HashMap<Item, HumanoidModel<?>> ARMOR_MODELS_STEVE = new HashMap<>();

    public static <T extends LivingEntity> HumanoidModel<?> getArmorModel(ItemStack itemStack, T livingEntity) {
        if(ARMOR_MODELS.containsKey(itemStack.getItem())){
            return ARMOR_MODELS.get(itemStack.getItem());
        }
        return null;
    }

    public static void clothingModels() {
        if (!ARMOR_MODELS.isEmpty()) return;
        EntityModelSet entityModels = Minecraft.getInstance().getEntityModels();
        ARMOR_MODELS.put(WCItems.BOW_TIE.get(), new BowTieModel<>(entityModels.bakeLayer(ModelRegistration.BOWTIE)));
    }
}
