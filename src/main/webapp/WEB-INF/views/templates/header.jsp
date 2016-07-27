<!-- header.jsp -->
<%@ include file="../incl/t.jsp" %>

<div class="container">


    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">

                <a class="navbar-brand" href="#">Best Car</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <%--<li class="active"><a href="#">Home</a></li>--%>
                    <li><a href="${cpath}/welcome" id="welcome">Home</a></li>
                    <li><a href="${cpath}/cars" id="cars">Cars</a></li>
                    <li><a href="${cpath}/admin/carCompany" id="car_company"><span>Car </span>Company</a></li>
                    <li><a href="${cpath}/carModels" id="car_models"><span>Car </span>Models</a></li>
                    <c:choose>
                        <c:when test="${appPageContext.loggedIn}">
                            <li><a href="${cpath}/settings" id="account_link">My Account</a></li>
                            <c:url value="${appPageContext.logoutUrl}" var="logoutUrl"/>
                            <li><a href="${logoutUrl}">Logout</a></li>
                        </c:when>
                        <c:otherwise>
                            <c:url value="${appPageContext.loginUrl}" var="loginUrl" scope="page"/>
                            <li><a href="${loginUrl}">Sign In</a></li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </nav>
</div>
<!-- /mainHeader.jsp -->
