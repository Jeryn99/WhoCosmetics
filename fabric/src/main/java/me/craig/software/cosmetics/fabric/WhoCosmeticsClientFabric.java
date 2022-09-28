package me.craig.software.cosmetics.fabric;

import me.craig.software.cosmetics.handles.ClientEvents;
import net.fabricmc.api.ClientModInitializer;

public class WhoCosmeticsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientEvents.init();
    }
}
