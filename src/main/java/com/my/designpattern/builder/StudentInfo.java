package com.my.designpattern.builder;

public class StudentInfo {
	private String id;
	private String email;
	private Name name;
	

	private StudentInfo (Builder builder) {
		this.id = builder.id;
		this.email = builder.email;
		this.name=builder.Name;
	}
	
	public static class Builder{
		
		private String Starter;
		private String mainCourse;
		private String dessert;
		
		public Builder(String mainCourse) {
			this.mainCourse=mainCourse;
			
		}
		
		public Builder starter(String starter) {
			this.Starter = starter;
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
		
		public StudentInfo build() {
			return new StudentInfo(this);
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
