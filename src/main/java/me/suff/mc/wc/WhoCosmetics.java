package me.suff.mc.wc;

import me.suff.mc.wc.client.ClothingManager;
import me.suff.mc.wc.common.WCBlocks;
import me.suff.mc.wc.common.WCItems;
import me.suff.mc.wc.common.WCSounds;
import me.suff.mc.wc.common.WCTiles;
import me.suff.mc.wc.common.items.ClothingItem;
import me.suff.mc.wc.common.items.UmbrellaItem;
import me.suff.mc.wc.data.ItemModelCreation;
import me.suff.mc.wc.data.LangCreation;
import me.suff.mc.wc.data.RecipeCreation;
import me.suff.mc.wc.proxy.ClientProxy;
import me.suff.mc.wc.proxy.IProxy;
import me.suff.mc.wc.proxy.ServerProxy;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Predicate;

@Mod("whocosmetics")
public class WhoCosmetics {

    public static IProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public static final String MODID = "whocosmetics";

    public WhoCosmetics() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doItemColor);
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onNewRegistries(RegistryEvent.NewRegistry e) {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        WCItems.ITEMS.register(eventBus);
        WCSounds.SOUNDS.register(eventBus);
        WCBlocks.BLOCKS.register(eventBus);
        WCTiles.TILES.register(eventBus);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent e) {
        e.getGenerator().addProvider(new ItemModelCreation(e.getGenerator()));
        e.getGenerator().addProvider(new RecipeCreation(e.getGenerator()));
        e.getGenerator().addProvider(new LangCreation(e.getGenerator()));
    }

    private static final Predicate<Item> isColoredWc = item -> item instanceof ClothingItem && item.getRegistryName().getNamespace().equals(MODID);

    public void doItemColor(final ColorHandlerEvent.Item event) {
        for (Item item : ForgeRegistries.ITEMS.getValues()) {
            if (isColoredWc.test(item)) {
                ClothingItem coloredItem = (ClothingItem) item;
                if (coloredItem.isColored()) {
                    DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> event.getItemColors().register((p_getColor_1_, p_getColor_2_) -> p_getColor_2_ > 0 ? -1 : ((IDyeableArmorItem) p_getColor_1_.getItem()).getColor(p_getColor_1_), item));
                }
            }
        }
    }

    public void doClientStuff(final FMLClientSetupEvent event) {
        ClothingManager.setup();
        ItemModelsProperties.registerProperty(WCItems.UMBRELLA.get(), new ResourceLocation("whocosmetics:is_open"), new IItemPropertyGetter() {
            @Override
            public float call(ItemStack itemStack, ClientWorld clientWorld, LivingEntity livingEntity) {
                return UmbrellaItem.getIsOpen(itemStack) ? 1 : 0;
            }
        });
    }

}
