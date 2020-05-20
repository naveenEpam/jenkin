package com.my.designpattern.factory;

public class DatabaseInsertions {
	
	public void method1() {
		MySqlServerConnection m = new MySqlServerConnection();
		m.doSomeOperation();
		
	}

}
