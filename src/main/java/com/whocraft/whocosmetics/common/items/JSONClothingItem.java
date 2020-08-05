package com.whocraft.whocosmetics.common.items;

import com.whocraft.whocosmetics.Modeller;
import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class JSONClothingItem extends Item {
    private final EquipmentSlotType slotType;
    private Modeller modeller = Modeller.END;

    public JSONClothingItem(EquipmentSlotType slot) {
        super(WCItems.properties);
        this.slotType = slot;
    }

    public JSONClothingItem setModeller(Modeller modeller) {
        this.modeller = modeller;
        return this;
    }

    @Nullable
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack) {
        return slotType;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack playerEntityHeldItem = playerEntity.getHeldItem(hand);
        EquipmentSlotType equipmentSlotType = MobEntity.getSlotForItemStack(playerEntityHeldItem);
        ItemStack stack = playerEntity.getItemStackFromSlot(equipmentSlotType);
        if (stack.isEmpty()) {
            playerEntity.setItemStackToSlot(equipmentSlotType, playerEntityHeldItem.copy());
            playerEntityHeldItem.setCount(0);
            return new ActionResult(ActionResultType.SUCCESS, playerEntityHeldItem);
        } else {
            return new ActionResult(ActionResultType.FAIL, playerEntityHeldItem);
        }
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        super.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);
        p_77624_3_.add(new TranslationTextComponent(WhoCosmetics.MODID + ".nbt.modeller", modeller.getModellerName()));
    }
}
