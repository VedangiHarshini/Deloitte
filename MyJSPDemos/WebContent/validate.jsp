<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<%
 String username = request.getParameter("username"); 
session.setAttribute("username",username);

String password = request.getParameter("password");
if((username.equals("Harshini")) && (password.equals("qwerty")))
{
	%>
	<jsp:forward page = "success.jsp"></jsp:forward>
	<% 
}
else
{
	
	session.setAttribute("errMsg","Incorrect username or password");
	
	response.sendRedirect("index.jsp");
}
%>
</body>
</html>