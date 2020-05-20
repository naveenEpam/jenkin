package com.my.duck;

public class plasticDuck extends Duck{
	
	public plasticDuck() {
		quackBehaviour = new ToyQuack();
		flBehaviour = new FlyNoWay();
	}

	@Override
	public void display() {
	System.out.println("display");
		
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flBehaviour = flyBehaviour;
	}
	
	public void setQuacakBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	

}
