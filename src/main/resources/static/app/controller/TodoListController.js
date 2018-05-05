'use strict';

var app = angular.module('todoListApp.todoController', []);
app.controller('todoController'
    , function ($scope, todoListService, $q, $timeout) {
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

        $scope.isSaved = true;
        $scope.messageTxt = '';

        $scope.alertMsg = function (message) {
            $scope.isSaved = false;
            $scope.messageTxt = message;
            $timeout(function () {
                $scope.isSaved = true;
            }, 2000);
        }

        $scope.save = function () {

            var MSG_SAVED = 'Your details are saved successfully. Please verify in database...';
            var MSG_ERROR = 'Error occured while saving....';
            var MSG_NO_DETAIL_TO_SAVE = 'There is nothing to update...';

            if ($scope.todos.length > 0) {

                console.log(' Saved todo notes detatails successfully..... ');


                var deferred = $q.defer();

                todoListService.createtoDoDetail($scope.todos)
                    .then(function (response) {

                        console.log('Saved successfully ');
                        $scope.todos = [];
                        $scope.todoCount = 1;
                        $scope.alertMsg(MSG_SAVED);
                        deferred.resolve(response.data);
                    }, function error(response) {
                        console.log('Error while saving notes details');
                        $scope.alertMsg(MSG_ERROR);
                        deferred.reject(errResponse);
                    });
                return deferred.promise;
            } else {
                $scope.alertMsg(MSG_NO_DETAIL_TO_SAVE);
            }

        }
    });

// Factory defined for the $http

app.factory('todoListService', ['$http', '$location', 'urls', function ($http, $location, urls) {
    return {
        createtoDoDetail: function (todos) {

            // post URL
            var url = $location.absUrl() + "saveDetails";
//            var url = urls.BASE_URL + "saveDetails";

            // prepare headers for posting
            var config = {
                headers: {
                    'Content-Type': 'application/json',
                    'Accept': 'application/json, */*'
                }
            }

            // prepare data for post messages
            var dataArr = todos;

            return $http.post(url, dataArr, config);


        }
    }
}]);

