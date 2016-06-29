appPoc.controller('notasController', function($scope, $http, $resource){
	
	$scope.semestres = [
	                    
	                    {id: 1, descricao: '1º Semestre'},
	                    {id: 2, descricao: '2º Semestre'}
	                    
	                    ];
	
	$scope.listarDisciplinas = [];
	
	$scope.disciplina = "";
	
	$http.get('/poc/rest/protected/disciplaNota/listarDisciplinas').success(function(data){
		
		$scope.listarDisciplinas = data;
		
	}).error(function(){
		$("#modal-cadastro").modal("show");
		$scope.modalTitle = "Falha ao recuperar disciplinas!";
		
	});
	
	/**Recupera os dados do usuário logado e seta em dadosAluno*/
	$http.get('/poc/rest/protected/disciplaNota/alunoSessao').success(function(data){
		$scope.dadosAluno = data;
	});
	
	$scope.recuperarNotas = function(){
		var angularResource = $resource('/poc/rest/protected/disciplaNota/listarNotas/:disciplina',{disciplina:$scope.disciplina.codigoDisciplina});
		$scope.notas = angularResource.query(function(){});
	};
	
});



