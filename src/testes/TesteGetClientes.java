package testes;

import java.sql.SQLException;
import java.util.List;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteGetClientes {
	public static void main(String[] args) throws SQLException {
		ClienteDao dao = new ClienteDao();
		
		List<Cliente> lista = dao.listar();
		
		lista.stream().forEach(cliente -> {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Email: " + cliente.getEmail());
			System.out.println("Endereco: " + cliente.getEndereco());
			System.out.print("---------------------------------------------------\n");
		});
	}
}
