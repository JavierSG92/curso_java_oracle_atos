<%-- 
    Document   : 06_cookies
    Created on : 20-feb-2019, 16:10:48
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    //Creamos las cookies
    Cookie nombre = new Cookie("nombre_c", request.getParameter("nombre"));
    Cookie apellidos = new Cookie("apellidos_c", request.getParameter("apellidos"));
    
    //Cambiamos el tiempo de duración de ambas cookies
    nombre.setMaxAge(60*60*24);
    apellidos.setMaxAge(60*60*24);
    
    //Añadimos las cookies a la cabecera de la respuesta
    response.addCookie(nombre);
    response.addCookie(apellidos);
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestinando cookies JSP</title>
    </head>
    <body>
        <h1>Destinando cookies JSP</h1>
        <ul>
            <li>
                <p>Nombre: 
                <%= request.getParameter("nombre")%></p>
            </li>
            <li>
                <p>Apellidos: 
                <%= request.getParameter("apellidos")%></p>
            </li>
        </ul>
            <h2>Leyendo las cookies</h2>
            <%
            Cookie cookie = null;
            Cookie cookies[] = null;
            //Obtenemos las cookies asociadas a este dominio
            cookies = request.getCookies();
            
            if (cookies != null){ 
                out.println("<h3>Cookies encontradas y su valor</h3>");
                for (int i = 0; i <cookies.length; i++) { 
                    cookie = cookies[i];
                    out.println("Nombre: " + cookie.getName() + ",");
                    out.println("Valor: " + cookie.getValue() + "<br/>");
                }
            } else { 
                out.println("<h3>No hay cookies</h3>");
            }
            %>
    </body>
</html>
