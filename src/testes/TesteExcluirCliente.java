package testes;

import java.sql.SQLException;

import dao.ClienteDao;

public class TesteExcluirCliente {
	public static void main(String[] args) throws SQLException {
		ClienteDao dao = new ClienteDao();
		
		dao.listar().stream()
		            .forEach(cliente -> dao.delete(cliente.getId()));
		
	}
}
