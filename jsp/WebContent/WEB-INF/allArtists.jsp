<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Importing a tag library w/ directive -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Artists</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<table class="table table-hover">
<tr><th>Id</th><th>Artist</th></tr>
<!-- for-each artist in request scoped variable, add a new row to table -->
<c:forEach var="temp" items="${artistList}">
	<tr><td>${temp.artistId}</td><td>
	<c:choose>
		<c:when test="${temp.name eq 'Dogstar'}">
			<span style="font-weight: bolder;">${temp.name}</span>
		</c:when>
		<c:when test="${temp.name eq 'The Boxmasters'}">
			<span style="font-weight: bolder;">${temp.name}</span>
		</c:when>
		<c:otherwise>${temp.name}</c:otherwise>
	</c:choose>
	</td></tr>
</c:forEach>
</table>
</body>
</html>


