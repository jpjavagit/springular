(function() {
    'use strict';
angular.module('appPoc')

	.controller('sobreController',function($rootScope, $location){
	
	$rootScope.activetab = $location.path();
	
	
})  
})();



