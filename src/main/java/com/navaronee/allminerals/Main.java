package com.navaronee.allminerals;

import com.navaronee.allminerals.blocks.BlockBase;
import com.navaronee.allminerals.init.ModBlocks;
import com.navaronee.allminerals.init.ModItems;
import com.navaronee.allminerals.items.ItemBase;
import com.navaronee.allminerals.proxy.CommonProxy;
import com.navaronee.allminerals.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		for(Block block : ModBlocks.BLOCKS) {
			if (block instanceof BlockBase ) {
				((BlockBase) block).initOreDict();
			}
		}
		
		for(Item item : ModItems.ITEMS) {
			if (item instanceof ItemBase ) {
				((ItemBase) item).initOreDict();
			}
		}
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
	
}
