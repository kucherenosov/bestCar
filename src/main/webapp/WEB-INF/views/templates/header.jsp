<!-- header.jsp -->
<%@ include file="../incl/t.jsp" %>

<div class="container">

    <div class="nav-items-bar">
        <div class="nav-items">
            <a href="${cpath}/welcome" id="welcome">Home</a>
            <a href="${cpath}/cars" id="cars">Cars</a>
            <a href="${cpath}/carCompany" id="car_company"><span>Car </span>Company</a>
            <a href="${cpath}/carModels" id="car_models"><span>Car </span>Models</a>
        </div>

        <div class="nav-items nav-items-right">
            <c:choose>
                <c:when test="${appPageContext.loggedIn}">
                    <a href="${cpath}/settings" id="account_link">MY ACCOUNT</a>
                    <c:url value="${appPageContext.logoutUrl}" var="logoutUrl"/>
                    <div id="menu">
                        <a href="${logoutUrl}">logout</a>
                    </div>
                </c:when>
                <c:otherwise>
                    <c:url value="${appPageContext.loginUrl}" var="loginUrl" scope="page"/>
                    <div id="menu">
                        <a href="${loginUrl}">SIGN IN</a>
                    </div>
                </c:otherwise>
            </c:choose>
        </div>
    </div>

    <h1>Best Car</h1>

</div>
<!-- /mainHeader.jsp -->
