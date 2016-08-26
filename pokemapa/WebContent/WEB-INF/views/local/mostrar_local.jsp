<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Locais</title>
</head>
<body>
<h2>Mostrar Local</h2>
<br><br>
	<p>
	<strong>Nome:</strong> ${novo_local.nome}
	</p>
	<p>
	<strong>Latitude: </strong> ${novo_local.latitude}
	</p>
	<p>
	<strong>Longitude: </strong> ${novo_local.longitude}
	</p>
	<p>
	<strong>Cidade: </strong> ${novo_local.nomeCidade}
	</p>
	<p>
	<strong>Tipo: </strong> ${novo_local.nomeTipo}
	</p>
	<a href="pokemapa">Inserir outro</a>
</body>
</html>