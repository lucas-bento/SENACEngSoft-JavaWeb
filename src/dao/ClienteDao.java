package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabd.jdbc.ConnectionFactory;
import modelo.Cliente;

public class ClienteDao {
	private ConnectionFactory factory;
	
	
	public ClienteDao() {
		this.factory = new ConnectionFactory();
	}
	
	public void inserir(Cliente cliente) {
		String sql = "insert into clientes (nome,email,endereco) values (?,?,?)";
		
		try(Connection con = factory.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);) {
			
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getEndereco());
			
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void delete(Long id)  {
		String sql = "delete from clientes where id=?";
		
		try(Connection con = factory.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);) {
			
			stmt.setLong(1, id);
			stmt.execute();
		} catch (Exception e) {
			
		}
	}
	
	public void edit(Cliente cliente) throws SQLException {
		String sql = "update clientes set nome=?, email=?, endereco=? where id=?";
		
		try(Connection con = factory.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);) {
			
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getEndereco());
			stmt.setLong(4, cliente.getId());
			
			stmt.execute();
		}
	}
	
	public List<Cliente> listar() throws SQLException {
		String sql = "select * from clientes";
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		try(Connection con = factory.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet resultSet = stmt.executeQuery();) {
			
			while(resultSet.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setId(resultSet.getLong("id"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setEmail(resultSet.getString("email"));
				cliente.setEndereco(resultSet.getString("endereco"));
				
				clientes.add(cliente);
			}
		}
		
		return clientes;
	}

	public Cliente find(long id) throws SQLException {
		String sql = "select * from clientes where id=?";
		
		try(Connection con = factory.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);) {
			stmt.setLong(1, id);
			
			ResultSet resultSet = stmt.executeQuery();
			
			if(resultSet.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setId(resultSet.getLong("id"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setEmail(resultSet.getString("email"));
				cliente.setEndereco(resultSet.getString("endereco"));
				
				return cliente;
			}
		}
		
		return null;
		
	}
}
