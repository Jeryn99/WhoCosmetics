package mc.craig.software.cosmetics.fabric.fabric;

import mc.craig.software.cosmetics.client.ClientUtil;
import mc.craig.software.cosmetics.client.models.ModelRegistration;
import mc.craig.software.cosmetics.fabric.fabric.handles.ClientEvents;
import net.fabricmc.api.ClientModInitializer;

public class WhoCosmeticsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientEvents.init();
        ModelRegistration.init();
        ClientUtil.clothingModels();
    }
}
