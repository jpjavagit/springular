<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<title>Login Page</title>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body onload="checkLogin('${error}');">

	<div ng-controller="loginController" >
		
		<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<div class="page-header">
						<h3>Acesso Portal</h3>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-xs-12">
				<form name="loginForm" class="form-horizontal" action="<c:url value='j_spring_security_check' />" method='POST'>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">E-mail</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name='username' id="inputEmail3" placeholder="Informe o seu e-mail" ng-model="login.email" required>
						</div>	
					</div>	
					<div class="form-group">
						<label for="inputPassword" class="col-sm-2 control-label">Senha</label>
						<div class="col-sm-3">
							<input type="password" name='password' class="form-control" id="inputPassword" placeholder="Informe sua senha" ng-model="login.email" required>
						</div>	
																	
					</div>
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button name="submit" ng-click="logar()" class="btn btn-default">Logar</button>
						</div>						
					</div>
					
					 <input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
					
				</form>
				
			</div>
		</div>
		
				<!-- Modal -->
		<div id="modal-aviso" class="modal fade" role="dialog">
			<div class="modal-dialog">
				
				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
							<h4 class="modal-title">Atenção</h4>
					</div>
					<div class="modal-body">
						 <p>${error}</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
					</div>
				</div>
			</div>
		</div>
		
	</div>
	
	<script type="text/javascript">

		function checkLogin(msg){
			if(msg!=''){
				$("#modal-aviso").modal("show");
			}
		}

	</script>
	
	
		<script src="https://code.angularjs.org/1.4.4/angular.min.js"></script>
		<script src="https://code.angularjs.org/1.4.4/angular-resource.min.js"></script>
		<script src="https://code.angularjs.org/1.4.4/angular-route.js"></script>
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		
		<script src="<c:url value="/resources/js/config.js" />"></script> 
		<script src="<c:url value="/resources/js/loginController.js" />"></script>
		
		
</body>
</html>