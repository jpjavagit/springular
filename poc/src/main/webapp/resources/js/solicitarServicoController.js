appPoc.controller('solicitarServicoController', function($scope, $http, $resource){
	
	$scope.solicitarServico = '';
	
	$scope.servicosCombo = [];
	
	$scope.cadastrarServico = function(){
		
		$scope.url = '/poc/rest/protected/servico/solicitarServico';
		var url = $scope.url;
		
		if($scope.solicitarServico==''){
			$scope.modalTitle = "Selecione um serviço!";
			$("#modal-cadastro").modal("show");
			return false;
		}
		
		$http.post(url, $scope.solicitarServico).success(function(data){
			
			$scope.modalTitle = "A solicitação foi enviada com sucesso!";
			$("#modal-cadastro").modal("show");
			
			$scope.solicitarServico = {};
			
		}).error(function(){
			$("#modal-cadastro").modal("show");
			$scope.modalTitle = "Falha ao cadastrar serviço!";
		});
		
	};
	
	$scope.listarServicos = function(){
		var angularResource = $resource('/poc/rest/protected/servico/listarServicos');
		$scope.meusServicos = angularResource.query(function(){});
	};

	
	$http.get('/poc/rest/protected/servico/servicos').success(function(data){
		$scope.servicosCombo = data;
	}).error(function(){
		$("#modal-cadastro").modal("show");
		$scope.modalTitle = "Falha ao recuperar os serviços!";
	});
	
});



