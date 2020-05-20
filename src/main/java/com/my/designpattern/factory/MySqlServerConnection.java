package com.my.designpattern.factory;

public class MySqlServerConnection implements Connection{

	public void doSomeOperation() {
		System.out.println("Performing a db operation on sql server.........");
	}
}
