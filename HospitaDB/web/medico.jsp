<%-- 
    Document   : medico
    Created on : 21/02/2020, 12:36:02 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Model.GestorBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1">
        <link rel="stylesheet" href="./style.css">
        <style>
            body {
                background-color: #29363B;
            }

            h1 {
                color: #EA495F;
                margin-left: 40px;
            }
            table, td {
                border: 1px solid black;
            }
            td{
                color:olivedrab;
            }
            table {
                border-collapse: collapse;
                width: 45%;
                justify-content: center;
            }
            p{
                color:tomato
            }
            #medico {
                font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                border: 1px solid black;
                width: 100%;
            }

            #medico td, #medico th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            #medico tr:nth-child(even){background-color: #f2f2f2;}

            #medico tr:hover {background-color: #ddd;}

            #medico th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #4CAF50;
                color: white;
            }
        </style>
        <title>Medicos</title>
    </head>
    <body>
        <h1>Formulario de datos de un medico</h1>
        <p> Despues de introducir sus datos oprima el boton "ok"</p>
        <form align="center" action="Registro" >
            <table align="center" >
                <tr>
                    <td>
                        Codigo Medico:
                    </td>
                    <td><input type="text" name="cod"></td>
                </tr>
                <tr>
                    <td>
                        Primer Nombre:
                    </td>
                    <td> <input type="text" name="nombre1"></td>
                </tr>
                <tr>
                    <td>
                        Segundo Nombre: 
                    </td>
                    <td><input type="text" name="nombre2"></td>
                </tr>
                <tr>
                    <td>
                        Primer Apellido: 
                    </td>
                    <td><input type="text" name="apell1"></td>
                </tr>
                <tr>
                    <td>
                        Sengudo Apellido: 
                    </td>
                    <td><input type="text" name="apell2"></td>
                </tr>
                <tr>
                    <td>
                        Fecha Nacimiento: 
                    </td>
                    <td><input type="text" name="fecha"></td>
                </tr>
            </table>
            <input type="submit" value="Ok">
            <input type="reset" value="Borrar">
        </form>
        <form align="center" action="index.html" method="post">
            <input type="submit" value="Menu principal">
        </form>
        <% GestorBD gestor = new GestorBD();
          ResultSet rs = gestor.consultaGlobal("select*from medico ORDER BY cod_medico ASC"); %>
        <h1>REGISTROS DE MEDICOS:</h1>
        <table id="medico">
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Fecha nacimiento</th>
            </tr>
            <%while (rs.next()) {%>
            <tr>
                <td name="codigo"><%=rs.getInt("cod_medico")%></td>
                <td name="nombre"><%=rs.getString("nombre_uno") + " " + rs.getString("nombre_dos")%></td>
                <td><%=rs.getString("apellido_uno") + " " + rs.getString("apellido_dos")%></td>
                <%
                  String cadena = rs.getString("fecha_nac");
                  String array[] = cadena.split(" ");
                %>
                <td><%=array[0]%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
