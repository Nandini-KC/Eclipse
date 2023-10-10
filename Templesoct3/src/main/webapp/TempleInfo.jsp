<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-light" style="background-color: pink">
  <div class="container-fluid">
   <a class="navbar-brand" href="index.jsp">Home</a>
   <a class="navbar-brand" href="HomeView.jsp">View</a>
</nav>
<h1 >Temple Info </h1><h2>Total :${total }</h2>
<a href="view">View</a>

<form action="save" method="post">
Name<input type="text" name="name"/><br>
Place<input typr="text" name="place"/><br>
Main God<input type="text" name="mainGod"/><br>
Constructed Year<input type="number" name="year"/><br>
Constructed By<input type="text" name="by"/><br>
<button type="submit" name="save">Save</button>
</form>

<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>