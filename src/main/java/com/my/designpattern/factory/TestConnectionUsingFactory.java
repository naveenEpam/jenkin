package com.my.designpattern.factory;

public class TestConnectionUsingFactory {
	
	//other methods. 
	
	public static void main(String[] args) {
		ConnectionFactory factory = new ConnectionFactory();
		Connection c = factory.createConnect("sql");
		c.doSomeOperation();
	}

}
