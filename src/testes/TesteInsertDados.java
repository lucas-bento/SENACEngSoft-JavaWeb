package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javabd.jdbc.ConnectionFactory;

public class TesteInsertDados {
	public static void main(String[] args) throws SQLException {
		String sql = "insert into clientes (nome,email,endereco) values (?,?,?)";
		try (Connection con = new ConnectionFactory().getConnection();
			 PreparedStatement stmt = con.prepareStatement(sql);){

			stmt.setString(1, "zé");
			stmt.setString(2, "zeh@gmail.com");
			stmt.setString(3, "Rua das Flores");
			stmt.execute();
		}
		
		System.out.println("Gravado co sucesso");
	}
}
