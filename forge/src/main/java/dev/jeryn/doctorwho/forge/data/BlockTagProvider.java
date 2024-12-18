package dev.jeryn.doctorwho.forge.data;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.common.WCBlocks;
import dev.jeryn.doctorwho.registry.RegistrySupplier;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends BlockTagsProvider {

    public BlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WhoCosmetics.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        for (RegistrySupplier<Block> entry : WCBlocks.BLOCKS.getEntries()) {
            ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(entry.get());
            if (blockId.toString().contains(WhoCosmetics.MOD_ID)) {
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get());
            }
        }
    }
}
