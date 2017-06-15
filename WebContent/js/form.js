var app = angular.module('myApp', []);
    
app.controller('siteCtrl', function($scope, $http) {
    $http({
        method: 'GET',
        url: 'json/form.json'
    }).then(function successCallback(response) {
            $scope.names = response.data.sites;
        }, function errorCallback(response) {
            alert("提取信息失败");
    });
  
});