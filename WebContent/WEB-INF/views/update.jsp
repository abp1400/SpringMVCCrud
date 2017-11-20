<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
	
</script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
	
</script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="css/info.css">


<title>Update a Shoe</title>
</head>
<body>
<div class="headBar">
<h1>Enter Shoe Data</h1>
</div>
<div id="wrapper">
<div class="container">
<form:form action="updateShoe.do" method ="post" modelAttribute="shoe">
Brand: <input type="text" name="brand" value="${shoe.brand}"> <br>
Style: <input type="text" name="style" value="${shoe.style}"> <br>
Color: <input type="text" name="color" value="${shoe.color}"> <br>
Purchase Price: <input type="number" name="pprice" value="${shoe.pprice}"> <br>
Resale Price: <input type="number" name="rprice" value="${shoe.rprice}"> <br>
Image URL: <input type="text" name="imageUrl" value="${shoe.imageUrl}"><br>
<input type="hidden" name="shoeid" value="${shoe.shoeid}">
<input type="submit" value="Update">

</form:form>
</div>
<br>
<br>
<p>
<a href="home.do">Return to App Homepage</a>
</p>
</div>

</body>
</html>