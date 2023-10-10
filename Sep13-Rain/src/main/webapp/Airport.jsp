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
<form action="airport" method="post">
<div class="mb-3">
    <label for="name" class="form-label">Name</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="name">
  </div>
  <div class="mb-3">
    <label for="price" class="form-label">Type</label>
    <input type="text" class="form-control" id="price" aria-describedby="price" name="type">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Country</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="country">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">City</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="city">
  </div>
  <div class="mb-3">
    <label for="price" class="form-label">Capacity</label>
    <input type="text" class="form-control" id="price" aria-describedby="price" name="capacity">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Width</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="width">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Total Terminal</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="totalterminal">
  </div>
  <div class="mb-3">
    <label for="price" class="form-label">Open date</label>
    <input type="date" class="form-control" id="price" aria-describedby="price" name="date">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Operational</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="operational">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">InagrautedBy</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="inagrautedby">
  </div>

 <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>