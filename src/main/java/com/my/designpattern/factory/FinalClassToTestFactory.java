package com.my.designpattern.factory;

public class FinalClassToTestFactory {
	
	public static void main(String[] args) {
	
	BaseConnectionFactory b = new SecureConnectionFactory();
	
		
	TestGofFactoryMethod t = new TestGofFactoryMethod(b);
	t.testGofFactories();
	
	 b = new NormalConnectionFactory();
	
		
		TestGofFactoryMethod t1 = new TestGofFactoryMethod(b);
		t1.testGofFactories();
	
	}
}
