(function() {
    'use strict';
angular.module('appPoc')

	.controller('homeController',function($rootScope, $location){
	
	$rootScope.activetab = $location.path();
	
	
})  
})();




