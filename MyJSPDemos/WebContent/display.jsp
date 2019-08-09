<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%! String username; 
Date d;%>
<% 
username = request.getParameter("username");
%>
Welcome,<%=username %>
<%
if(username.equals("Harshini"))
{
d = new Date();
RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
dispatcher.include(request,response);
}
else
{
	response.sendRedirect("project.html");
}

%> 

<body>

</body>
</html>