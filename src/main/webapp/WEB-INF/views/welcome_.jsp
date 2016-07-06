<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>HelloWorld page</title>

    <link href="<c:url value='/resources/css/test.css'/>" rel="stylesheet">
    <script src="<c:url value="/resources/js/app.js" />"></script>


    <script>
        test();
    </script>

</head>
<body>


    Greeting : ${greeting} lalala
    <div class="claendar-area">CSS DIV</div>
    <div class="claendar-area">check hot deploy1</div>


    <c:choose>
        <c:when test="${appPageContext.loggedIn}">
            <div>Status:loggedIn</div>
            <c:url value="${appPageContext.logoutUrl}" var="logoutUrl"/>
            <div id="menu">
                <a href="${logoutUrl}">logout</a>
            </div>
        </c:when>
        <c:otherwise>
            <div>Status:anonymous</div>
            <c:url value="${appPageContext.loginUrl}" var="loginUrl" scope="page"/>
            <div id="menu">
                <a href="${loginUrl}">logIn</a>
            </div>
        </c:otherwise>
    </c:choose>

</body>
</html>