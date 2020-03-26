<%-- 
    Document   : registroGuardado
    Created on : 25/02/2020, 12:40:27 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                background-color: activecaption;
            }

            h1 {
                color: maroon;
                margin-left: 40px;
            } 
            table, td, tr {  
                border: 1px solid #ddd;
                text-align: left;
            }

            table {
                border-collapse: collapse;
                width: 50%;
            }

            tr, td {
                padding: 15px;
            }
        </style>
    </head>
    <body>
        <%String registro = (String) request.getAttribute("Registro");%>
        <%String n = (String) request.getAttribute("n1");%>
        <%String n2 = (String) request.getAttribute("n2");%>
        <%String a = (String) request.getAttribute("a1");%>
        <%String a2 = (String) request.getAttribute("a2");%>
        <%String f = (String) request.getAttribute("fecha");%>
        <h1>Registro creado :<%=registro%></h1>
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td aling="right">Nombre:</td>
                <td><%=n + " " + n2%></td>
            </tr>
            <tr>
                <td aling="right">Apellido:</td>
                <td><%=a + " " + a2%></td>
            </tr>
            <tr>
                <td aling="right">Fecha nacimiento:</td>
                <td><%=f%></td>
            </tr>
        </table>
        <form action="index.html" method="post">
            <input type="submit" value="Regresar">
        </form>
    </body>
</html>
