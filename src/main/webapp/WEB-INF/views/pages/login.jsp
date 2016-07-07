<%@ include file="../incl/t.jsp" %>

<c:url var="loginUrl" value="/login"/>

<div class="login-container">
    <div class="login-card">

<form action="${loginUrl}" method="post" class="form-horizontal">
    <c:if test="${param.error != null}">
        <div class="alert alert-danger">
            <p>Invalid username and password.</p>
        </div>
    </c:if>
    <c:if test="${param.logout != null}">
        <div class="alert alert-success">
            <p>You have been logged out successfully.</p>
        </div>
    </c:if>
    <div class="input-group input-sm">
        <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
        <input type="text" class="form-control" id="username" name="userName" placeholder="Enter Username" required>
    </div>
    <div class="input-group input-sm">
        <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
        <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
    </div>
    <input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />

    <div class="form-actions">
        <input type="submit"
               class="btn btn-block btn-primary btn-default" value="Log in">
    </div>
</form>

    </div>
</div>