package com.my.duck;

public class DuckSimulator {
	
	public static void main(String[] args) {
		
		Duck customDuck = new IndianDuck();
		customDuck.performFly();
		customDuck.performQuck();
		
		plasticDuck pDuck = new plasticDuck();
		pDuck.performFly();
		pDuck.performQuck();
		pDuck.setFlyBehaviour(new FlyLittleHigh());
		pDuck.performFly();
		
		
		
		
	}
	
	

}
