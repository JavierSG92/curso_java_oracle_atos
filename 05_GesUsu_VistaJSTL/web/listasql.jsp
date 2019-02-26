
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp" %>
<%--! ArrayList<Usuario> todosUsuarios; --%>
<%-- todosUsuarios = ServicioUsuarios.getInstancia().obtenerTodos(); --%>
<html>
    <%= head() %>
    <body>
        <%@include file="header.jsp" %>
        <h1>Todos los usuarios</h1>
        <c:catch var="excepcion">
            <jsp:useBean id="listaUsuarios" type="java.util.ArrayList<Usuario>" scope="session">  
                <jsp:getProperty property="*" name="listaUsuarios"/>
            </jsp:useBean>
        <div border="2">   
            <%-- for (Usuario usu : todosUsuarios) { --%>
            <c:forTokens items = "todosUsuarios" delims = "," var = "usuario">         
                <form action="usuarios.do" method="post" name="form_<%= usuario.getId() %>">                 
                    <input id="id" name="id" type="text"  size="4" readonly="true" value=""/>
                    <input id="nombre" name="nombre" type="text" required="true" value=""/>
                    <input id="edad" name="edad" type="number" required="true"  size="4" value=""/>
                    <input id="email" name="email" type="email" required="true" value=""/>
                    <input id="password" name="password" type="password" required="true" value=""/>
                    <input class="method" id="method" name="method" type="text" size="4" readonly="true" value="PUT"/>                    
                    <input type="submit" value="EDIT"
                           onclick="Array.from(document.getElementsByClassName('method')).forEach((thisInput) => (thisInput.value='PUT';))"/>
                    <input type="submit" value="ELIM"
                           onclick="Array.from(document.getElementsByClassName('method')).forEach((thisInput) => (thisInput.value='PUT';))"/> <br/>
                </form>
            </c:forTokens>
        </c:catch>
                <%-- } --%>
        </div>
    </body>
</html>