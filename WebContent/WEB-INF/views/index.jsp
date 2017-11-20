<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
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

	<link rel="stylesheet" type="text/css" href="css/nice.css">

<title>Welcome to ShoeBox App</title>






</head>
<body>
<div class="headBar">	
<h1>Welcome to the ShoeBox App</h1>
</div>

<div class="parallax">
		<!-- Image of Shoes goes here and title will scroll over it. -->
	</div>

<div class="formBox">
<h2>Filter Shoes by Brand</h2>
<form action="selectAlt.do" method="POST">
		<select name="brand">

		<c:forEach var="shoe" items="${list}">
		<option value="${shoe.brand}">${shoe.brand}</option>
		
		</c:forEach>

		</select>
		<input type="submit" value="Get shoe by brand">
</form>



<br>

<h2>Filter Shoes by Resale Price </h2>
 <h3>Enter a Minimum Resale Price in $:</h3>
 <form:form action="getShoeByPrice.do" method="post" modelAttribute="idForm">
<form:input path="rprice"/> <form:errors path="rprice"/>

<input type="submit" value="Get Shoes by Resale Price">

</form:form> 

</div>
<div id="wrapper">
<h2>All Shoes:</h2> <br>
<div class="container">
<c:forEach var="shoe" items="${list}">
<a href="info.do?id=${shoe.shoeid}"> ${shoe.brand}&nbsp;${shoe.style}</a><br>
<a href="info.do?id=${shoe.shoeid}"><img src="${shoe.imageUrl}"/></a><br>
<form method="post" action="delete.do">
<input type = "submit" value ="Delete">
<input type = "hidden" name="index" value="${shoe.shoeid}">
</form>
<form method="post" action="update.do">
<input type = "submit" value ="Update">
<input type = "hidden" name="index" value="${shoe.shoeid}">
</form> 

</c:forEach>
</div>
<p>
<div id="bottom">
 <a href="add.do">Add a Shoe</a>
</p>
<p>
<a href="home.do">Go back to Shoebox App Homepage</a>
</p>
</div>
</div>
</body>
</html>