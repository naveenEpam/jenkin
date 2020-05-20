package com.my.designpattern.builder;

public class LunchMenuDemo {
	
	public StudentInfo getLunchmenu(String[] args) {
		//LunchMenu lunchMenu = new LunchMenu("vegroll", "roti", "iceCream",2,5);
		Name.Builder builder1 = new Name.Builder("mySurname");
		StudentInfo.Builder builder = new StudentInfo.Builder().name(builder1.build()).starter("vegroll");
		
		StudentInfo lunchMenu = builder.build();	
		
		return lunchMenu;
		
		StringBuilder builder2;
	}
}
