<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Directive: translation instructions (occur at translation time) -->
<%@ page import="java.util.Date" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP File</title>
</head>
<body>
<!-- Declaration: declare instance variables (page-scoped)
		 and create/override methods -->
<%!
	private int i = 0;
	private String var = "";
	
	public void jspInit(){
		System.out.print("Initializing index.jsp...");
	}
%>

<!-- Scriplet: embed Java code. executed inside _jspService method -->
Numbers: 
<% 
	for(;i<10;i++){
		out.print(i);
	}
%>
<!-- Expression: short-hand for out.println.  -->
Today's date is <%= new Date() %>
</body>
</html>




