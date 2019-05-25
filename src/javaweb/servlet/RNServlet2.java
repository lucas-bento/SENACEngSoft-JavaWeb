package javaweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

@SuppressWarnings("serial")
@WebServlet("/rnservletadiciona2")
public class RNServlet2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		ClienteDao dao = new ClienteDao();
		
		if("InserirCliente".equals(action)) {

			Cliente cliente = new Cliente();
			cliente.setNome(request.getParameter("nome"));
			cliente.setEmail(request.getParameter("email"));
			cliente.setEndereco(request.getParameter("endereco"));
			
			dao.inserir(cliente);
			
			RequestDispatcher rd = request.getRequestDispatcher("/clienteinserido.jsp");
			rd.forward(request, response);
			
		} else if("GetClientes".equals(action)) {
			// TODO	
		} else if("DeletaCliente".equals(action)) {
			// TODO
		}
	}
}
