<%-- 
    Document   : cabecera
    Created on : 20-feb-2019, 16:50:33
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<header><h1>Ejemplos JSP curso java</h1></header>
    <nav>
        <% String[] urls = {"00_probando.jsp","01_expresiones.jsp","02_scriptlets.jsp","03_ejerc_scriptlets.jsp","04_req_ses.jsp","05_sesiones.jsp","06_cookies_form.jsp"};
           String[] nombres = {"Probar", "Expresiones", "Scriptlets", "Ejercicios Scriptlets", "Petición y respuesta", "Sesiones", "Cookies"};
           for (int i = 0; i < urls.length; i++) {
               %>
               <a href"<%= urls[i] %>"> <%= nombres[i] %></a>
           <%}
        %>
        <a href="00_probando.jsp">Probar</a>
        <a href="01_expresiones.jsp">Expresiones</a>
        <a href="02_scriptlets.jsp">Scriptlets</a>
        <a href="03_ejerc_scriptlets.jsp">Ejercicio Scriptlets</a>
        <a href="04_req_ses.jsp">Petición y respuesta</a>
        <a href="05_sesiones.jsp">sesiones</a>
        <a href="06_cookies_form.jsp">Formulario cookies JSP</a>
    </nav>
        <%! 
        private String dameTitulo(String titulo) {
            return "<h2 style='color: purple;'>" + titulo + "</h2>";
        }
            %>
