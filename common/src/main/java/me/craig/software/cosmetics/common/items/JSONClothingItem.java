package me.craig.software.cosmetics.common.items;


import me.craig.software.cosmetics.common.WCItems;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class JSONClothingItem extends Item {
    private final EquipmentSlot slotType;

    public JSONClothingItem(EquipmentSlot slot) {
        super(WCItems.GENERIC_PROPERTIES);
        this.slotType = slot;
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemStack = player.getItemInHand(usedHand);
        EquipmentSlot equipmentSlot = Mob.getEquipmentSlotForItem(itemStack);
        ItemStack itemStack2 = player.getItemBySlot(equipmentSlot);
        if (itemStack2.isEmpty()) {
            player.setItemSlot(equipmentSlot, itemStack.copy());
            if (!level.isClientSide()) {
                player.awardStat(Stats.ITEM_USED.get(this));
            }

            itemStack.setCount(0);
            return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
        } else {
            return InteractionResultHolder.fail(itemStack);
        }
    }

    public EquipmentSlot getSlot() {
        return slotType;
    }
}