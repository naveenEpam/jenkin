package com.my.pattern;

import java.lang.reflect.Constructor;

public class MySingleton {

	private static volatile MySingleton patternInstance = null;

	private MySingleton() {

		if (patternInstance != null) {
			throw new RuntimeException("This is not supposed way of calling me.  Call my getInstance()");
		}
		  

	}

	static MySingleton getInstance() {
		if (patternInstance == null) { 
			synchronized (MySingleton.class) { 
				if (patternInstance == null) {
					patternInstance = new MySingleton();
				}
			}
		}
		return patternInstance;
	}
}
