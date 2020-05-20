package com.my.designpattern.day6.sandwich;

public class Demmo {
	
	public static void main(String[] args) {
		
		Sandwich sandwich = 
				new DressingDecorator(
						new ChickenDecorator(
								new PlainSandwich()));
		
		Sandwich sandwich1 = new DressingDecorator(new PlainSandwich());
		
		
		
		/*
		 * Sandwich sandwich1 = new PlainSandwich(); Sandwich sandwich2 = new
		 * ChickenDecorator(sandwich1); Sandwich sandwich3 = new
		 * DressingDecorator(sandwich2);
		 */
		
		
		
		System.out.println(sandwich.make());
		//System.out.println(sandwich3.make());
		
		
	}

}
