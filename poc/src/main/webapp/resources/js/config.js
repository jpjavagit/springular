var appPoc = angular.module('appPoc',['ngRoute','ngResource']);

appPoc.config(function($routeProvider){
		
	//$routeProvider.html5Mode(true);
	
	$routeProvider
	
	 .when('/notas', {
		 
		 templateUrl: '/poc/protected/notas',
		 controller:'notasController'
		 
	 })
	 
	 .when('/solicitarServicos',{
		
		 templateUrl: '/poc/protected/solicitarServicos',
		 controller:'solicitarServicoController'
		 
	 })
	 
	  .when('/meusServicos',{
		
		 templateUrl: '/poc/protected/meusServicos',
		 controller:'solicitarServicoController'
		 
	 })
	 
	 .when('/editarUsuario', {
		 
		 templateUrl: '/poc/protected/editarUsuario',
		 controller:'usuarioController'
		 
	 });
	 
	 //.otherwise ({ redirectTo: '/index' });
	
});
	
