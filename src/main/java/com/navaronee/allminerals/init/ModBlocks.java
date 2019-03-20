package com.navaronee.allminerals.init;

import java.util.ArrayList;
import java.util.List;

import com.navaronee.allminerals.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CHALCOPYRITE_ORE = new BlockBase("chalcopyrite_ore",Material.ROCK,2,"oreChalcopyrite");
	
	
}
