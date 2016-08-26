<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Locais</title>
</head>
<body>
<h2>Criar Local</h2>
<br><br>
<form action="incluir_local" method="post">
	<p>
	<label for="nome">Nome: </label>
	<input type="text" id="nome" name="nome" maxlength="128" required>
	</p>
	<p>
	<label for="latitude">Latitude: </label>
	<input type="number" id="latitude" name="latitude" step="0.000001" required>
	</p>
	<p>
	<label for="longitude">Longitude: </label>
	<input type="number" id="longitude" name="longitude" step="0.000001" required>
	</p>
	<p>
	<label for="cidade">Cidade: </label>
	<select id="cidade" name="cidade" required>
	<c:forEach items="${cidades}" var="cidade">
		<option value="${cidade.id}">${cidade.nome} - ${cidade.uf}</option> 
	</c:forEach>
	</select>
	</p>	
	<p>
	<label for="tipo">Tipo: </label>
	<select id="tipo" name="tipo" required>
	<c:forEach items="${tipos}" var="tipo">
		<option value="${tipo.id}">${tipo.nome}</option> 
	</c:forEach>
	</select>
	</p>	
	<input type="submit" value="Enviar">	
</form>
</body>
</html>