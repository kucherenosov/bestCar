<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <script type="text/javascript">
        <c:set var="context" value="${pageContext.request.contextPath}"/>
        console.info("${context}/welcome");
        window.location.href = "${context}/welcome";
    </script>
    <title>Page Redirection</title>
</head>
<body>
If you are not redirected automatically, follow the <a href='{context}/welcome'>link to welcome</a>
</body>
</html>
<%--<html>--%>
<%--<body>--%>
<%--<h2>Hello World!</h2>--%>
<%--</body>--%>
<%--</html>--%>
