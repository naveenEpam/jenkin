package com.my.designpattern.factory;

public class MyOracleConnection implements Connection{

	public void doSomeOperation() {
		System.out.println("Performing a db operation on Oracle.........");
	}
}
