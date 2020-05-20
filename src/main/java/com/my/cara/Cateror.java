package com.my.cara;

public class Cateror {
	
	public void constructSportsCar(Builder builder) {
		builder.setSeats(2);
		builder.setType("Sports Car");
	}
	
	public void constructSedanCar(Builder builder) {
		builder.setSeats(4);
		builder.setType("Sedan Car");
	}
	
	public void constructSuvCar(Builder builder) {
		builder.setSeats(6);
		builder.setType("SUV Car");
	}

}
