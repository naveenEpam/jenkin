package com.my.cara;

public class Manual {
	
	private final String type;
	private final int seats;
	
	public Manual(String type, int seats) {
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
	
	public String print() {
		String info= "" ;
		info += "Type of car is : "+ type + "\n";
		info += "Seating Capacity of the car is : "+ seats + "\n";
		info += "This is a sample manual ";
		return info;
	}
	

}
