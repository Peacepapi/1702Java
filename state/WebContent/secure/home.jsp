<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

<jsp:include page="../nav.jsp"> <!-- dynamic include -->
	<jsp:param value="${logged_user.ipAddress}" name="ip"/>
</jsp:include>

<%-- vulnerable to XSS attacks
 <div>Hello, ${logged_user.firstName}"</div> --%>
<div>Hello, <c:out value="${logged_user.firstName}" /> </div>
</body>
</html>