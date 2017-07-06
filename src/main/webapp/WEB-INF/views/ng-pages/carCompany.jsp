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
                {{carCompany.data.carCompanyId}}
            </td>

            <td ng-if="carCompany.mode == ctrl.ROW_MODE.FIXED_MODE">
                {{carCompany.data.name}}
            </td>

            <td ng-if="carCompany.mode == ctrl.ROW_MODE.EDITED_MODE">
                <input type="text" size="15" ng-model="carCompany.data.name"/>
            </td>


            <td>
                {{carCompany.data.description}}
            </td>
            <td>
                <img src="${cpath}/image/company/car/{{carCompany.data.osr}}/{{carCompany.data.fileName}}" width="122px">
            </td>
            <td ng-if="ctrl.user.admin == 'true'">
                <%--<a class="btn btn-success" href="${cpath}/admin/carCompany/edit/${carCompany.data.carCompanyId}" role="button">--%>
                    <%--<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> edit--%>
                <%--</a>--%>
                    <a class="btn btn-success part-edit" ng-href="" ng-click="ctrl.editCompany(carCompany)" ng-if="carCompany.mode == ctrl.ROW_MODE.FIXED_MODE">
                        <span class="glyphicon glyphicon-pencil"/>
                    </a>

                    <a class="btn btn-success part-save" ng-href="" ng-click="ctrl.saveCompany(carCompany)" ng-if="carCompany.mode == ctrl.ROW_MODE.EDITED_MODE">
                        <span title="Save Changes">Save</span>
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

