package com.my.cara;

public class Demo {
	
	public static void main (String[] args) {
		
		Cateror c = new Cateror();
		CarBuilder builder = new CarBuilder();
		c.constructSportsCar(builder);
		
		Car car = builder.build();
		System.out.println("Car build" + car.getType());
		
		CarManualBuilder mBuilder = new CarManualBuilder();
		c.constructSuvCar(mBuilder);
		
		Manual carManual = mBuilder.build();
		
		
		System.out.println("car Manual built and the information in it is" + carManual.print());
		
		
		
	}
	

	
	

}

