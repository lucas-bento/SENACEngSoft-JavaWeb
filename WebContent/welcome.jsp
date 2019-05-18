<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--Comentario JSP --%>
<!-- Comentario HTML -->
<%String mensagem = "Bem vindo ao JPS!!!!"; %>
<%out.println(mensagem);%> <br /> <br />  <%-- VAriavel implicita do tipo JSPWriter bla bla bla --%>
<!-- variavel out do tipo JSPWriter que possui o metodo println -->
<!-- Imprimimos utilizando scriptlets JSP -->
<h1>Seja bem vindo ao JavaServer Pages<h1>
<%= mensagem %> <br /> <br /> 
<!--  imprimimos utilizando expressões JSP -->
<% System.out.println("Onde vai sair essa mensagem?"); %>
</body>
</html>