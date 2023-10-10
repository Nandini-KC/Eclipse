<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "jstl" %>

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
<h1>Temples Details</h1>
<nav class="navbar navbar-light" style="background-color: pink">
  <div class="container-fluid">
   <a class="navbar-brand" href="index.jsp">Home</a>
   <a class="navbar-brand" href="TempleInfo.jsp">New</a>
</nav>
	<table class="table table-bordered">
	<tr>
	<th>Name</th>
	<th>Place</th>
	<th>Main God</th>
	<th>Constructed Year</th>
	<th>Constructed By</th>
	</tr>
	<jstl:forEach items="${view}" var="dto">
	<tr>
	<td>${dto.name}</td>
	<td>${dto.place}</td>
	<td>${dto.mainGod}</td>
	<td>${dto.constYear}</td>
	<td>${dto.constBy}</td>
	</tr>
	</jstl:forEach>
	</table>

<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>