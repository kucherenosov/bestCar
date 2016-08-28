'use strict';

angular.module('myApp').controller('CarCompanyController', ['$scope', 'CarCompanyService', function($scope, CarCompanyService) {
    var self = this;
    self.carCompanies=[];

    fetchAllCarCompanies();

    function fetchAllCarCompanies(){
        CarCompanyService.fetchAllCarCompanies()
            .then(
                function(d) {
                    self.carCompanies = d;
                },
                function(errResponse){
                    console.error('Error while fetching Car companies');
                }
            );
    }
}]);
