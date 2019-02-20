<%-- 
    Document   : 01_expresiones
    Created on : 19-feb-2019, 16:46:37
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expresiones JSP</title>
    </head>
    <body>
        <%@include file="cabecera.jsp"%>
        <%= dameTitulo("Expresiones")%>
        <h1>Ejemplos de expresiones JSP</h1>
        <!-- Mostrar la fecha y la hora -->
        <%= new java.util.Date().toString() %> <br/>
        
        <%-- Convertir a mayúsculas un String --%>
        <%= "Texto en mayúsculas".toUpperCase() %> <br/>   
        
        <%-- Resultado de una expresión aritmética --%>
        <%= (5 + 3)/ (float) 3 %> <br/> 
        
        <%-- Generar un número aleatorio entre 0 y 99 --%>
        <%= new java.util.Random().nextInt(100) %> <br/> 
    </body>
</html>
