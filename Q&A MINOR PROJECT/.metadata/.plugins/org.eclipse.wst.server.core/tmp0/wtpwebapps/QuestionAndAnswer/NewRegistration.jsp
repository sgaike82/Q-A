<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>

<%@ include file="BootStrap.jsp" %>
	<div align="center"><br> 
	<c:choose>
		<c:when test="${param.code==102 }">
			<div class="alert alert-danger">
			Invalid Details
			
			</div>
		</c:when>
		
	</c:choose>
	
	<br>
		<h1> New Registration </h1> <br><br>
		<form action="save-details">
		Enter Your Name : <input type="text" name="name"></input> <br> <br>
		Enter Your City : <input type="text" name="city"></input>  <br><br>
		Enter Your Password : <input type="password" name="Password"></input> <br><br>
		<button type="submit">Submit</button>
		
		</form>

</div>
</body>
</html>