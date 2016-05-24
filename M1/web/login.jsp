<%-- 
    Document   : login
    Created on : 13-mag-2016, 22.34.24
    Author     : Marco
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ConvertiblePC - Login</title>
        <%@ include file="Blocchi/meta.jsp" %> 
    </head>
    <body>
        <%@ include file="Blocchi/Header.jsp" %> 
        <nav>
            <h3 id="nav_titolo">Navigazione</h3>
            <a href="descrizione.jsp">Home page</a><br>
            <a href="cliente.jsp">Pagina cliente</a><br>
            <a href="venditore.jsp">Pagina venditore</a>
            </nav>
        <%@ include file="Blocchi/right.jsp" %> 
<div id="center">
        
            <h2>Login al sito</h2>

    <c:if test="${errore != null}">
            <p>${errore}</p>
    </c:if>
    
    <form method="post" action="Login">
    <input type="hidden" value="login">
        <p>
            <label for="nome_utente"><em>Nome utente</em></label>
            <input type="text" name="Username" id="nome_utente" value="Inserire il nome utente" maxlength="30"/>
        </p>
        <p>
            <label for="password"><em>Password</em></label><input type="password" name="Password" id="password" maxlength="50"/>
            <input type="submit" name="login" value="Login">˙
        </p>
    </form>
</div>
        <%@ include file="Blocchi/footer.jsp" %>
    </body>
</html>
