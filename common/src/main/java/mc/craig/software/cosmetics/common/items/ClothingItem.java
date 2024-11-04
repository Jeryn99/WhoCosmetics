package mc.craig.software.cosmetics.common.items;


import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.client.ClientUtil;
import mc.craig.software.cosmetics.common.WCItems;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class ClothingItem extends ArmorItem implements DyeableLeatherItem {

    private final int defaultColor;
    private boolean isColored = false, alexSupport = false;
    private String overrideTexture = null;

    public ClothingItem(ArmorMaterial armorMaterial, ArmorItem.Type EquipmentSlot) {
        this(armorMaterial, EquipmentSlot, false, DyeColor.RED.getMapColor().col);
    }

    @Override
    public EquipmentSlot getEquipmentSlot() {
        return super.getEquipmentSlot();
    }

    public ClothingItem(ArmorMaterial armorMaterial, ArmorItem.Type equipmentSlot, boolean isColored, int defaultColor) {
        super(armorMaterial, equipmentSlot, WCItems.GENERIC_PROPERTIES);
        this.defaultColor = defaultColor;
        this.isColored = isColored;
    }

    public ClothingItem setTextureOverride(String overrideTexture){
        this.overrideTexture = overrideTexture;
        return this;
    }

    public ClothingItem enableAlexSupport() {
        alexSupport = true;
        return this;
    }

    public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        String textureLocation = overrideTexture == null ? BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath() : overrideTexture;

        ResourceLocation baseResourceLocation = ResourceLocation.fromNamespaceAndPath(WhoCosmetics.MOD_ID, "textures/entity/armor/" + textureLocation + ".png");

        if(alexSupport){
            ResourceLocation steveLocation = ResourceLocation.fromNamespaceAndPath(WhoCosmetics.MOD_ID, "textures/entity/armor/steve_" + textureLocation + ".png");
            ResourceLocation alexLocation = ResourceLocation.fromNamespaceAndPath(WhoCosmetics.MOD_ID, "textures/entity/armor/slim_" + textureLocation + ".png");
            return ClientUtil.isAlex(entity) ? alexLocation : steveLocation;
        }
        return baseResourceLocation;
    }

    //TODO

/*    @Override
    public void fillItemCategory(CreativeModeTab category, NonNullList<ItemStack> items) {
        super.fillItemCategory(category, items);

        if (isColored && getItemCategory() == category) {
            for (DyeColor value : DyeColor.values()) {
                ItemStack stack = new ItemStack(this);
                setColor(stack, value.getMaterialColor().col);
                items.add(stack);
            }
        }
    }*/

    @Override
    public int getColor(ItemStack itemStack) {
        CompoundTag compoundNBT = itemStack.getTagElement("display");
        return compoundNBT != null && compoundNBT.contains("color", 99) ? compoundNBT.getInt("color") : defaultColor;
    }

    public boolean isColored() {
        return isColored;
    }
}