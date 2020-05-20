package com.my.designpattern.factory;

public interface BaseConnectionFactory {
	
	public Connection createConnect(String type);

}
