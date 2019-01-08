<%-- 
    Document   : listaPalabras
    Created on : Jan 8, 2019, 8:56:45 AM
    Author     : danie
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Modismos</title>
    </head>
    <body>
        <h1>Modismos de cohort 12 xdxd</h1>
        <table>
            <thead>
                <tr>
                    <th>Palabra Id</th>
                    <th>Palabra</th>
                    <th>Definicion</th>
                    <th>Region</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${palabras}" var="palabra">
                    <tr>
                        <td><c:out value="${palabra.idPalabra}"/></td>
                        <td><c:out value="${palabra.palabra}"/></td>
                        <td><c:out value="${palabra.definicion}"/></td>
                        <td><c:out value="${palabra.region}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
