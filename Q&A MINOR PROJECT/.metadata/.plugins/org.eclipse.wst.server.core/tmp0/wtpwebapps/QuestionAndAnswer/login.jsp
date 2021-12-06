<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Problem share Problem solved </title>

</head>

<body>
<%@ include file="BootStrap.jsp" %>
<div align="center">
	<br>
		<h1>Welcome to Problem share Problem solved</h1>
		<c:choose>
		<c:when test="${param.code==202 }">
			<div class="alert alert-danger">
			Invalid Details
			
			</div>
		</c:when>
		<c:when test="${param.code==101 }">
			<div class="alert alert-succses">
			Registration Successful Now You Should Login 
			
			</div>
		</c:when>
	</c:choose>

			<br><br>
		<form action="login-validation">
			Enter User Name : <input type="text" name="name"><br><br>
			Enter Password  : <input type="password" name="pass"><br><br>
			<button type="submit">Login</button> 
			<a href="NewRegistration.jsp">  Not Yet Register</a>
		</form>
	</div>

</body>
</html>