package com.my.cara;

public class Car {
	
	private final String type;
	private final int seats;
	public Car(String type, int seats) {
		super();
		this.type = type;
		this.seats = seats;
	}
	
	public String getType() {
		return type;
	}
	
	public int getSeats() {
		return seats;
	}

}
