<%-- 
    Document   : errorcampos
    Created on : 22-feb-2019, 12:58:11
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="registro.jsp">Volver</a>
        <% if (request.getParameter("usu") == "") { 
            %>
            <h2>Falta introducir un nombre de usuario</h2>
        <% } %>
        <% if (request.getParameter("edad") == "") { 
            %>
            <h2>Falta introducir la edad</h2>
        <% } %>
        <% if (request.getParameter("email") == "") { 
            %>
            <h2>Falta introducir el email</h2>
        <% } %>
        <% if (request.getParameter("con") == "") { 
            %>
            <h2>Falta introducir una contraseña</h2>
        <% } %>
    </body>
</html>
