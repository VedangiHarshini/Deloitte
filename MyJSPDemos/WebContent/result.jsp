<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
The total is <%= session.getAttribute("total") %>
<% session.invalidate(); %>
<a href = result2.jsp>Go to result2</a>


</body>
</html>