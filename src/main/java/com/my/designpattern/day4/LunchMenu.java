package com.my.designpattern.day4;

public class LunchMenu {
	private List<String> Starter=;
	private String mainCourse;
	private String dessert;

	private LunchMenu (Builder builder) {
		this.Starter = builder.Starter;
		this.mainCourse = builder.mainCourse;
		this.dessert=builder.dessert;
	}
	
	public static class Builder{
		
		private String Starter;
		private String mainCourse;
		private String dessert;
		
		public Builder(String mainCourse) {
			this.mainCourse=mainCourse;
			
		}
		
		public Builder starter(String starter) {
			Starter.add("starter");
			return this;
		}
		
		public Builder mainCourse(String mainCourse) {
			this.mainCourse = mainCourse;
			return this;
		}
		
		public Builder dessert(String dessert) {
			this.dessert = dessert;
			return this;
		}
		
		public LunchMenu build() {
			return new LunchMenu(this);
		}
		
	}
	
	public String getStarter() {
		return Starter;
	}
	public String getDessert() {
		return dessert;
	}
	public String getMainCourse() {
		return mainCourse;
	}
	
	
}
