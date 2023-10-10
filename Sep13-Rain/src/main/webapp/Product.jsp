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
<form action="product" method="post">
	<nav class="navbar navbar-light" style="background-color: green">
			<ul class="nav nav-pills card-header-pills">
				<li class="nav-item"><a class="nav-link active"
					href="Product.jsp">Product</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="Vendor.jsp">Vendor</a></li>

			</ul>
	</nav>
	<div class="mb-3">
    <label for="name" class="form-label">Name</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="name">
  </div>
  <div class="mb-3">
    <label for="price" class="form-label">Price</label>
    <input type="text" class="form-control" id="price" aria-describedby="price" name="price">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Type</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="type">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Quantity</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="quantity">
  </div>
 <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>