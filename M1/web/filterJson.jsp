<%-- 
    Document   : filterJson
    Created on : 2-giu-2016, 18.45.57
    Author     : Marco
--%>

<%@page contentType="application/json" pageEncoding="UTF-8"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<json:array>
    <c:forEach var="oggetto" items="${listaOgg}">
        <json:object>
            <json:property name="nome" value="${oggetto.nome}"/>
            <json:property name="foto" value="${oggetto.foto}"/>
            <json:property name="descrizione" value="${oggetto.descrizione}"/>
            <json:property name="quantita" value="${oggetto.quantita}"/>
            <json:property name="prezzo" value="${oggetto.prezzo}"/>
            <json:property name="id_o" value="${oggetto.id_o}"/>
        </json:object>
    </c:forEach>
</json:array>