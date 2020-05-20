package com.my.duck;

public class IndianDuck extends Duck{
	
	public IndianDuck() {
		quackBehaviour = new Quack();
		flBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
	System.out.println("display");
		
	}
	

}
