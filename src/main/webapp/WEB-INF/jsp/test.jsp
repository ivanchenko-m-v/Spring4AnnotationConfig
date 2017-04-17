<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
 
<%-- 
    Document   : test
    Created on : 17.04.2017, 13:09:55
    Author     : mivanchenko
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>test JSP Page</title>
    </head>
    <body>
        <h1>test</h1>
        Spring says: <span class="blue">${msg}</span>
        <span><a href="./">home</a></span>
    </body>
    
</html>
