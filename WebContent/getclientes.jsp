<%@page import="java.util.List"%>
<%@ page import="dao.*, modelo.*, javabd.jdbc.*, javaweb.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP getclientes</title>
</head>
<body>
<ul>
<%
		ClienteDao dao = new ClienteDao();
		
		List<Cliente> lista = dao.listar();
		
		for (Cliente cliente: lista) {
%>
			<li>		
	    		Nome:  <%=cliente.getNome()%> <br />
				Email:  <%=cliente.getEmail()%> <br />
				Endereco:   <%=cliente.getEndereco()%> <br />
			</li>
<%
		}
%>
</ul>
</body>
</html>