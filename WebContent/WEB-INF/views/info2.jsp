<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/info.css">
<title>Shoe Info</title>
</head>
<body>
 
<c:forEach var="shoe" items="${shoes}">

Brand: ${shoe.brand}<br> 
Style: ${shoe.style}<br>
Color: ${shoe.color}<br>
Purchase Price $${shoe.pprice}<br>
Resale Price $${shoe.rprice}<br>
<img src="${shoe.imageUrl}"/><br><br>

</c:forEach>

  
 
<p>

<a href="home.do">Return to App Homepage</a>
</p>
</body>
</html>