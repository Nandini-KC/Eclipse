<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Product Success Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<form action="save" method="post">
<nav class="navbar navbar-light" style="background-color: green">
  <div class="container-fluid">
   <a class="navbar-brand" href="index.jsp">Home</a>
    <a class="navbar-brand" href="Waste.jsp">Waste</a>
</nav>
<h1>Food details Successfully saved!!</h1>

Name = ${msg}<br>
Type = ${msg}<br>
Weight = ${msg}<br>

</form>
</body>
</html>
