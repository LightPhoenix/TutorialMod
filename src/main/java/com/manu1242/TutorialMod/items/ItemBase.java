package com.manu1242.TutorialMod.items;

import com.manu1242.TutorialMod.Main;
import com.manu1242.TutorialMod.init.ModItems;
import com.manu1242.TutorialMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel  {
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0 ,"inventory");
		
	}
	


}
