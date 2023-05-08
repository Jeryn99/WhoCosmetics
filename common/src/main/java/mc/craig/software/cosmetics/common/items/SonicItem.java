package mc.craig.software.cosmetics.common.items;

import mc.craig.software.cosmetics.common.SonicHandler;
import mc.craig.software.cosmetics.common.WCSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class SonicItem extends Item {
    public SonicItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {

        BlockPos blockPos = context.getClickedPos();
        Level level = context.getLevel();
        Player player = context.getPlayer();

        InteractionResult sonicResult = SonicHandler.onSonic(player, level, blockPos);
        if(sonicResult == InteractionResult.SUCCESS){
            player.swing(context.getHand());
            player.playSound(WCSounds.SONIC.get());
            level.gameEvent(player, GameEvent.ITEM_INTERACT_FINISH, blockPos);
            ParticleUtils.spawnParticlesOnBlockFaces(level, blockPos, ParticleTypes.WAX_OFF, UniformInt.of(3, 5));
            player.getCooldowns().addCooldown(this, 100);
        }


        return sonicResult;
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity miningEntity) {
        return false;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return 0;
    }
}
