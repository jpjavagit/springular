(function() {
    'use strict';
angular.module('appPoc')

	.controller('defaultController',function($rootScope, $location){
	
		$rootScope.activetab = $location.path();
	
	
})  
})();
