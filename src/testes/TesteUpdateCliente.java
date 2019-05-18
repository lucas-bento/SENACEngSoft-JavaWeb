package testes;

import java.sql.SQLException;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteUpdateCliente {
	public static void main(String[] args) throws SQLException {
		ClienteDao dao = new ClienteDao();
		
		
		Long id = dao.listar()
					 .stream()
					 .findFirst()
					 .map(Cliente::getId)
					 .orElseThrow(() -> new RuntimeException("NAO TEM!!"));
		
		Cliente found = dao.find(id);
		
		found.setNome("Alterado");
		found.setEmail("novoemail@gmail.com");
		found.setEndereco("novo endereço");
		
		dao.edit(found);
		
		Cliente cliente = dao.find(id);
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Email: " + cliente.getEmail());
		System.out.println("Endereco: " + cliente.getEndereco());
		System.out.print("---------------------------------------------------\n");
	}
}
