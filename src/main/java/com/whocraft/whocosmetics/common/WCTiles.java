package com.whocraft.whocosmetics.common;

import com.whocraft.whocosmetics.WhoCosmetics;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class WCTiles {

    public static final DeferredRegister< TileEntityType< ? > > TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, WhoCosmetics.MODID);

    // public static final RegistryObject<TileEntityType<GramphoneTile>> GRAMOPHONE = TILES.register("gramophone", () -> registerTiles(GramphoneTile::new, WCBlocks.GRAMOPHONE.get()));


    private static < T extends TileEntity > TileEntityType< T > registerTiles(Supplier< T > tile, Block... validBlock) {
        return TileEntityType.Builder.create(tile, validBlock).build(null);
    }


}
