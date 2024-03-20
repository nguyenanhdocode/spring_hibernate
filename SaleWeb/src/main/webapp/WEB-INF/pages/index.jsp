<%-- 
    Document   : index
    Created on : Mar 20, 2024, 1:39:48 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <c:forEach items="categories" var="c">
                <li>${c.name}</li>
            </c:forEach>
        </ul>
    </body>
</html>
