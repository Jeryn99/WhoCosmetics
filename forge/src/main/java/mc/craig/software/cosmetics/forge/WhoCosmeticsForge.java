package mc.craig.software.cosmetics.forge;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.client.models.ModelRegistration;
import mc.craig.software.cosmetics.forge.data.*;
import net.minecraft.data.DataGenerator;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod(WhoCosmetics.MOD_ID)
public class WhoCosmeticsForge {
    public WhoCosmeticsForge() {
        WhoCosmetics.init();
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
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ModelRegistration.init();
    }

}
