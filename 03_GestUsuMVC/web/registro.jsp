<%-- 
    Document   : registro
    Created on : 21-feb-2019, 16:38:48
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de usuario</title>
    </head>
     <body class="container">
        <h1>Registro de usuario</h1> 
            <div class="col-lg-2"></div>
            <div class="col-lg-8">
            <form action="procesar.do" method="post" class="form-inline">
            <p>Usuario:</p>
            <p><input type="text" id="usu" name="usu" autocomplete="true" size="100" maxlength="100" required="true" 
                    placeholder="Introduzca el usuario" class="form-control"/></p>
            <p>Edad:</p>
            <p><input id="edad" name="edad" size="100" maxlength="100" required="true" placeholder="Introduzca su edad">
                    </input></p>
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
