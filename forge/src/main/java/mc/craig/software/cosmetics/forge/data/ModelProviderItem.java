package mc.craig.software.cosmetics.forge.data;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.WCBlocks;
import mc.craig.software.cosmetics.common.WCItems;
import mc.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

import static mc.craig.software.cosmetics.common.WCItems.ITEMS;

public class ModelProviderItem extends ItemModelProvider {

    public ModelProviderItem(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator.getPackOutput(), WhoCosmetics.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(WCItems.DAVROS_BLACK.get());
        basicItem(WCItems.DAVROS_GOLD.get());

        for (RegistrySupplier<Item> value : ITEMS.getEntries()) {
            if(value instanceof BlockItem && getKey(value.get()).getNamespace().matches(WhoCosmetics.MOD_ID)){
                blockItem(Objects.requireNonNull(getKey(value.asItem())));
            }
        }

        basicItem(Objects.requireNonNull(getKey(WCBlocks.CORAL_CHAIR.get().asItem())));
        basicItem(Objects.requireNonNull(getKey(WCBlocks.TOYOTA_ROTOR.get().asItem())));
        basicItem(Objects.requireNonNull(getKey(WCBlocks.CLASSIC_ROTOR.get().asItem())));
        basicItem(Objects.requireNonNull(getKey(WCBlocks.CLASSIC_DOORS.get().asItem())));
        basicItem(Objects.requireNonNull(getKey(WCBlocks.WHIRLY_GIG.get().asItem())));


    }

    public @Nullable ResourceLocation getKey(Item item) {
        return ForgeRegistries.ITEMS.getKey(item);
    }

    public ItemModelBuilder toolItem(ResourceLocation item) {
        return getBuilder(item.toString())
                .parent(new ModelFile.UncheckedModelFile("item/handheld"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), "item/" + item.getPath()));
    }


    public ItemModelBuilder blockItem(ResourceLocation item) {
        return getBuilder(item.toString())
                .parent(new ModelFile.UncheckedModelFile(ResourceLocation.fromNamespaceAndPath(item.getNamespace(), "block/" + item.getPath())));
    }

    public ItemModelBuilder layeredItem(ResourceLocation destination, ResourceLocation item, ResourceLocation resourceLocation) {
        return getBuilder(destination.toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), "item/" + item.getPath()))
                .texture("layer1", ResourceLocation.fromNamespaceAndPath(resourceLocation.getNamespace(), "item/" + resourceLocation.getPath()));
    }

    public ItemModelBuilder layeredItem(ResourceLocation item, ResourceLocation resourceLocation) {
        return getBuilder(item.toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), "item/" + item.getPath()))
                .texture("layer1", ResourceLocation.fromNamespaceAndPath(resourceLocation.getNamespace(), "item/" + resourceLocation.getPath()));
    }
}