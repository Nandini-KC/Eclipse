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
<form action="food" method="post">
<nav class="navbar navbar-light" style="background-color: green">
  <div class="container-fluid">
   <a class="navbar-brand" href="index.jsp">Home</a>
    <a class="navbar-brand" href="Food.jsp">Food</a>
</nav>
   </div>
	<div class="mb-3">
    <label for="name" class="form-label">Name</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="name">
  </div>
  
 <div class="form-group col-md-12">
 <label>Type</label>
 	<br>
    <select class="type" name="type">
  <option>Select</option>
  <option>Vegetarian</option>
  <option >Non-Vegetarian</option>
	</select>
  </div>
  
  <div class="form-group col-md-12">
 <label>Hotel Name</label>
 <br>
    <select class="type" name="hotelName">
  <option>Select</option>
  <option >Meghana Foods</option>
  <option>Abhiruchi</option>
   <option >Kattappa</option>
  <option >Gokul Foods</option>
   <option>ABs</option>
  <option >Udipi garden</option>
   <option >Priya foods</option>
  <option >Nandana palace</option>
   <option>Prabha gardens</option>
  <option >Salt and pepper</option>
	</select>
  </div>


  <div class="mb-3">
    <label for="name" class="form-label">Price</label>
    <input type="text" class="form-control" id="name" aria-describedby="name" name="price">
  </div>
  <div class="form-group col-md-12">
 <label>Quantity</label>
 <br>
    <select class="type" name="quantity">
  <option>Select</option>
  <option >1</option>
  <option>2</option>
   <option >3</option>
  <option >4</option>
   <option>5</option>
  <option >6</option>
   <option >7</option>
  <option >8</option>
   <option>9</option>
  <option >10</option>
	</select>
  </div>
 <div class="col-12">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
      <label class="form-check-label" for="invalidCheck">
        Accept Agreement
      </label>
      <div class="invalid-feedback">
        Please Accept to Send
      </div>
    </div>
  </div>
 <button type="submit" class="btn btn-primary">Send</button>
</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
  
</body>
</html>