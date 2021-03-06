<%@ include file="../incl/t.jsp" %>

<c:if test="${fn:length(cars) gt 0}">
    <table class="table table-hover">
        <tr>
            <th>Car company</th>
            <th>Model</th>
            <th>Price </th>
        </tr>
        <c:forEach items="${cars}" var="car">
            <tr>
                <td>
                    <c:out value="${car.carCompany.name}"/>
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