<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shoe Info</title>
</head>
<body>
Brand: ${shoe.brand}<br> 
Style: ${shoe.style}<br>
Color: ${shoe.color}<br>
Purchase Price $${shoe.pprice}<br>
Resale Price $${shoe.rprice}<br>
<img src="${shoe.imageUrl}"/><br>

<p>


<a href="home.do">Return to App Homepage</a>
</p>
</body>
</html>