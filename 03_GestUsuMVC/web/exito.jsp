<%-- 
    Document   : exito
    Created on : 22-feb-2019, 12:47:51
    Author     : USUARIO
--%>
<%@page import="modelo.usuario.Usuario"%>
<%-- 
Usuario u1 = (Usuario) session.getAttribute("usuario1");
--%>        
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario registrado</title>
    </head>
    <body>
        <h1>Registro de usuario realizado con éxito</h1>
        <a href="login.jsp">Login</a>
     <%--   <h2>Nombre: <%= u1.getName() %> </h2>
        <h2>Edad: <%= u1.getAge() %></h2>
        <h2>Email: <%= u1.getEmail() %></h2> --%>
    </body>
</html>
