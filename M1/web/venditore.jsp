<%-- 
    Document   : venditore
    Created on : 13-mag-2016, 22.44.12
    Author     : Marco
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ConvertiblePC e-commerce - Venditore</title>
        <%@ include file="Blocchi/meta.jsp" %> 
    </head>
    <body>
    <%@ include file="Blocchi/Header.jsp" %> 
            <nav><h3>Navigazione</h3>
        <a href="descrizione.jsp">Home page</a>
        <br><br>
        <a href="login.jsp">Pagina di login</a>
            </nav><br>
    <%@ include file="Blocchi/right.jsp" %> 
                <div id="center">
          <h2> Inserisci un nuovo oggetto in vendita nel sito: </h2>
              <form action="login.asp" method="get">
      
                <label for="nome">Nome dell'oggetto</label>
                <input class="input" name="nome" id="nome" type="text" maxlength="50"/>

                <label for="immagine">Url di un immagine</label>
                <input type="file" name="immagine">

                <label>Descrizione</label>
                <textarea class="input" name="descrizione" rows="4" cols="19" maxlength="200"></textarea>

                <label for="prezzo">Prezzo dell'oggetto</label>
                <input class="input" name="prezzo" id="prezzo" type="text" maxlength="20"/>

                <label for="quant">Quantita disponibile</label>
                <input class="input" name="quant" id="quant" type="text" maxlength="40"/>

                <input type="submit" value="Inserisci un nuovo oggetto"/>
              </form>
        </div>
            
        
    <%@ include file="Blocchi/footer.jsp" %> 
    </body>
    
</html>
