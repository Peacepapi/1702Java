<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="login.do" method="post">
	First Name: <input type="text" name="f_name" /> <br/>
	<c:choose>
		<c:when test="${not empty val}">
			User: <input type="text" name="user" value="${val}" /> <br/>
		</c:when>
		<c:otherwise>
			User: <input type="text" name="user" /> <br/>
		</c:otherwise>
	</c:choose>
			Password: <input type="password" name="pass" /> <br/>
			<input type="submit" value="Login" />
</form>
</body>
</html>




