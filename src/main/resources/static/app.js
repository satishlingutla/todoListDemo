'use strict';

var app = angular.module('todoListApp', [
    'todoListApp.todoController'
]);

app.constant('urls', {
    BASE: 'http://localhost:9080/',
    USER_SERVICE_API : 'http://localhost:9080/saveDetails'
});
