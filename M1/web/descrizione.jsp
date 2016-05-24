<%-- 
    Document   : descrizione
    Created on : 13-mag-2016, 22.00.30
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
            <h3>Navigazione</h3>
            <a href="login.jsp">Pagina di login</a>
        </nav>        
    <div id="content">
        <%@ include file="Blocchi/right.jsp" %> 
             <p> Benvenuti nel sito di e-commerce della società SolePC.
                 Questo sito vi propone i computer convertibili ai prezzi migliori (siamo gli unici al mondo
                 ad essere specializzati solo ed esclusivamente nella vendita di computer convertibili). 
                 Vendiamo computer convertibili che provengono da ogni parte del mondo (Stati Uniti, Francia, Italia, Cina ecc)
            </p>
               <strong>Sezioni presenti all'interno della pagina</strong>
            <!-- 
            le sezioni sono organizzate in questo modo:
                 - oggetti in vendita nel sito (Sezione 1)
                    - Principali convertibili in vendita nel sito (Sottosezione 1)
                        - caratteristiche di tutti i computer in vendita (Sotto-sottosezione 1)
                    - Principali penne in vendita nel sito (Sottosezione 2)
                        - caratteristiche di tutte le active pen in vendita (Sotto-sottosezione 2)
                 - Funzionalità del nostro sito a disposizione dei venditori (Sezione 2)
                 - Funzionalità del nostro sito a disposizione dei clienti (Sezione 3)
            !-->
         <ul>
            <li><a href="#oggetti_vendita">Oggetti in vendita nel sito</a></li>             
            <li><a href="#funz_venditori">Funzionalità del nostro sito a disposizione dei venditori</a></li>
            <li><a href="#funz_clienti">Funzionalità del nostro sito a disposizione dei clienti</a></li>
        </ul>
        <br>
            <h2><a id="oggetti_vendita">Oggetti in vendita nel sito:</a></h2>
            <p>
                Ci siamo specializzati nella vendita dei migliori computer 2 in 1 di ultima generazione, nelle migliori penne attive
                (anche dette active pen, per riconoscere la pressione del tocco nello schermo dei computer) e delle migliori custodie
                per questi computer.
                In questo sito troverete in vendita <em>solo ed esclusivamente</em> i seguenti oggetti:
            </p>
            <ol>
                <li>Computer convertibili 2 in 1</li>
                <li>Penne attive</li>
                <li>Custodie per i convertibili</li>
            </ol>
            <br>
            <h3>Principali convertibili in vendita nel sito:</h3>
           
            <ul>
                <li>Convertibili Hp</li>
                <li>Convertibili Asus</li>
                <li>Convertibili Lenovo</li>
                <li>Convertibili Chuwi</li>
                <li>Convertibili Acer</li>
                <li>Convertibili Microsoft</li>
            </ul>
            
            <h4>Caratteristiche di tutti i computer in vendita:</h4>
            
            <p> 
                Tutti i computer in questo sito possono essere usati per la scrittura
                su schermo, quindi tutti sono dotati di schermo touch e di un digitalizzatore
                che rileva il puntatore (la penna attiva). Questi convertibili inoltre
                sono progettati per essere "staccati" dalla tastiera (con inserto magnetico)
                ed essere usati come tablet (tutti i componenti elettronici del computer si
                trovano dietro lo schermo e non nella tastiera come con i normali notebook.
            </p>
            
            <br>
            <h3>Principali penne in vendita nel sito:</h3> 
            <ul>
                <li>Active pen Asus</li>
                <li>Active pen Hp</li>
                <li>Active pen Acer</li>
                <li>Active pen Chuwi</li>
                <li>Active pen Lenovo</li>
                <li>Active pen Microsoft</li>
            </ul>

              <h4>Caratteristiche di tutte le active pen in vendita:</h4>
            
            <p> 
                Tutte le active pen sono progettate per essere riconosciute da un digitalizzatore.
                Il digitalizzatore rileva i livelli di pressione e riconosce solo la penna
                (eliminando il tocco rilevato dal palmo).   
            </p>
            
            <br>
            <h2> <a id="funz_venditori">Funzionalità del nostro sito a disposizione dei venditori</a></h2>
            <p> 
                Il nostro sito mette a disposizione dei venditori una piattaforma già pronta
                con cui interfacciarsi per vendere i propri oggetti (purchè facciano parte
                della categoria di oggetti elencata a inizio pagina). Il nostro sito inoltre
                permette ai venditori dei pagamenti sicuri. Nella pagina di login sia i venditori che i clienti
                potranno loggarsi all'interno del sito per condividere le loro esperienze di vendita e di acquisto,
                il tutto nel massimo rispetto della privacy di ogni individuo.
            </p>
            <br>
            <h2> <a id="funz_clienti">Funzionalità del nostro sito a disposizione dei clienti</a></h2>
            <p> 
                Il nostro sito mette a disposizione dei clienti una piattaforma già pronta
                con cui interfacciarsi per l'acquisto dei migliori computer convertibili, penne attive
                e relative custodie. è possibile verificare gli oggetti presenti nel sito, le loro relative
                foto e i prezzi offerti dai diversi venditori. Nella pagina di login sia i venditori che i clienti
                potranno loggarsi all'interno del sito per condividere le loro esperienze di vendita e di acquisto,
                il tutto nel massimo rispetto della privacy di ogni individuo.</p>
            </div>
            <%@ include file="Blocchi/footer.jsp" %>
    </body>
</html>