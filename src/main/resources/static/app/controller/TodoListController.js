'use strict';

var app = angular.module('todoListApp.todoController', []);
app.controller('todoController'
    , function ($scope, todoListService) {
        $scope.rowSelected = -1;
        $scope.todos = [
        ];

        $scope.todoCount = 1;

        $scope.addTodo = function () {
            $scope.todos.push({noteId: $scope.todoCount, noteDetail: $scope.todoText, done: false});
            $scope.todoText = '';
            $scope.todoCount++;
        };

        $scope.delete = function (todo) {
            var index = $scope.todos.indexOf(todo);
            $scope.todos.splice(index, 1);
        }

        $scope.save = function () {

            if ($scope.todos.length > 0) {
                console.log(' Saved todo notes detatails successfully..... ');
                todoListService.createtoDoDetail($scope.todos);
            }
        }
    });

// Factory defined for the $http

app.factory('todoListService', ['$http', '$location', '$q', function ($http, $location, $q) {
    return {
        createtoDoDetail: function (todos) {

            // post URL
            var url = $location.absUrl() + "saveDetails";

            // prepare headers for posting
            var config = {
                headers: {
                    'Content-Type': 'application/json',
                    'Accept': 'application/json, */*'
                }
            }

            // prepare data for post messages
            var dataArr = todos;

            // do posting
            var deferred = $q.defer();
            $http.post(url, dataArr, config)
                .then(function (response) {
                    console.log('Saved successfully ');
                    deferred.resolve(response.data);

                }, function error(response) {
                    console.log('Erro while saving notes details');
                    deferred.reject(errResponse);
                });
            return deferred.promise;

        }
    }
}]);

