<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri ="/WEB-INF/customtag.tld" prefix = "a" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<%--  <%= session.getAttribute("cust") %> --%> 
<br/>${cust.customerId}
<br/>${cust.customerName}
<br/>${cust.customerAddress}
<br/>${cust.billAmount}
<a:deloitteadd></a:deloitteadd>
</body>
</html>