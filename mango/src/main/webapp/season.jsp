<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Index Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<form action="season" method="post">
	<nav class="navbar bg-success" data-bs-theme=white>
			<ul class="nav nav-pills card-header-pills">
				<li class="nav-item"><a class="nav-link active"
					href="season.jsp">Season</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="index.jsp">Home</a></li>

			</ul>
	</nav>
Country<input type="text" name="country"><br>
Season<input type="text" name="season">
 <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>