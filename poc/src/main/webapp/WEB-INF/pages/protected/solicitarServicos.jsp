<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="appPoc">
	
	<head>
		<title>Home</title>
		<meta charset="utf-8">
		<link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.min.css" />
		<style>
			.mb<div class="row mbottom">
						<div class="col-sm-6 col-sm-offset-3">
							<button class="btn btn-success" ng-click="cadastrarServico()" type="submit">Solicitar</button>
						</div>
					</div>ottom {
				margin-bottom: 10px;
			}
		</style>
	</head>
	
	<body>
		<div ng-controller="solicitarServicoController">
			<div class="container">
				<form name="form">
					<div class="row mbottom">
						<div class="col-sm-3 text-right">Serviços:</div>
						<div class="col-sm-7">
							<select class="form-control" ng-model="solicitarServico.servico" ng-options="servico.descricao for servico in servicosCombo">
								<option value="">Selecione uma opção</option>
							</select>
						</div>
						<div class="col-sm-2">
							<button class="btn btn-success" ng-click="cadastrarServico()" type="submit">Solicitar</button>
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