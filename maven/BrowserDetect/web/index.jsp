<%-- 
    Document   : index
    Created on : Aug 30, 2012, 12:04:15 PM
    Author     : Masudul Haque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
           String res= request.getHeader("User-Agent");
           out.println(res);           
           %>
            
        </h1>
    </body>
</html>
