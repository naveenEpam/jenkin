package com.my.singleton;

public class MySingleton {

	private static MySingleton mySingleton = new MySingleton();
	
	private MySingleton(){
		
	}
	
	public static MySingleton getInstance() {
		return mySingleton;
	}
}
