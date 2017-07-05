<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="appBase" value="${pageContext.request.contextPath}" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Promedios</title>
        <link href="${appBase}/css/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <p id="titleNotas">PROMEDIO DE NOTAS</p>
        <div class="content">
        <form action="procesar.htm" method="post">
            <ul>
                <li class="input">Práctica 1:</li>
                <li class="input"><input type="tex" name="pract1"></li>
            </ul>
            <ul>
                <li class="input">Práctica 1:</li>
                <li class="input"><input type="tex" name="exParcial"></li>
            </ul>
            <ul>
                <li class="input">Ex. Parcial:</li>
                <li class="input"><input type="tex" name="pract2"></li>
            </ul>
            <ul>
                <li class="input">Práctica 2:</li>
                <li class="input"><input type="tex" name="trabPract"></li>
            </ul>
            <ul>
                <li class="input">Prom. Prac:</li>
                <li class="input"><input type="tex" name="exFinal"></li>
            </ul>
            <ul>
                <li><input type="submit" value="Procesar"/></li>
            </ul>
        </form>

        </div>
        <c:if test="${repo !=null}">
        <div class="content">
            <p id="titleNotas">REPORTE DE NOTAS</p>
            <ul>
                <li class="input">Práctica 1:</li>
                <li class="input">${repo.pract1}</li>
            </ul>
            <ul>
                <li class="input">Ex. Parcial:</li>
                <li class="input">${repo.exParcial}</li>
            </ul>
            <ul>
                <li class="input">Práctica 2:</li>
                <li class="input">${repo.pract2}</li>
            </ul>
            <ul>
                <li class="input">Trab. Práctico:</li>
                <li class="input">${repo.trabPract}</li>
            </ul>
            <ul>
                <li class="input">Examen Final:</li>
                <li class="input">${repo.exFinal}</li>
            </ul>
        </div>
        <div class="content">
            <p id="titleNotas">SITUACION FINAL</p>
            <ul>
                <li class="input">Prom. Final:</li>
                <li class="input">${repo.promFinal}</li>
            </ul>
            <ul>
                <li class="input">Estado</li>
                <li class="input">${repo.estado}</li>
            </ul>
         </div>
        </c:if>
    </body>
</html>
