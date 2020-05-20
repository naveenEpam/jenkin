package com.my.designpattern.factory;

public class NormalConnectionFactory implements BaseConnectionFactory {

	public Connection createConnect(String type) {
		Connection connection = null;
		if (type.equalsIgnoreCase("oracle")) {
			connection = new MyOracleConnection();
		} else if (type.equalsIgnoreCase("sql")) {
			connection = new MySqlServerConnection();
			// connection.doSomeOperation();
		}
		return connection;
	}
}
