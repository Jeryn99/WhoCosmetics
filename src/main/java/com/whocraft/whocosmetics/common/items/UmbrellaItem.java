package com.whocraft.whocosmetics.common.items;

import com.whocraft.whocosmetics.Modeller;
import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.common.WCSounds;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class UmbrellaItem extends Item {
    private Modeller modeller = Modeller.END;

    public UmbrellaItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void onCreated(ItemStack itemStack, World world, PlayerEntity playerEntity) {
        super.onCreated(itemStack, world, playerEntity);
        setOpen(itemStack, false);
    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {

        if (entity.isSneaking()) {
            ItemStack itemStack = entity.getHeldItemMainhand();
            setOpen(itemStack, !getIsOpen(itemStack));
            entity.playSound(WCSounds.UMBRELLA_OPEN.get(), 1, 1);
        }

        return false;
    }

    public static boolean getIsOpen(ItemStack itemStack) {

        if(itemStack.getTag() == null){
            itemStack.setTag(new CompoundNBT());
        }

        if (!itemStack.getTag().contains("isOpen")) {
            itemStack.getTag().putBoolean("isOpen", false);
        }
        return itemStack.getTag().getBoolean("isOpen");
    }

    public static void setOpen(ItemStack itemStack, boolean isOpen) {
        itemStack.getTag().putBoolean("isOpen", isOpen);
    }


    public UmbrellaItem setModeller(Modeller modeller) {
        this.modeller = modeller;
        return this;
    }

    public Modeller getModeller() {
        return modeller;
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        super.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);
        p_77624_3_.add(new TranslationTextComponent(WhoCosmetics.MODID + ".nbt.modeller", modeller.getModellerName()));
    }
}
