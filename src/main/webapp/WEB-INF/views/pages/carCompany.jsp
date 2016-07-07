<%@ include file="../incl/t.jsp" %>

<c:if test="${fn:length(carCompanies) gt 0}">
    <table class="table table-hover">
        <tr>
            <th>ID</th>
            <th>Car company</th>
            <th>Decription</th>
        </tr>
        <c:forEach items="${carCompanies}" var="carCompany">
            <tr>
                <td>
                    <c:out value="${carCompany.carCompanyId}"/>
                </td>
                <td>
                    <c:out value="${carCompany.name}"/>
                </td>
                <td>
                    <c:out value="${carCompany.description}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>