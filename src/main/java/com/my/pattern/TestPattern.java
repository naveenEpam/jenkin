package com.my.pattern;

public class TestPattern {
	
	public static void main(String[] args) {
		
		long timeBefore = 0;
		long timeAfter = 0;
		
		timeBefore = System.currentTimeMillis();
		MySingleton iObj = MySingleton.getInstance();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(iObj);
		System.out.println(timeAfter - timeBefore);
		
		
		
		
		timeBefore = System.currentTimeMillis();
		MySingleton iObj2 = MySingleton.getInstance();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(iObj2);
		System.out.println(timeAfter - timeBefore);
		
		
		
	}

}
