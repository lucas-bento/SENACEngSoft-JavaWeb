package mvc.regrasdenegocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

public class RegraGetClientes implements Regra {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Cliente> clientes = new ClienteDao().getClientes();
		
		request.setAttribute("clientes", clientes);
	
		return "/WEB-INF/pages/testejstl3.jsp";
	}
}
