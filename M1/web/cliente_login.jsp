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
        <!-- jQuery -->
        <script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
        <script type="text/javascript" src="js/javascript.js"></script>
    </head>
    <body>
    
    <%@ include file="Blocchi/Header.jsp" %> 
        <nav>
            <h3 id="nav_titolo">Navigazione</h3>
            <a href="descrizione.jsp">Home page</a><br>
            <a href="cliente.jsp">Pagina cliente</a><br>
            <a href="venditore.jsp">Pagina venditore</a>
            </nav>
        <div id="center">
                
                    <h3> Bentornato,
                        ${cliente.nome} ${cliente.cognome} </h3>
                        
                        <div>
                            <h4>Il tuo codice cliente</h4>
                            ${cliente.id_c}
                        </div>
                        
                       <div>
                    <!-- Tasto Ricerca -->
                    <label for="filtra">Barra di ricerca</label>
                    <input type="text" id="filtra" size="15"/>
                       </div>
                       
                <div>
                    <!-- Lista Oggetti -->
                    <table id="listaOggetti">
                        <tr> 
                <tr>
                    <th>Nome </th>
                    <th>Foto </th>
                    <th>Descrizione </th>
                    <th>Quantità </th>
                    <th>Prezzo </th>
                </tr>
                        <c:forEach var="table" items="${listaOggetti}">
                            <tr class="pari">
                                <td name="oggetto">${table.nome}</td>
                                <td name="oggetto"><img title="Foto" alt="Foto ${table.nome} 
                                src="${table.foto}" width="120" height="140"/></td>
                                <td name="oggetto">${table.descrizione}</td>
                                <td name="oggetto">${table.quantita}</td>
                                <td name="oggetto">${table.prezzo}</td>
                                <td name="oggetto"><a href="cliente.jsp?IdOggetto=${table.id_o}"> Link al prodotto </a></td>
                            </tr>
                        </c:forEach>
                    </table>
                <p id="paragrafo"></p>    
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