package mc.craig.software.cosmetics.forge.data;

import com.google.gson.JsonObject;
import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.blocks.MonitorBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

public class ModelProviderBlock extends BlockStateProvider {

    public ModelProviderBlock(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, WhoCosmetics.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (Block value : ForgeRegistries.BLOCKS.getValues()) {
            @Nullable ResourceLocation location = ForgeRegistries.BLOCKS.getKey(value);
            if (location.getNamespace().matches(WhoCosmetics.MOD_ID)) {

                if (value instanceof MonitorBlock monitorBlock) {
                    ResourceLocation vicMon = new ResourceLocation(WhoCosmetics.MOD_ID, "block/victorian_monitor");
                    threeDeeRotating(monitorBlock, vicMon);
                    continue;
                }

                simpleBlock(value);
            }
        }
    }

    public JsonObject customLocation(Block block, ResourceLocation resourceLocation) {
        return getVariantBuilder(block).partialState().modelForState().modelFile(models().getExistingFile(resourceLocation)).addModel().toJson();
    }

    // Paul McGann is...
    public JsonObject threeDeeRotating(Block block, ResourceLocation location) {
        return getVariantBuilder(block).forAllStates(
                state -> ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(location)).rotationY((int) state.getValue(HorizontalDirectionalBlock.FACING).toYRot() - 90).build()).toJson();

    }

}