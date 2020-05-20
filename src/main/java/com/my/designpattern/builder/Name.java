package com.my.designpattern.builder;

import com.my.designpattern.builder.StudentInfo.Builder;

public class Name {
	private String surname;
	private String firstName;
	private String lastName;
	
	private Name (Builder builder) {
		this.surname=builder.surname;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
	}
	
	public static class Builder{
		
		private String surname;
		private String firstName;
		private String lastName;
		
		public Builder(String surname) {
			this.surname=surname;
			
		}
		
		public Builder starter(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		
		public Name build() {
			return new Name(this);
		}
		
	}
	
}
