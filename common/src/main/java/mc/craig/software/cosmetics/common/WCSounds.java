package mc.craig.software.cosmetics.common;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.registry.DeferredRegistry;
import mc.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class WCSounds {

    public static final DeferredRegistry<SoundEvent> SOUNDS = DeferredRegistry.create(WhoCosmetics.MOD_ID, Registry.SOUND_EVENT_REGISTRY);

    public static final RegistrySupplier<SoundEvent> UMBRELLA_OPEN = SOUNDS.register("umbrella_open", () -> setUpSound("umbrella_open"));
    public static final RegistrySupplier<SoundEvent> SONIC = SOUNDS.register("sonic", () -> setUpSound("sonic"));

    private static SoundEvent setUpSound(String soundName) {
        return new SoundEvent(new ResourceLocation(WhoCosmetics.MOD_ID, soundName));
    }

}
