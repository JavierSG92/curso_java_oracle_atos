<%-- 
    Document   : 03_ejerc_scriptlets
    Created on : 19-feb-2019, 17:16:51
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
        <%@include file="cabecera.jsp"%>
        <%= dameTitulo("Ejercicios Scriptlets")%>
        <h1>Tablas de multiplicar</h1> 
        <%!
            //Declaraciones
        int i,num;
        %>
        <%-- Muestra una tabla con sus TRs, TDs, de la tabla de multiplicar del 7 --%>
            <% 
            for (num = 1; num < 6; num++){ %>

               <table style="border-width: 4px; border-style: double; display: inline-block;"> 
               <h2>TABLA DE MULTIPLICAR DEL <%= num %></h2>
               <% for (i = 0; i < 11; i++) { %>
                <tr>
                    <td><%= num %> por</td>
                    <td><%= i %></td>
                    <td>es <%= num * i %></td>
                </tr>
                <% } %>
                </table>
                <% } %>       
    </body>
</html>
