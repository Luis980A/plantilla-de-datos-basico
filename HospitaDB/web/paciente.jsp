<%-- 
    Document   : paciente
    Created on : 27/02/2020, 02:36:02 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1">
        <title>JSP Page</title>
        <style>
            table, tr, td{
                color: teal;
                border: 2px solid violet;
                padding: 1px;
                width: 28%;
                box-sizing: border-box;
            }
            border{
                color: blue;
            }
            h1{
                color:blue;
                font-family: "Times New Roman", Times, serif;
            }
            body{
                background-color:black;
            }
        </style>
    </head>
    <body>
        <h1 align="center">
            Formulario ingreso de pacientes
        </h1>
        <form action="Registro_Paciente">
            <table align="left">
                <tr>
                    <td>
                        Codigo paciente:
                    </td>
                    <td><input type="text" name="cod"></td>
                </tr>
                <tr>
                    <td>
                        Primer nombre:
                    </td>
                    <td><input type="text" name="nombre1"></td>
                </tr>
                <tr>
                    <td>
                        Segundo nombre:
                    </td>
                    <td><input type="text" name="nombre2"></td>
                </tr>
                <tr>
                    <td>
                        Primer apellido:
                    </td>
                    <td><input type="text" name="apell1"></td>
                </tr>
                <tr>
                    <td>
                        Segundo apellido:
                    </td>
                    <td><input type="text" name="apell2"></td>
                </tr>
                <tr>
                    <td>
                        Fecha nacimiento:
                    </td>
                    <td><input type="text" name="fecha"></td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Guardar registro">
            <br>
            <br>
            <input type="reset" value="Borrar casillas">
        </form>
        <br>
         <form action="index.html" method="post">
            <input type="submit" value="Menu principal">
        </form>
    </body>
</html>
