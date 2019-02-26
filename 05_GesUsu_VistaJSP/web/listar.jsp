<%-- 
    Document   : index
    Created on : 21-feb-2019, 20:42:40
    Author     : IEUser
--%>
<%@include file="head.jsp" %>
<%! ArrayList<Usuario> todosUsuarios; %>
<% todosUsuarios = ServicioUsuarios.getInstancia().obtenerTodos(); %>
<html>
    <%= head() %>
    <body>
        <%@include file="header.jsp" %>
        <h1>Todos los usuarios</h1>
        <div border="2">   
            <% for (Usuario usu : todosUsuarios) { %>
                <form action="usuarios.do" method="post" name="form_<%= usu.getId() %>">                 
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
                <% } %>
        </div>
    </body>
</html>