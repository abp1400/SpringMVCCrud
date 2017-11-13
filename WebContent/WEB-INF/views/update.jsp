<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update a Shoe</title>
</head>
<body>
<h3>Enter Shoe Data</h3>
<form:form action="updateShoe.do" method ="post" modelAttribute="shoe">
Brand: <form:input path="brand"/> <form:errors path="brand"/> <br>
Style: <form:input path="style"/> <form:errors path="style"/> <br>
Color: <form:input path="color"/> <form:errors path="color"/> <br>
Purchase Price: <form:input path="pprice"/> <form:errors path="pprice"/><br>
Resale Price: <form:input path="rprice"/> <form:errors path="rprice"/><br>
Image URL: <form:input path="imageUrl"/> <form:errors path="imageUrl"/><br>
<form:hidden path="index"/>
<input type="submit" value="Update">



</form:form>


</body>
</html>