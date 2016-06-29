appPoc.controller('loginController', function($scope, $http){
	
	$scope.login = { email: ""};
	
	$scope.acessar = function(){
		
		if($scope.login.email==""){
			alert("Informe o e-mail!")
			return;
		}
		
		$http.post('/poc/rest/login/logar', $scope.login).success(function(data){
			console.log(data);
			
			if(data.logado){
				window.location = data.url;
				
			}else{
				$("#modal-aviso").modal("show");
				$scope.modalTitle = "Usuário/Senha inválidos!";
			}
			
		});
		
	}
	
	
});