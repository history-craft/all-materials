package com.navaronee.allminerals.blocks;

import com.navaronee.allminerals.Main;
import com.navaronee.allminerals.init.ModBlocks;
import com.navaronee.allminerals.init.ModItems;
import com.navaronee.allminerals.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.oredict.OreDictionary;

public class BlockBase extends Block implements IHasModel 
{
	private String oreDict;
	
	public BlockBase(String name, int harvestLevel, String oreDict) 
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(5.0f);		
		setHarvestLevel("pickaxe", harvestLevel);
		
		this.oreDict = oreDict;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String name, Material material) {
		this(name,0,null);
	}
	
	public void initOreDict() {
		if (oreDict != null) {
			OreDictionary.registerOre(oreDict, this);
		}		
	}
	
	

	@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
