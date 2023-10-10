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
<form action="food" method="post">
<nav class="navbar bg-success" data-bs-theme=white>
			<ul class="nav nav-pills card-header-pills">
				<li class="nav-item"><a class="nav-link active"
					href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="Food.jsp">Food</a></li>

			</ul>
	</nav>
<h1>Food details Successfully saved!!</h1>

Name = ${key1}<br>
Type = ${key2}<br>
Hotel Name = ${key3}<br>
Price = Rs: ${key4}<br>
Quantity = ${key5}<br>
Total = Rs: ${key6}<br>

</form>
</body>
</html>