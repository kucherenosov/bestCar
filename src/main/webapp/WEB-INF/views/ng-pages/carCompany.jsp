<%@ include file="../incl/t.jsp" %>


<div class="container" ng-app="myApp" class="ng-cloak">
    <table class="table table-hover" ng-controller="CarCompanyController as ctrl">
        <tr>
            <th>ID</th>
            <th>Car company</th>
            <th>Decription</th>
            <th>logo</th>
            <th></th>
        </tr>

        <tr ng-repeat="carCompany in ctrl.carCompanies" ng-if="ctrl.carCompanies != null">
            <td>
                {{carCompany.carCompanyId}}
            </td>
            <td>
                {{carCompany.name}}
            </td>
            <td>
                {{carCompany.description}}
            </td>
            <td>
                <img src="${cpath}/image/company/car/{{carCompany.osr}}/{{carCompany.fileName}}" width="122px">
            </td>
            <td>
                <a class="btn btn-success" href="${cpath}/admin/carCompany/edit/${carCompany.carCompanyId}" role="button">
                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> edit
                </a>
            </td>
        </tr>


        <td colspan="4"></td>
        <td>
            <a class="btn btn-success" href="${cpath}/admin/carCompany/add/" role="button">
                <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> add new
            </a>
        </td>

    </table>




</div>


<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="<c:url value='/resources/js/angular/app.js' />"></script>
<script src="<c:url value='/resources/js/angular/service/car_company_service.js' />"></script>
<script src="<c:url value='/resources/js/angular/controller/car_company_controller.js' />"></script>

