<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Grocery data</h1><h2>Total items : ${total}</h2>
<a href="view">View</a>
<pre>
<form action="save" method="post">
Name<input type="text" name="name"/>
Price<input type="text" name="price"/>
Type<select name="type">
<option>Select</option>
<option>fruits</option>
<option>vegetables</option>
<option>dals</option>
</select>
Quantity<input type="number" name="quantity"/>
<button type="submit" name="save">Submit</button>


	
</form>

</pre>
</body>
</html>