<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to ShoeBox App</title>
</head>
<body>
<h1>Welcome to the ShoeBox app</h1>

<c:set var="selectedItem" value=""/>

<h2>Filter Shoes by Brand</h2>
 <form:form action="getShoe.do" method="post" modelAttribute="idForm">
<form:input path="brand"/> <form:errors path="brand"/>

<input type="submit" value="Get Shoes by Brand">

</form:form> 



<p>
<h3>All Shoes:</h3> <br>

<c:forEach var="shoe" items="${list}">
<a href="info.do?id=${shoe.index}"> ${shoe.brand} ${shoe.style}</a><br>
<%-- <form method="post" action="delete.do">
<input type = "submit" value ="Delete">
<input type = "hidden" name="id" value="${shoe.index}">
</form>
<form method="post" action="update.do">
<input type = "submit" value ="Update">
<input type = "hidden" name="id" value="${shoe.index}">
</form> --%>

</c:forEach>



<p>
 <a href="add.do">Add a Shoe</a>
</p>

</body>
</html>