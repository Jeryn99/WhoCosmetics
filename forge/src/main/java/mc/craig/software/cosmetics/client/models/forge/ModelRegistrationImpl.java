package mc.craig.software.cosmetics.client.models.forge;

import mc.craig.software.cosmetics.client.models.ModelRegistration;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.client.event.EntityRenderersEvent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class ModelRegistrationImpl {

    public static final Map<ModelLayerLocation, Supplier<LayerDefinition>> DEFINITIONS = new ConcurrentHashMap<>();

    public static ModelLayerLocation register(ModelLayerLocation location, com.google.common.base.Supplier<LayerDefinition> definition) {
        DEFINITIONS.put(location, definition);
        return location;
    }

    public static void registerToGame(EntityRenderersEvent.RegisterLayerDefinitions event) {
        ModelRegistration.init();
        DEFINITIONS.forEach(event::registerLayerDefinition);
    }

}
