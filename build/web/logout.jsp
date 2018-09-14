<%-- 
    Document   : logout
    Created on : Jul 25, 2018, 4:21:50 PM
    Author     : Adedamola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IntliPMS | SignOut</title>
    </head>
    <body>
        <h1>Signing out of IntliPMS Hotel Management .........</h1>
        <%
        session.invalidate();
        response.sendRedirect("index.jsp"); 
        %>
    </body>
</html>
