<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="appPoc">
	
	<head>
		<title>Home</title>
		<meta charset="utf-8">
		<link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.min.css" />
		
		<style>
			
			.mbottom {
				margin-bottom: 10px;
			}
			
		</style>
		
	</head>
	
	<body>
		
		<div ng-controller="usuarioController">
		
			<div class="container">
				<form name="form">
					<div ng-show="false">
						<div  class="row mbottom">
							<div class="col-sm-3 text-right">Primeiro Nome</div>
							<div class="col-sm-6">
								<input type="text" name="nome" class="form-control" ng-model="usuario.primeiroNome" ng-required="true">
							</div>
						</div>
						
						<div class="row mbottom">
							<div class="col-sm-3 text-right">E-mail</div>
							<div class="col-sm-6">
								<input type="email" name="email" class="form-control" ng-model="usuario.email" ng-required="true">
							</div>
						</div>
									
						<div class="row mbottom">
							<div class="col-sm-6 col-sm-offset-3">
								<button class="btn btn-success" ng-disabled="form.nome.$invalid || form.email.$invalid" ng-click="cadastrarUsuario()" type="submit">Cadastrar</button>
							</div>
						</div>
					</div>
					<div class="row mbottom">
						<div class="col-sm-6 col-sm-offset-3">
							<div class="panel panel-default">
								<div class="panel-heading">Dados</div>
									<table class="table">
										<tr>
											<th>Nome</th>
											<th>E-mail</th>
										</tr>
										<tr ng-repeat="aluno in usuarios">
											<td>{{aluno.primeiroNome}}</td>
											<td>{{aluno.email}}</td>
										</tr>
									</table>
							</div>
						</div>
					</div>
				
					
				</form>
			</div>
			
			
			
			<!-- Modal -->
			<div id="modal-cadastro" class="modal fade" role="dialog">
				<div class="modal-dialog">
					
					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">×</button>
								<h4 class="modal-title">Atenção</h4>
						</div>
						<div class="modal-body">
							 <p>{{modalTitle}}</p>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
						</div>
					</div>
				</div>
			</div>
			
		</div>
		
	</body>
	
		
		
</html>
