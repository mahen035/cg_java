package com.training.cg.dp;

public class HotelKeeper {
	
	public VegMenu getVegMenu() {
		VegRestaurant v = new VegRestaurant();
		VegMenu vm = (VegMenu)v.getMenus();
		return vm;
	}
	
	public NonVegMenu getNonVegMenu() {
		NonVegRestaurant nv = new NonVegRestaurant();
		NonVegMenu nvm = (NonVegMenu)nv.getMenus();
		return nvm;
	}

}
