package me.suff.mc.wc.common.tiles;

import me.suff.mc.wc.common.WCContainers;
import me.suff.mc.wc.common.items.ClothingItem;
import me.suff.mc.wc.common.items.JSONClothingItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/* Created by Craig on 14/03/2021 */
public class WardrobeContainer extends Container implements Supplier< Map< Integer, Slot > > {
    private final World world;
    private final PlayerEntity entity;
    private int x, y, z;
    private IItemHandler internal;
    private final Map< Integer, Slot > customSlots = new HashMap<>();
    private boolean bound = false;

    public WardrobeContainer(int id, PlayerInventory inv, PacketBuffer extraData) {
        super(WCContainers.WARDROBE.get(), id);
        this.entity = inv.player;
        this.world = inv.player.world;
        this.internal = new ItemStackHandler(9);
        BlockPos pos = null;
        if (extraData != null) {
            pos = extraData.readBlockPos();
            this.x = pos.getX();
            this.y = pos.getY();
            this.z = pos.getZ();
        }
        if (pos != null) {
            if (extraData.readableBytes() == 1) { // bound to item
                byte hand = extraData.readByte();
                ItemStack itemstack;
                if (hand == 0)
                    itemstack = this.entity.getHeldItemMainhand();
                else
                    itemstack = this.entity.getHeldItemOffhand();
                itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
                    this.internal = capability;
                    this.bound = true;
                });
            } else if (extraData.readableBytes() > 1) {
                extraData.readByte(); // drop padding
                Entity entity = world.getEntityByID(extraData.readVarInt());
                if (entity != null)
                    entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
                        this.internal = capability;
                        this.bound = true;
                    });
            } else { // might be bound to block
                TileEntity ent = inv.player != null ? inv.player.world.getTileEntity(pos) : null;
                if (ent != null) {
                    ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
                        this.internal = capability;
                        this.bound = true;
                    });
                }
            }
        }
        this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 7, 8) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return isValid(stack);
            }
        }));
        this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 43, 8) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return isValid(stack);
            }
        }));
        this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 79, 8) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return isValid(stack);
            }
        }));
        this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 115, 8) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return isValid(stack);
            }
        }));
        this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 151, 8) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return isValid(stack);
            }
        }));
        this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 25, 26) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return isValid(stack);
            }
        }));
        this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 61, 26) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return isValid(stack);
            }
        }));
        this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 97, 26) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return isValid(stack);
            }
        }));

        this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 133, 26) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return isValid(stack);
            }
        }));

        int si;
        int sj;
        for (si = 0; si < 3; ++si)
            for (sj = 0; sj < 9; ++sj)
                this.addSlot(new Slot(inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18));
        for (si = 0; si < 9; ++si)
            this.addSlot(new Slot(inv, si, 8 + si * 18, 142));
    }

    public Map< Integer, Slot > get() {
        return customSlots;
    }

    public static boolean isValid(ItemStack stack){
        EquipmentSlotType slot = MobEntity.getSlotForItemStack(stack);
        return slot != EquipmentSlotType.MAINHAND && slot != EquipmentSlotType.OFFHAND;
    }
    
    @Override
    public boolean canInteractWith(PlayerEntity player) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if (index < 9) {
                if (!this.mergeItemStack(itemstack1, 9, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
                slot.onSlotChange(itemstack1, itemstack);
            } else if (!this.mergeItemStack(itemstack1, 0, 9, false)) {
                if (index < 9 + 27) {
                    if (!this.mergeItemStack(itemstack1, 9 + 27, this.inventorySlots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                } else {
                    if (!this.mergeItemStack(itemstack1, 9, 9 + 27, false)) {
                        return ItemStack.EMPTY;
                    }
                }
                return ItemStack.EMPTY;
            }
            if (itemstack1.getCount() == 0) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }
            slot.onTake(playerIn, itemstack1);
        }
        return itemstack;
    }

    @Override
    protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
        boolean flag = false;
        int i = startIndex;
        if (reverseDirection) {
            i = endIndex - 1;
        }
        if (stack.isStackable()) {
            while (!stack.isEmpty()) {
                if (reverseDirection) {
                    if (i < startIndex) {
                        break;
                    }
                } else if (i >= endIndex) {
                    break;
                }
                Slot slot = this.inventorySlots.get(i);
                ItemStack itemstack = slot.getStack();
                if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && areItemsAndTagsEqual(stack, itemstack)) {
                    int j = itemstack.getCount() + stack.getCount();
                    int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
                    if (j <= maxSize) {
                        stack.setCount(0);
                        itemstack.setCount(j);
                        slot.putStack(itemstack);
                        flag = true;
                    } else if (itemstack.getCount() < maxSize) {
                        stack.shrink(maxSize - itemstack.getCount());
                        itemstack.setCount(maxSize);
                        slot.putStack(itemstack);
                        flag = true;
                    }
                }
                if (reverseDirection) {
                    --i;
                } else {
                    ++i;
                }
            }
        }
        if (!stack.isEmpty()) {
            if (reverseDirection) {
                i = endIndex - 1;
            } else {
                i = startIndex;
            }
            while (true) {
                if (reverseDirection) {
                    if (i < startIndex) {
                        break;
                    }
                } else if (i >= endIndex) {
                    break;
                }
                Slot slot1 = this.inventorySlots.get(i);
                ItemStack itemstack1 = slot1.getStack();
                if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
                    if (stack.getCount() > slot1.getSlotStackLimit()) {
                        slot1.putStack(stack.split(slot1.getSlotStackLimit()));
                    } else {
                        slot1.putStack(stack.split(stack.getCount()));
                    }
                    slot1.onSlotChanged();
                    flag = true;
                    break;
                }
                if (reverseDirection) {
                    --i;
                } else {
                    ++i;
                }
            }
        }
        return flag;
    }

    @Override
    public void onContainerClosed(PlayerEntity playerIn) {
        super.onContainerClosed(playerIn);
        if (!bound && (playerIn instanceof ServerPlayerEntity)) {
            if (!playerIn.isAlive() || ((ServerPlayerEntity) playerIn).hasDisconnected()) {
                for (int j = 0; j < internal.getSlots(); ++j) {
                    playerIn.dropItem(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
                }
            } else {
                for (int i = 0; i < internal.getSlots(); ++i) {
                    playerIn.inventory.placeItemBackInInventory(playerIn.world,
                            internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
                }
            }
        }
    }
}
