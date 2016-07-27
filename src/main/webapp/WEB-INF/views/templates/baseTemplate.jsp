<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../incl/t.jsp" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <title>Euro CAR</title>

    <%-- css --%>
    <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/css/sticky-footer-navbar.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/css/test.css'/>" rel="stylesheet">

    <%--<link href='<c:url value="/css/normalize.css"/>' rel="stylesheet" type="text/css">--%>
    <%--<link href='<c:url value="/css/all.css"/>' rel="stylesheet" type="text/css">--%>

    <%-- js--%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>


    <%--<script data-main="scripts/main" src='<c:url value="/scripts/src/functions.js"/>'></script>--%>
    <%--<script data-main="scripts/main" src='<c:url value="/scripts/require.js"/>'></script>--%>


    <tiles:importAttribute name="bodyContentClass" ignore="true" />

</head>
<body>

    <%--<div id="site_container">--%>

        <header class="navbar">
            <tiles:insertAttribute name="header"/>
        </header>

        <div class="${bodyContentClass}">
            <tiles:insertAttribute name="body"/>
        </div>

    <%--</div>--%>

    <footer class="footer">
        <tiles:insertAttribute name="footer"/>
    </footer>


</body>
</html>
