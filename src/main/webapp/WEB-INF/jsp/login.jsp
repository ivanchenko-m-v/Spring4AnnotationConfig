<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
 
<%-- 
    Document   : login
    Created on : 19.04.2017, 17:27:00
    Author     : mivanchenko
--%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${cp}/resources/css/login.css" />
        <title>Quotas-2018 login</title>
    </head>
    <body>
        
    <form id="loginForm" action="" method="post">

            <div class="field">
                    <label>Имя пользователя:</label>
                    <div class="input"><input type="text" name="" value="" id="login" /></div>
            </div>

            <div class="field">
                    <!-- <a href="#" id="forgot">Забыли пароль?</a> -->
                    <label>Пароль:</label>
                    <div class="input"><input type="password" name="" value="" id="pass" /></div>
            </div>

            <div class="submit">
                    <button type="submit">Войти</button>
                    <label id="remember"><input name="" type="checkbox" value="" /> Запомнить меня</label>
            </div>

    </form>

    </body>
</html>
