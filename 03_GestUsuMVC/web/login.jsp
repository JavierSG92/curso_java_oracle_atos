<%-- 
    Document   : login
    Created on : 25-feb-2019, 12:47:27
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="container">
        <h1>Acceso de Usuario</h1> 
            <div class="col-lg-2"></div>
            <div class="col-lg-8">
            <form action="procesar.do" method="get" class="form-inline">
            <p>Email:</p>
            <p><input id="email" type="text" name="email" autocomplete="true" size="100" maxlength="100" required="true" 
                       placeholder="Introduzca su email" class="form-control"/></p>  
            <p>Contraseña:</p>
            <p><input id="con" type="text" name="con" autocomplete="true" size="100" maxlength="100" required="true" 
                       placeholder="Introduzca su contraseña" class="form-control"/></p>  
            <input type="submit" value="Enviar" class="btn btn-default"/>
        </form>
        </div>  
        <div class="col-lg-2"></div>
     </body>  
</html>
