package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestePrimeiraRegraFake implements Regra {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Executando a regra de negócio fake");
		System.out.println("Retornando para a view response...");
		return "testeprimeiraregrafake.jsp";
	}
}
