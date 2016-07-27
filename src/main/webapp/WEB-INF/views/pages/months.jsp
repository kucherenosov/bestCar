<%@ include file="../incl/t.jsp" %>

<c:if test="${fn:length(months) gt 0}">
    <table class="table table-hover">
        <tr>
            <th>EN Format</th>
            <th>French (fr-ca) format</th>
        </tr>
        <c:forEach items="${months}" var="month">
            <tr>
                <td>
                    <c:out value="${month.enDate}"/>
                </td>
                <td>
                    <c:out value="${month.frDate}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>