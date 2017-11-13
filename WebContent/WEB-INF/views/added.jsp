<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


<title>Shoe Added or Updated</title>
</head>
<body>

<div class="headBar">
<h1>Shoe Added or Updated</h1>

</div>

<div id="wrapper">
<div class="container">
Brand: ${shoe.brand}<br> 
Style: ${shoe.style}<br>
Color: ${shoe.color}<br>
Purchase Price $${shoe.pprice}<br>
Resale Price $${shoe.rprice}<br>
<img src="${shoe.imageUrl}"/><br>
</div>
<br>
<br>
<p>
<a href="home.do">Return to App Homepage</a>
</p>
</div>
</body>
</html>