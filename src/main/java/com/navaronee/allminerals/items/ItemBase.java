package com.navaronee.allminerals.items;

import com.navaronee.allminerals.Main;
import com.navaronee.allminerals.init.ModItems;
import com.navaronee.allminerals.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBase extends Item implements IHasModel {
	
	private String oreDict;

	public ItemBase(String name, String oreDict)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		this.oreDict = oreDict;
		
		ModItems.ITEMS.add(this);
	}
	
	public ItemBase(String name) {
		this(name,null);
	}
	
	public void initOreDict() {
		if (oreDict != null) {
			OreDictionary.registerOre(oreDict, this);	
		}		
	}
	
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,0,"inventory");
	}

}
