package com.my.cara;

public class CarManualBuilder implements Builder {
	private String type;
	private int seats;

	public void setType(String type) {
		this.type= type;
		
	}

	public void setSeats(int seatCount) {
		this.seats=seatCount;
	}
	
	public Manual build() {
		return new Manual(type, seats);
	}
	

}
