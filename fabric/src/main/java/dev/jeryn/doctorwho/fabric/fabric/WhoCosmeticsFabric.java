package dev.jeryn.doctorwho.fabric.fabric;

import dev.jeryn.doctorwho.DoctorWhoDeco;
import dev.jeryn.doctorwho.fabric.PlatformImpl;
import net.fabricmc.api.ModInitializer;

public class WhoCosmeticsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DoctorWhoDeco.init();
        PlatformImpl.init();
    }
}
