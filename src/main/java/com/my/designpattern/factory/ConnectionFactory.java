package com.my.designpattern.factory;

public class ConnectionFactory {
	String type=null;
	
	

	public Connection createConnect(String type) {
	Connection connection =null;
	if(type.equalsIgnoreCase("oracle")) {
	connection = new MyOracleConnection(); 	
	}else if(type.equalsIgnoreCase("sql")) {
		connection = new MySqlServerConnection();
		//connection.doSomeOperation();
	}
	return connection;
	}
}
