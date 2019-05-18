package testes;

import java.sql.Connection;
import java.sql.SQLException;

import javabd.jdbc.ConnectionFactory;

public class TestConnection {
	public static void main(String[] args) throws SQLException {
		try(Connection connection = new ConnectionFactory().getConnection()) {
			
		}
	}
}
