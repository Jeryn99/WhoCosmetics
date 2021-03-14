package me.suff.mc.wc.client.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import me.suff.mc.wc.common.tiles.WardrobeContainer;
import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;


/* Created by Craig on 14/03/2021 */
public class WardrobeScreen extends ContainerScreen< WardrobeContainer > implements IHasContainer< WardrobeContainer > {

    public WardrobeScreen(WardrobeContainer container, PlayerInventory inventory, ITextComponent text) {
        super(container, inventory, text);
        this.xSize = 176;
        this.ySize = 166;
    }

    private static final ResourceLocation texture = new ResourceLocation("whocosmetics:textures/war.png");

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        this.drawGuiContainerBackgroundLayer(matrixStack, partialTicks, mouseX, mouseY);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderHoveredTooltip(matrixStack, mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int x, int y) {
        this.font.drawString(matrixStack, "=== Coat Hangers ===", 35, 8, -12829636);
        this.font.drawString(matrixStack, "=== Boot & Shoes ===", 35, 45, -12829636);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int x, int y) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(texture);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        blit(matrixStack, i, j, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
    }


}
