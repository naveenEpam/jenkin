package com.my.designpattern.day6.sandwich;

public class SandwichDecorator implements Sandwich {

	
	Sandwich customSandwich;
	
	public SandwichDecorator (Sandwich customSandwich) {
		this.customSandwich = customSandwich;
	}
	
	public String make() {
		return customSandwich.make();
	}

}
