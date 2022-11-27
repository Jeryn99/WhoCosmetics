package mc.craig.software.cosmetics.common.blocks;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.blockentity.CoralChairBlockEntity;
import mc.craig.software.cosmetics.common.entity.Chair;
import mc.craig.software.cosmetics.common.entity.Entities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CoralChairBlock extends Block implements EntityBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;



    public CoralChairBlock(Properties properties) {
        super(properties.noOcclusion());
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState p_60550_) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }


    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {

        List<Item> items = new ArrayList<>();

        Registry.ITEM.forEach(item -> {
            if(Registry.ITEM.getKey(item).getNamespace().matches(WhoCosmetics.MOD_ID)){
                items.add(item);
            }
        });

        if(level instanceof ServerLevel serverLevel) {
            List<CraftingRecipe> optional = serverLevel.getRecipeManager().getAllRecipesFor(RecipeType.CRAFTING);
            for (CraftingRecipe craftingRecipe : optional) {
                items.removeIf(item -> item == craftingRecipe.getResultItem().getItem());
            }

            for (Item item : items) {
                System.out.println(Registry.ITEM.getKey(item));
            }

            System.exit(1);
        }

        if(hand == InteractionHand.MAIN_HAND){
            if(level.getBlockEntity(pos) instanceof CoralChairBlockEntity blockChair){
                Chair chair = null;
                if (blockChair.getChairEntity() == null || !blockChair.chairEntity.isAlive()) {
                    chair = new Chair(Entities.CHAIR.get(), level);
                    chair.moveTo(pos, state.getValue(FACING).toYRot(), player.xRotO);
                    blockChair.setChairEntity(chair);
                    level.addFreshEntity(chair);
                } else {
                    chair = blockChair.getChairEntity();
                }

                if (!chair.hasPassenger(player)) {
                    player.startRiding(chair);
                }

            }
        }
        return super.use(state, level, pos, player, hand, hit);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CoralChairBlockEntity(pos, state);
    }
}
