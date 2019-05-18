package testes;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javabd.jdbc.ConnectionFactory;

public class TesteInsertDados2 {
	public static void main(String[] args) {
		String sql = "insert into clientes (nome,email,endereco) values (?,?,?)";
		try (Connection con = new ConnectionFactory().getConnection();
			 PreparedStatement stmt = con.prepareStatement(sql);){

			stmt.setString(1, "zé");
			stmt.setString(2, "zeh@gmail.com");
			stmt.setString(3, "Rua das Flores");
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Gravado com sucesso");
	}
}
