package me.suff.mc.wc.common;

import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.common.block.WardrobeBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = WhoCosmetics.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WCBlocks {

    public static final DeferredRegister< Block > BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WhoCosmetics.MODID);
    public static final DeferredRegister< Item > BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WhoCosmetics.MODID);


    public static final RegistryObject< Block > WARDROBE = BLOCKS.register("wardrobe", WardrobeBlock::new);


    private static void genBlockItems(Block... blocks) {
        for (Block block : blocks) {
            BLOCK_ITEMS.register(block.getRegistryName().getPath(), () -> new BlockItem(block, WCItems.properties));
        }
    }

    @SubscribeEvent
    public static void regBlockItems(RegistryEvent.Register< Item > e) {
        genBlockItems(WARDROBE.get());
    }
}
