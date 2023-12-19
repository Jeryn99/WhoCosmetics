package mc.craig.software.cosmetics.common.items;

import mc.craig.software.cosmetics.common.entity.DavrosChair;
import mc.craig.software.cosmetics.common.entity.Entities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class DavrosSpawnerItem extends Item {


    private final DavrosChair.Variant variant;

    public DavrosSpawnerItem(Properties properties, DavrosChair.Variant variant) {
        super(properties);
        this.variant = variant;
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Level worldIn = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        InteractionHand hand = player.getUsedItemHand();

        if (!worldIn.isClientSide) {
            DavrosChair davrosChair = Entities.DAVROS_CHAIR.get().create(worldIn);
            davrosChair.setVariant(variant);
            davrosChair.setPos(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
            davrosChair.lookAt(player, 90.0F, 90.0F);
            player.getItemInHand(hand).shrink(1);
            worldIn.addFreshEntity(davrosChair);

            if (!player.isCreative()) {
                context.getItemInHand().shrink(1);
            }
        }
        return super.useOn(context);
    }


}