angular.module('VehicleDemo', [])
.controller('VehicleController', function($scope, $http) {
    $http.get('http://localhost:8080/vehicleInfo').
        then(function(response) {
            $scope.vehicleDetails = response.data;
        });
});