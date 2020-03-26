<%-- 
    Document   : Actualizar
    Created on : 26/02/2020, 07:34:54 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%String n = request.getParameter("nombre");%>
        <%=n%>
    </body>
</html>
