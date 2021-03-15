package me.suff.mc.wc.common;

import cpw.mods.modlauncher.LaunchPluginHandler;
import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.common.tiles.HatStandTile;
import me.suff.mc.wc.common.tiles.WardrobeTile;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class WCTiles {

    public static final DeferredRegister< TileEntityType< ? > > TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, WhoCosmetics.MODID);

    public static final RegistryObject<TileEntityType< WardrobeTile >> WARDROBE = TILES.register("wardrobe", () -> registerTiles(WardrobeTile::new, WCBlocks.WARDROBE.get()));
    public static final RegistryObject<TileEntityType< HatStandTile >> HAT_STAND = TILES.register("hat_stand", () -> registerTiles(HatStandTile::new, WCBlocks.HAT_STAND.get()));


    private static < T extends TileEntity > TileEntityType< T > registerTiles(Supplier< T > tile, Block... validBlock) {
        return TileEntityType.Builder.create(tile, validBlock).build(null);
    }


}
