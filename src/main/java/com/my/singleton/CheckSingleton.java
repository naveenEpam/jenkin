package com.my.singleton;

public class CheckSingleton {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime);

		Runtime secondRuntime = Runtime.getRuntime();
		System.out.println(secondRuntime);

		if (runtime == secondRuntime) {
			System.out.println("same instance");
		} else {
			System.out.println("Different instance");
		}
		
		//
		MySingleton mySingleton = MySingleton.getInstance();
		System.out.println(mySingleton);
		
		MySingleton mySingleton1 = MySingleton.getInstance();
		System.out.println(mySingleton1);
		
		
	}

}
