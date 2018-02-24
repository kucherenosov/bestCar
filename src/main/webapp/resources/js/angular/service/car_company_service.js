'use strict';

angular.module('myApp').factory('CarCompanyService', ['$http', '$q', function($http, $q){

    //var REST_SERVICE_URI = 'http://localhost:8080/bestcar/rest/carCompany/';
    var CONTEXT = '/bestcar';
    var REST_SERVICE_URI = CONTEXT + '/rest/carCompany/';
    var REST_SERVICE_ADD_CART_URI = CONTEXT + '/rest/car/add';

    var factory = {
        fetchAllCarCompanies: fetchAllCarCompanies,
        addTestCart: addTestCart,
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
    };

    function addTestCart() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_ADD_CART_URI)
            .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Error while calling ' + REST_SERVICE_ADD_CART_URI);
                    deferred.reject(errResponse);
                }
            );
        return deferred.promise;
    }

}]);
