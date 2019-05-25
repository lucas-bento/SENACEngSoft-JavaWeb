package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;

public class RegraDeletaClientes implements Regra {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Long id =  Long.valueOf( request.getParameter("id"));
		
		ClienteDao dao = new ClienteDao();
		
		dao.delete(id);
		
		return "testejstl2.jsp";
	}

}
