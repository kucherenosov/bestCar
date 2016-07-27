<%@ include file="../incl/t.jsp" %>

<c:if test="${fn:length(carCompanies) gt 0}">

    <table class="table table-hover">
        <tr>
            <th>ID</th>
            <th>Car company</th>
            <th>Decription</th>
            <th>logo</th>
            <th></th>
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
                <td>
                    <img src="${cpath}/image/company/car/${carCompany.osr}/${carCompany.fileName}" width="122px">
                </td>
                <td>
                    <a class="btn btn-success" href="${cpath}/admin/carCompany/edit/${carCompany.carCompanyId}" role="button">
                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> edit
                    </a>
                </td>
            </tr>
        </c:forEach>

        <td colspan="4"></td>
        <td>
            <a class="btn btn-success" href="${cpath}/admin/carCompany/add/" role="button">
                <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> add new
            </a>
        </td>

    </table>

</c:if>