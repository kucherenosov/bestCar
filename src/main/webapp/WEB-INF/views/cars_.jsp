<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>CARS</title>

    <link href="<c:url value='/resources/css/test.css'/>" rel="stylesheet">
    <script src="<c:url value="/resources/js/app.js" />"></script>

</head>
<body>

<div class="claendar-area">CARS PAGE</div>

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



<c:if test="${fn:length(cars) gt 0}">
    <table>
        <tr>
            <th>Car company</th>
            <th>Model</th>
            <th>Price </th>
        </tr>
        <c:forEach items="${cars}" var="car">
            <tr>
                <td>
                    <c:out value="${car.carCompany}"/>
                </td>
                <td>
                    <c:out value="${car.carModel}"/>
                </td>
                <td>
                    <c:out value="${car.price}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>


</body>
</html>