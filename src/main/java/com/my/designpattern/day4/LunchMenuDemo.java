package com.my.designpattern.day4;

public class LunchMenuDemo {
	
	public LunchMenu getLunchmenu(String[] args) {
		//LunchMenu lunchMenu = new LunchMenu("vegroll", "roti", "iceCream",2,5);
		LunchMenu.Builder builder = new LunchMenu.Builder("Roti and Curry").starter("vegroll");
		
		LunchMenu lunchMenu = builder.build();	
		
		return lunchMenu;
	}
}
