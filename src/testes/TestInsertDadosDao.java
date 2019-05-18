package testes;

import java.sql.SQLException;

import dao.ClienteDao;
import modelo.Cliente;

public class TestInsertDadosDao {
	 public static void main(String[] args) throws SQLException {
		 Cliente cliente = new Cliente();
		 
		 cliente.setNome("João");
		 cliente.setEmail("joaum@gmail.com");
		 cliente.setEndereco("Rua dos Sapos");
		 
		 
		 ClienteDao dao = new ClienteDao();
		 dao.inserir(cliente);
	}
}
