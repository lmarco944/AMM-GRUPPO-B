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
        <title>ConvertiblePC e-commerce - Login</title>
        <%@ include file="Blocchi/meta.jsp" %> 
    </head>
    <body>
    
    <%@ include file="Blocchi/Header.jsp" %> 
        <nav>
            <h3 id="nav_titolo">Navigazione</h3>
            <a href="descrizione.html">Home page</a><br>
            <a href="cliente.html">Pagina cliente</a><br>
            <a href="venditore.html">Pagina venditore</a>
            </nav>
                <div id="center">
                
                    <h3> Bentornato,
                        ${cliente.nome} ${cliente.cognome} </h3>
                        
                        <div>
                            <h4>Il tuo codice cliente</h4>
                            ${cliente.id_c}
                        </div>
            <div>
            <table>
                <tr> 
                    <th>ID oggetto</th>
                    <th>Nome</th>
                    <th>Foto</th>
                    <th>Descrizione</th>
                    <th>Quantità</th>
                    <th>Prezzo</th>
                </tr>
                            <c:forEach var="oggetto" items="${cliente.listaOggetti}">   
                <tr class="pari">
                    <td> ${oggetto.id_o}</td>
                    <td> ${oggetto.nome} </td>
                    <td> <img title="Foto" src="${oggetto.foto}" 
                              width="120" height="140" alt="Foto ${oggetto.nome}"/> </td>
                    <td> ${oggetto.descrizione} </td>
                    <td> ${oggetto.quantita} </td>
                    <td> ${oggetto.prezzo} € </td>
                </tr>
                           </c:forEach>
            </table>
            </div>            
                </div>                
                            
                            
                            
    
        <%@ include file="Blocchi/footer.jsp" %>
    </body>
</html>