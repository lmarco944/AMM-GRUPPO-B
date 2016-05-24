<%-- 
    Document   : cliente
    Created on : 13-mag-2016, 22.56.09
    Author     : Marco
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

        <head>
        <title>ConvertiblePC e-commerce - Oggetti in vendita</title>
        <%@ include file="Blocchi/meta.jsp" %> 
    </head>
    <body>
        <%@ include file="Blocchi/Header.jsp" %>   
            <nav>
            <h3>Navigazione</h3>
            <a href="descrizione.jsp">Home page</a>
            <br><br>
            <a href="login.jsp">Pagina di login</a>
            <br>
            <br>
            </nav>
    <%@ include file="Blocchi/right.jsp" %>
    <div id="content">
        <h2>Oggetti attualmente in vendita nel sito:</h2>
        <br>
        <table>
            <tr>  
                <th>Nome dell'oggetto</th>
                <th>Foto</th>
                <th>Quantità disponibile</th>
                <th>Prezzo</th>
                <th>Carrello</th>
            </tr>
            <tr class="pari">
                <td>Hp Pavillion x2 10</td>
                <td><img title="Hp Pavillion x2 10" alt="Foto Hp Pavillion x2" src="foto/hp.jpg" width="150" height="150">
                <td>100 pezzi</td>
                <td>299 €</td>
                <td><a href="cliente.html">Aggiungi oggetto al carrello</a></td>
            </tr>
            <tr class="dispari">
                 <td>Asus T100 chi</td>
                <td><img title="Asus T100 chi" alt="Foto Asus T100" src="foto/Asus.jpg" width="150" height="150">
                <td>200 pezzi</td>
                <td>399 €</td>
                <td><a href="cliente.html">Aggiungi oggetto al carrello</a></td>
            </tr>
            <tr class="pari">
                 <td>Acer switch 10</td>
                <td><img title="Acer switch 10" alt="Foto Acer switch" src="foto/Acer.jpg" width="150" height="150">
                <td>300 pezzi</td>
                <td>279 €</td>
                <td><a href="cliente.html">Aggiungi oggetto al carrello</a></td>
            </tr>
            <tr class="dispari">
                 <td>Active pen Hp 230</td>
                <td><img title="Active pen Hp 230" alt="Foto Active pen Hp" src="foto/Pen_Hp.jpg" width="150" height="150">
                <td>20 pezzi</td>
                <td>49 €</td>
                <td><a href="cliente.html">Aggiungi oggetto al carrello</a></td>
            </tr>
            <tr class="pari">
                 <td>Active pen Lenovo 1000</td>
                <td><img title="Active pen Lenovo 1000" alt="Foto Active pen Lenovo" src="foto/Pen_Lenovo.jpg" width="150" height="150">
                <td>15 pezzi</td>
                <td>39 €</td>
                <td><a href="cliente.html">Aggiungi oggetto al carrello</a></td>
            </tr>
            <tr class="dispari">
                 <td>Active pen Microsoft Pro 3</td>
                <td><img title="Active pen Microsoft Pro 3" alt="Foto Active pen Microsoft" src="foto/Pen_Microsoft.jpg" width="150" height="150">
                <td>10 pezzi</td>
                <td>129 €</td>
                <td><a href="cliente.html">Aggiungi oggetto al carrello</a></td>
            </tr>
            <tr class="pari">
                 <td>Custodia Hp Pavillion x2 10</td>
                <td><img title="Custodia Hp Pavillion x2 10" alt="Foto Custodia Hp" src="foto/Custodia_Hp.JPG" width="150" height="150">
                <td>40 pezzi</td>
                <td>29 €</td>
                <td><a href="cliente.html">Aggiungi oggetto al carrello</a></td>
            </tr>
        </table>
        </div>
    <%@ include file="Blocchi/footer.jsp" %> 
    </body>
</html>
