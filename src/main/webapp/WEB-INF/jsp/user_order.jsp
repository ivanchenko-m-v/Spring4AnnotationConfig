<%-- 
    Document   : user_order
    Created on : 21.04.2017, 10:59:41
    Author     : mivanchenko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${cp}/resources/css/user_order.css" />
        <title>Quotas-2018 user order</title>
    </head>
    <body>
        <div class="centralwidget">
            <div id="pn_header">
                header
            </div>
            <div id="pn_order">
               <jsp:directive.include file="/WEB-INF/jspf/user_order_data.jspf" /> 
            </div>
            <div id="pn_order_list">
               <jsp:directive.include file="/WEB-INF/jspf/user_order_list.jspf" /> 
            </div>
            <div id="pn_user_ar">
               <jsp:directive.include file="/WEB-INF/jspf/user_data.jspf" /> 
            </div>
            <div id="pn_footer">
                footer
            </div>
        </div>
    </body>
</html>
