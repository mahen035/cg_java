package com.training.cg.dp;

public class VegRestaurant implements Hotel{

	@Override
	public Menu getMenus() {
		
		VegMenu vm = new VegMenu();
		return vm;
	}

}
