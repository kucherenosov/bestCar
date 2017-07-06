'use strict';

angular.module('myApp').controller('CarCompanyController', ['$scope', 'CarCompanyService', function($scope, CarCompanyService) {
    var self = this;
    self.carCompanies=[];
    self.user = {admin: "true"};

    var ROW_MODE_ENUM = {
        FIXED_MODE: 1,
        EDITED_MODE: 2,
        NEW_MODE: 3
    };

    self.ROW_MODE = ROW_MODE_ENUM;

    fetchAllCarCompanies();

    function fetchAllCarCompanies(){
        CarCompanyService.fetchAllCarCompanies()
            .then(
                function(d) {
                    self.carCompanies = d.map(function(company) {
                        var transformedCompany = {
                            data: company,
                            mode: ROW_MODE_ENUM.FIXED_MODE
                        }
                        return transformedCompany;
                    });
                },
                function(errResponse){
                    console.error('Error while fetching Car companies');
                }
            );
    }


    self.editCompany = function (editedPart) {
        editedPart.mode = ROW_MODE_ENUM.EDITED_MODE;
    }


    self.saveCompany = function (editedPart) {
        editedPart.mode = ROW_MODE_ENUM.FIXED_MODE;
    }


}]);
