package dev.jeryn.doctorwho.forge;

import dev.jeryn.doctorwho.DoctorWhoDeco;
import dev.jeryn.doctorwho.client.models.ModelRegistration;
import dev.jeryn.doctorwho.forge.data.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DoctorWhoDeco.MOD_ID)
public class WhoCosmeticsForge {
    public WhoCosmeticsForge() {
        DoctorWhoDeco.init();
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::clientSetup);
        modBus.addListener(this::onGatherData);
    }



    public void onGatherData(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
        generator.addProvider(true, new LangProviderEnglish(generator));
        generator.addProvider(true, new RecipeProvider(generator));
        generator.addProvider(true, new LootProvider(generator));
        generator.addProvider(true, new ModelProviderBlock(generator, existingFileHelper));
        generator.addProvider(true, new ModelProviderItem(generator, existingFileHelper));
        generator.addProvider(true, new BlockTagProvider(generator.getPackOutput(), e.getLookupProvider(), existingFileHelper));
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ModelRegistration.init();
    }

}
