package com.my.cara;

public class CarBuilder implements Builder {
	
	private String type;
	private int seats;

	public void setType(String type) {
		this.type=type;
	}

	public void setSeats(int seatCount) {
		this.seats=seatCount;
	}
	
	public Car build() {
		return new Car(type, seats);
	}
	

}
