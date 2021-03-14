package me.suff.mc.wc.common;

import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.common.items.ClothingItem;
import me.suff.mc.wc.common.tiles.WardrobeContainer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/* Created by Craig on 14/03/2021 */
public class WCContainers {
    public static final DeferredRegister< ContainerType<?> > CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, WhoCosmetics.MODID);
    public static final RegistryObject< ContainerType<WardrobeContainer> > WARDROBE = CONTAINERS.register("wardrobe", () -> IForgeContainerType.create(WardrobeContainer::new));

}
