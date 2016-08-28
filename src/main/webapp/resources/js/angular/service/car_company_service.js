'use strict';

angular.module('myApp').factory('CarCompanyService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/bestcar/rest/carCompany/';

    var factory = {
        fetchAllCarCompanies: fetchAllCarCompanies
    };

    return factory;

    function fetchAllCarCompanies() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Error while fetching Car companies');
                    deferred.reject(errResponse);
                }
            );
        return deferred.promise;
    }
}]);
