'use strict';
// This is redendent I moved the factory instead of thie service.
angular.module('todoListApp.todoservices', []).factory("todoListServiceOri", function($window, $rootScope) {
    return {
        createtoDoDetail2: function() {
            return $window.localStorage && $window.localStorage.getItem('my-storage');
        }
    };
});
