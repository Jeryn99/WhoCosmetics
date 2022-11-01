package mc.craig.software.cosmetics.common.items;


import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class UmbrellaItem extends Item {

    public UmbrellaItem(Properties prop) {
        super(prop);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        if (!player.getItemInHand(usedHand).isEmpty() && player.isCrouching()) {
            ItemStack stack = player.getItemInHand(usedHand);
            setOpen(player.getItemInHand(usedHand), !getIsOpen(stack));
        }
        return super.use(level, player, usedHand);
    }

    public static boolean getIsOpen(ItemStack itemStack) {
        CompoundTag stackTag = itemStack.getOrCreateTag();
        if (!stackTag.contains("open")) {
            stackTag.putBoolean("open", false);
        }
        return stackTag.getBoolean("open");
    }

    public static void setOpen(ItemStack itemStack, boolean isOpen) {
        itemStack.getOrCreateTag().putBoolean("open", isOpen);
    }
}