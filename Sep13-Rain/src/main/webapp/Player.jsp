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
<form action="player" method="post">
<div class="mb-3">
    <label for="name" class="form-label">Name</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="name">
  </div>
  <div class="mb-3">
    <label for="price" class="form-label">Price</label>
    <input type="text" class="form-control" id="price" aria-describedby="price" name="sport">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Country</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="country">
  </div>
  <div class="mb-3">
    <select class="form-select" aria-label="Default select example">
  <option selected>Married Status</option>
  <option value="1">Single</option>
  <option value="2">Married</option>
</select>
  </div>
  
  <div class="mb-3">
    <label for="name" class="form-label">Wife</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="wife">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Gender</label>
  <div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="flexRadioDefault1">
  <label class="form-check-label" for="flexRadioDefault1">
    Male
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="gender" id="flexRadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
   Female
  </label>
</div>
  <div class="mb-3">
    <label for="price" class="form-label">DOB</label>
    <input type="text" class="form-control" id="price" aria-describedby="price" name="dob">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Father</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="father">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">JerseyNo</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="jerseyNo">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Captain</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="captain">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Coach</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="coach">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Mother</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="mother">
  </div>
  <div class="mb-3">
    <label for="price" class="form-label">Age</label>
    <input type="text" class="form-control" id="price" aria-describedby="price" name="age">
  </div>
  <div class="mb-3">
    <label for="name" class="form-label">Alive</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="alive">
  </div>
 <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>