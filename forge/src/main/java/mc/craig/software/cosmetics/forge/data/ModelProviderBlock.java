package mc.craig.software.cosmetics.forge.data;

import com.google.gson.JsonObject;
import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.WCBlocks;
import mc.craig.software.cosmetics.common.blocks.FacingEntityBlock;
import mc.craig.software.cosmetics.common.blocks.MonitorBlock;
import mc.craig.software.cosmetics.common.blocks.Nitro9Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.Nullable;
import whocraft.tardis_refined.registry.TRBlockRegistry;

import java.util.Map;

public class ModelProviderBlock extends BlockStateProvider {

    public ModelProviderBlock(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator.getPackOutput(), WhoCosmetics.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (Map.Entry<ResourceKey<Block>, Block> value : TRBlockRegistry.BLOCKS.entrySet()) {
            @Nullable ResourceLocation location = TRBlockRegistry.BLOCKS.getKey(value.getValue());
            if (location.getNamespace().matches(WhoCosmetics.MOD_ID)) {

                if (value instanceof MonitorBlock monitorBlock) {
                    ResourceLocation vicMon = ResourceLocation.fromNamespaceAndPath(WhoCosmetics.MOD_ID, "block/victorian_monitor");
                    ResourceLocation vicMonHanging = ResourceLocation.fromNamespaceAndPath(WhoCosmetics.MOD_ID, "block/victorian_monitor_hanging");
                    threeDeeRotatingHanging(monitorBlock, vicMon, vicMonHanging);
                    continue;
                }

                if(value instanceof HorizontalDirectionalBlock directionalBlock){
                    ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(WhoCosmetics.MOD_ID, "block/" + location.getPath());
                    threeDeeRotating(directionalBlock, texture);
                    continue;
                }

                if(value instanceof Nitro9Block nitro9Block){
                    customLocation(nitro9Block, ResourceLocation.fromNamespaceAndPath(WhoCosmetics.MOD_ID, "block/nitro_9"));
                    continue;
                }

                simpleBlock(value.getValue());
            }
        }
    }

    public JsonObject customLocation(Block block, ResourceLocation resourceLocation) {
        return getVariantBuilder(block).partialState().modelForState().modelFile(models().getExistingFile(resourceLocation)).addModel().toJson();
    }

    // Paul McGann is...
    public JsonObject threeDeeRotating(Block block, ResourceLocation location) {
        return getVariantBuilder(block).forAllStates(
                state -> ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(location)).rotationY((int) state.getValue(HorizontalDirectionalBlock.FACING).toYRot()).build()).toJson();
    }

    public JsonObject threeDeeRotatingHanging(Block block, ResourceLocation location, ResourceLocation hanging) {
        return getVariantBuilder(block).forAllStates(
                state -> ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(state.getValue(MonitorBlock.HANGING) ? hanging : location)).rotationY((int) state.getValue(HorizontalDirectionalBlock.FACING).toYRot()).build()).toJson();
    }


    public JsonObject fourDRotating(Block block, ResourceLocation location) {
        return getVariantBuilder(block).forAllStates(
                state -> ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(location)).rotationY((int) (state.getValue(FacingEntityBlock.ROTATION) * 90F)).build()).toJson();

    }

}