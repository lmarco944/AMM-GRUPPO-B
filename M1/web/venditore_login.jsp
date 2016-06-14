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
        <title>ConvertiblePC e-commerce - Descrizione</title>
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
                <h3> Bentornato,<br>
                        ${venditore.nome} ${venditore.cognome} </h3>
                        
                        <div>
                            <h4>Il tuo codice venditore</h4>
                            ${venditore.id_v}
                        </div>    
                        <div>
                            <h4>Oggetti messi in vendita nel sito da te:</h4>
                            <ul>
                                <c:forEach var="oggetto" items="${venditore.listaOggetti}">
                                    <li>${oggetto.nome}</li> 
                                </c:forEach>
                            </ul>
                        </div>
            <div>
            <table>
                <tr> 
                    <th> Nome </th>
                    <th> Foto </th>
                    <th> Pezzi disponibili </th>
                    <th> Prezzo </th>
                </tr>
               <c:forEach var="oggetto" items="${venditore.listaOggetti}">   
                <tr class="pari">
                    <td> ${oggetto.nome} </td>
                    <td> <img title="Foto" src="${oggetto.foto}" 
                              width="120" height="140" alt="Foto ${oggetto.nome}"/> </td>

                    <td> ${oggetto.quantita} </td>
                    <td> ${oggetto.prezzo} € </td>
                </tr>
                </c:forEach>
            </table>
            </div>        
                <div>
                    <h3>Vuoi inserire un nuovo oggetto?</h3>
                    <h4>Compila il form sottostante</h4>
                   
                    
        <form action="Vendita" method="get">

                <label for="venditoreId">Stai inserendo l'oggetto con il codice venditore: ${venditore.id_v}</label>
                <input class="input" name="venditoreId" id="venditoreId" type="hidden" value="${venditore.id_v}"/>
                
                <label for="id_o">Id oggetto</label>
                <input class="input" name="id_o" id="id_o" type="text" maxlength="50"/>  
            
                <label for="nome">Nome dell'oggetto</label>
                <input class="input" name="nome" id="nome" type="text" maxlength="50"/>

                <label for="Descrizione">Descrizione</label>
                <textarea class="input" name="descrizione" id="Descrizione" rows="4" cols="19" maxlength="128"></textarea>

                <label for="prezzo">Prezzo dell'oggetto</label>
                <input class="input" name="prezzo" id="prezzo" type="text" maxlength="20"/>
               

                <label for="quantita">Pezzi da mettere in vendita</label>
                <input class="input" name="quantita" id="quantita" type="text" maxlength="40"/>

                <div>
                <input type="submit" name="submit" value="Inserisci un nuovo oggetto"/>
                <input type="reset" name="reset" value="Cancella">
                </div>
        </form>
                <c:if test="${avviso != null}">
                <p>${avviso}</p>
                </c:if>    
                        
                </div>
                </div>
        <%@ include file="Blocchi/footer.jsp" %>
    </body>
</html>
