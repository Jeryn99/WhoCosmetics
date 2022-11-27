package mc.craig.software.cosmetics.forge;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.client.models.ModelRegistration;
import mc.craig.software.cosmetics.forge.data.LangProviderEnglish;
import mc.craig.software.cosmetics.forge.data.ModelProviderBlock;
import mc.craig.software.cosmetics.forge.data.ModelProviderItem;
import mc.craig.software.cosmetics.forge.data.RecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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
        generator.addProvider(true, new ModelProviderBlock(generator, existingFileHelper));
        generator.addProvider(true, new ModelProviderItem(generator, existingFileHelper));
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ModelRegistration.init();
    }

}
