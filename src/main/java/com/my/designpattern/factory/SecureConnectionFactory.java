package com.my.designpattern.factory;

public class SecureConnectionFactory implements BaseConnectionFactory {

	public Connection createConnect(String type) {
		Connection connection = null;
		if (type.equalsIgnoreCase("oracle")) {
			connection = new SecureOracleConnection();
		} else if (type.equalsIgnoreCase("sql")) {
			connection = new SecureSqlServerConnection();
			// connection.doSomeOperation();
		}
		return connection;
	}
}
