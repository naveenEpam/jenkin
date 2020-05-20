package com.my.designpattern.factory;

public class SecureOracleConnection implements Connection{

	public void doSomeOperation() {
		System.out.println("Performing a db operation on Oracle throrugh secured connectoin.........");
	}
}
