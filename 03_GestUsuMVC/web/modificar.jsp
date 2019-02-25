<%-- 
    Document   : modificar
    Created on : 25-feb-2019, 13:09:02
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar usuario</title>
    </head>
    <body class="container">
        <h1>Datos actuales del usuario</h1> 
            <div class="col-lg-2"></div>
            <div class="col-lg-8">
            <form action="procesar.do" method="post" class="form-inline">            
            <p>Email:</p>
            <p><input id="email" type="text" name="email" autocomplete="true" size="100" maxlength="100" required="true" 
                       placeholder="Introduzca su email" class="form-control"/></p>  
            <p>Contraseña:</p>
            <p><input id="con" type="text" name="con" autocomplete="true" size="100" maxlength="100" required="true" 
                       placeholder="Introduzca su contraseña" class="form-control"/></p>  
        <h1>Introduzca nuevos datos del usuario</h1> 
            <p>Nuevo usuario:</p>
            <p><input id="nusu" type="text" name="nusu" autocomplete="true" size="100" maxlength="100" required="true" 
                       placeholder="Introduzca su email" class="form-control"/></p>  
            <p>Nuevo Email:</p>
            <p><input id="nemail" type="text" name="nemail" autocomplete="true" size="100" maxlength="100" required="true" 
                       placeholder="Introduzca su email" class="form-control"/></p>  
            <p>Nueva Contraseña:</p>
            <p><input id="ncon" type="text" name="ncon" autocomplete="true" size="100" maxlength="100" required="true" 
                       placeholder="Introduzca su contraseña" class="form-control"/></p> 
            <input id="modificar" type="hiden" name="modificar" value="Delete"/>
            <input type="submit" value="Enviar" class="btn btn-default"/>
        </form>
        </div>  
        <div class="col-lg-2"></div>
     </body>
</html>
