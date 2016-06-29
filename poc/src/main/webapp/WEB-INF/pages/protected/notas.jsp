<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="appPoc">
	
	<head>
		<title>Visualização de Notas</title>
		<meta charset="utf-8">
		<link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.min.css" />
		
		<style>
			
			.mbottom {
				margin-bottom: 10px;
			}
			
		</style>
		
	</head>
	
	<body>
		<div ng-controller="notasController">
			<div class="container">
				<form name="form">
					<div class="row mbottom">
						<div class="col-sm-1 text-right">
							<strong>Nome:</strong>
						</div>
						<div class="col-sm-2">${usuario.primeiroNome}</div>
						
						<div class="col-sm-3 text-right">
							<strong>Curso:</strong>
						</div>
						<div class="col-sm-3">Sistemas de Informação</div>
					</div>
					<div class="row mbottom">
						<div class="col-sm-1 text-right">
							<strong>E-mail:</strong>
						</div>
						<div class="col-sm-2">${usuario.email}</div>
						
						<div class="col-sm-3 text-right">
							<strong>Unidade:</strong>
						</div>
						<div class="col-sm-3">Praça da Liberdade</div>
					</div>	
					<hr/>
					<div class="row mbottom">
						<div class="col-sm-1 text-right">
							<strong>Disciplina:</strong>
						</div>
						<div class="col-sm-2">
							<select class="form-control" ng-model="disciplina" ng-options="disciplina.nomeDisciplina for disciplina in listarDisciplinas">
								<option value="">Selecione uma disciplina</option>
							</select>
						</div>
						<div class="col-sm-2">
							<button class="btn btn-success" ng-click="recuperarNotas()" type="submit">Consultar</button>
						</div>
					</div>
				
					<div class="row mbottom">
						<div class="container">
							<div class="panel panel-default">
								<div class="panel-heading">Consulta de Notas</div>
									<table class="table">
										<tr>
											<th>Disciplina</th>
											<th>Semestre</th>
											<th>Notas</th>
										</tr>
										<tr ng-repeat="nota in notas">
											<td>{{nota.disciplina.nomeDisciplina}}</td>
											<td>{{nota.semestre}}</td>
											<td>{{nota.nota}}</td>
										</tr>
									</table>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</body>

</html>