appPoc.controller('usuarioController', function($scope, $http, $resource){
	
	$scope.usuario = { primeiroNome: ""};
	
	$scope.cadastrarUsuario = function(){
		
		$scope.url = '/poc/rest/protected/usuario/cadastrarUsuario';
		
		var url = $scope.url;
		
		$http.post(url, $scope.usuario).success(function(data){
			$("#modal-cadastro").modal("show");
			$scope.modalTitle = "Cadastro Efetuado Com Sucesso!";
			
			/*Adiciona o item no table*/	
			var newResource = new angularResource($scope.usuario);
			$scope.usuarios.push(newResource);
			
			$scope.usuario.primeiroNome="";
			$scope.usuario.email="";
			
		}).error(function(){
			$("#modal-cadastro").modal("show");
			$scope.modalTitle = "Falha ao cadastrar aluno!";
		});
		
	};
	
	var angularResource = $resource('/poc/rest/protected/usuario/listarUsuarios');
	$scope.usuarios = angularResource.query(function(){});
	
});



