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
<form action="save" method="post">
<nav class="navbar navbar-light" style="background-color: green">
  <div class="container-fluid">
   <a class="navbar-brand" href="index.jsp">Home</a>
    <a class="navbar-brand" href="Waste.jsp">Waste</a>
</nav>
   </div>
	<div class="mb-3">
    <label for="name" class="form-label">Name</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="name">
  </div>
  
  <div class="mb-3">
    <label for="name" class="form-label">Type</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="type">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Weight</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="weight">
  </div>
  

 <button type="submit" class="btn btn-primary">Send</button>
</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
  
</body>
</html>