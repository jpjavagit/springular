app.controller('sobreController',function($rootScope, $location){
	
	$rootScope.activetab = $location.path();
	
	
});

app.controller('homeController', function($rootScope, $location){
	
	$rootScope.activetab = $location.path();
	
});