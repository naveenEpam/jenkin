package com.my.designpattern.factory;

public class SecureSqlServerConnection implements Connection{

	public void doSomeOperation() {
		System.out.println("Performing a db operation on sql server after opening a secured connection.........");
	}
}
