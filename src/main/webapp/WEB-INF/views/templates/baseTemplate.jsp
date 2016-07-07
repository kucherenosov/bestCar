<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../incl/t.jsp" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <title>Euro CAR</title>

    <%-- css --%>
    <link href="<c:url value='/resources/css/bootstrap.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/css/test.css'/>" rel="stylesheet">
    <%--<link href='<c:url value="/css/normalize.css"/>' rel="stylesheet" type="text/css">--%>
    <%--<link href='<c:url value="/css/all.css"/>' rel="stylesheet" type="text/css">--%>

    <%-- js--%>
    <%--<script data-main="scripts/main" src='<c:url value="/scripts/src/functions.js"/>'></script>--%>
    <%--<script data-main="scripts/main" src='<c:url value="/scripts/require.js"/>'></script>--%>


    <tiles:importAttribute name="bodyContentClass" ignore="true" />

</head>
<body>

    <div id="site_container">

        <header class="navbar">
            <tiles:insertAttribute name="header"/>
        </header>

        <div class="${bodyContentClass}">
            <tiles:insertAttribute name="body"/>
        </div>

    </div>

    <footer id="footer">
        <tiles:insertAttribute name="footer"/>
    </footer>

    <div id="back_to_top" class="visible"></div>
</body>
</html>
