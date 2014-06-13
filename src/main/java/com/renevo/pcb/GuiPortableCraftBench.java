package com.renevo.pcb;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiPortableCraftBench extends GuiContainer {

	private static final ResourceLocation backgroundResourceLocation = new ResourceLocation("textures/gui/container/crafting_table.png");
	
	public GuiPortableCraftBench(InventoryPlayer playerInventory, World world, int x, int y, int z) {
		super(new ContainerPortableCraftBench(playerInventory, world, x, y, z));
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRendererObj.drawString(StatCollector.translateToLocal(ItemPortableCraftBench.portableCraftBench.getUnlocalizedName() + ".name"), 8, 6, 4210752);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float arg0, int arg1, int arg2) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(backgroundResourceLocation);
		
		int j = (this.width - this.xSize) / 2;
		int k = (this.height - this.ySize) / 2;
		
		this.drawTexturedModalRect(j, k, 0, 0, this.xSize, this.ySize);
	}

}