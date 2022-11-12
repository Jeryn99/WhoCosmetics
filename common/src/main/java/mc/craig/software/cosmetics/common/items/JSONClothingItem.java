package mc.craig.software.cosmetics.common.items;


import mc.craig.software.cosmetics.common.WCItems;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class JSONClothingItem extends Item implements DyeableLeatherItem {
    private final EquipmentSlot slotType;
    private final boolean isColored;
    private final int defaultColor;

    public JSONClothingItem(EquipmentSlot slot, boolean isColored, int defaultColor) {
        super(WCItems.GENERIC_PROPERTIES);
        this.slotType = slot;
        this.isColored = isColored;
        this.defaultColor = defaultColor;
    }

    public JSONClothingItem(EquipmentSlot slot) {
        super(WCItems.GENERIC_PROPERTIES);
        this.slotType = slot;
        this.isColored = false;
        this.defaultColor = 0;
    }

    @Override
    public void fillItemCategory(CreativeModeTab category, NonNullList<ItemStack> items) {
        super.fillItemCategory(category, items);

        if (isColored && getItemCategory() == category) {
            for (DyeColor value : DyeColor.values()) {
                ItemStack stack = new ItemStack(this);
                setColor(stack, value.getMaterialColor().col);
                items.add(stack);
            }
        }
    }

    @Override
    public int getColor(ItemStack itemStack) {
        CompoundTag compoundNBT = itemStack.getTagElement("display");
        return compoundNBT != null && compoundNBT.contains("color", 99) ? compoundNBT.getInt("color") : defaultColor;
    }

    public boolean isColored() {
        return isColored;
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