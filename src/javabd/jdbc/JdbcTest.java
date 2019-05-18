package javabd.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static void main(String[] args) throws SQLException {
		
		String query = "show tables";
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test", "root", "");
		     Statement statement = connection.createStatement();
			 ResultSet resultSet = statement.executeQuery(query);) {
			
			while(resultSet.next()) {
				String string = resultSet.getString("Tables_in_test");
				System.out.println(string);
			}
		}
	}
}
