package com.Octax.GodlyFoods.items;

import com.Octax.GodlyFoods.Main;
import com.Octax.GodlyFoods.init.ModItems;
import com.Octax.GodlyFoods.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void RegisterModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
