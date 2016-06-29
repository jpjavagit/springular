<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html ng-app="appPoc">
	<head>
	<title>Home</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	 <meta http-equiv="content-language" content="pt-br" />
	  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	</head>
	
	<body>

		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">POC - PUC</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="#/editarUsuario">Usuario</a></li>
						<li><a href="#/notas">Consulta de Notas</a></li>
						<li class="dropdown">
							  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" 
							  		aria-haspopup="true" aria-expanded="false">Serviços<span class="caret"></span>
							  </a>
	        				<ul class="dropdown-menu">
	          					<li><a href="#/solicitarServicos">Solicitação de Serviços</a></li>
	          					<li><a href="#/meusServicos">Meus Serviços</a></li>
							</ul>
						</li>
					</ul>
					<ul class="nav pull-right">
                    	<li><a href="javascript:formSubmit()">Sair</a></li>
                	</ul>
				</div>	
			</div>
		</nav>
		
		
		<c:url value="/j_spring_security_logout" var="logoutUrl" />
		
		<form action="${logoutUrl}" method="post" id="logoutForm">
	  		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
		
		
		<div ng-view></div>
		
	</body>
	
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>
	
		<script src="https://code.angularjs.org/1.4.4/angular.min.js"></script>
		<script src="https://code.angularjs.org/1.4.4/angular-resource.min.js"></script>
		<script src="https://code.angularjs.org/1.4.4/angular-route.js"></script>
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		
		<script src="<c:url value="/resources/js/config.js" />"></script> 
		<script src="<c:url value="/resources/js/defaultController.js" />"></script>
		<script src="<c:url value="/resources/js/sobreController.js" />"></script>
		<script src="<c:url value="/resources/js/homeController.js" />"></script>
		<script src="<c:url value="/resources/js/usuarioController.js" />"></script>
		<script src="<c:url value="/resources/js/notasController.js" />"></script>
		<script src="<c:url value="/resources/js/solicitarServicoController.js" />"></script>
		
	
</html>