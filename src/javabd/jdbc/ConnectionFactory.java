package javabd.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1/test", "root", "");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
