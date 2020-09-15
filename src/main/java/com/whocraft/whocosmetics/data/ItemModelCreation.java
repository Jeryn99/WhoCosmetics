package com.whocraft.whocosmetics.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.common.items.JSONClothingItem;
import com.whocraft.whocosmetics.common.items.UmbrellaItem;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Predicate;

public class ItemModelCreation implements IDataProvider {

    public static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    DataGenerator generator;

    public ItemModelCreation(DataGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void act(DirectoryCache cache) throws IOException {
        Path base = generator.getOutputFolder();
        Predicate<Item> itemPredicate = item -> !(item instanceof JSONClothingItem || item instanceof UmbrellaItem) && item.getRegistryName().getNamespace().equals(WhoCosmetics.MODID);

        for (Item item : ForgeRegistries.ITEMS.getValues()) {
            if (itemPredicate.test(item)) {
                generateSpriteItem(getPath(base, item), cache, item.getRegistryName().getPath());
            }
        }

        for (Block b : ForgeRegistries.BLOCKS) {
            if (b.getRegistryName().getNamespace().equals(WhoCosmetics.MODID)) {
                IDataProvider.save(GSON, cache, this.createBlockModel(b), getPath(base, b.asItem()));
            }
        }

    }

    public static Path getPath(Path base, Item item) {
        ResourceLocation key = item.getRegistryName();
        return base.resolve("assets/" + key.getNamespace() + "/models/item/" + key.getPath() + ".json");
    }

    public void generateSpriteItem(Path path, DirectoryCache cache, String... textures) throws IOException {
        JsonObject doc = new JsonObject();
        doc.add("parent", new JsonPrimitive("item/generated"));

        JsonObject tex = new JsonObject();
        int index = 0;
        for (String s : textures) {
            tex.add("layer" + index, new JsonPrimitive("whocosmetics:item/" + s));
        }
        doc.add("textures", tex);



        IDataProvider.save(GSON, cache, doc, path);

    }

    public JsonObject createBlockModel(Block block) {
        ResourceLocation key = block.getRegistryName();
        JsonObject root = new JsonObject();
        root.add("parent", new JsonPrimitive(key.getNamespace() + ":block/" + key.getPath()));
        return root;
    }

    @Override
    public String getName() {
        return "Item Model";
    }

}
