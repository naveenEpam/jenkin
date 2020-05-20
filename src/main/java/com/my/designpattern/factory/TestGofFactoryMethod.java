package com.my.designpattern.factory;

public class TestGofFactoryMethod {
	BaseConnectionFactory myFactory;
	TestGofFactoryMethod(BaseConnectionFactory f){
		this.myFactory = f;
	}
	
	void testGofFactories(){
		Connection c = myFactory.createConnect("Oracle");
		c.doSomeOperation();
		
	}	
}
