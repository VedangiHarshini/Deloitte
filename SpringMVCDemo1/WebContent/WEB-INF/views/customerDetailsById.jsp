<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix ="f" %>
<!DOCTYPE html>
<html>
<head>
<body bgcolor = "violet"text="white">
<center>
<b>
<font face="comic sans ms "size ="20">AutoFill
</font>
</center>
<f:form action = "searchCustomerById.do"> 

<table cellspacing ="10" cellpadding ="10" align="center">
<tr><td>Customer Id </td>
<td><f:input path="customerId" type ="text" 
 id ="customerId" name ="customerId"></f:input></td></tr>
 
<tr><td><input type ="submit"value = "Search"></td>
<td><input type = "reset"value ="cancel"></td></tr>

<tr><td>Customer Name </td>
<td><f:input type ="text" path ="customerName" 
id ="customerName" name ="customerName"></f:input></td></tr>

<tr><td>Customer Address </td>
<td><f:input path = "customerAddress" type ="text"
name ="customerAddress"></f:input></td></tr>

<tr><td>Bill Amount </td>
<td><f:input path ="billAmount" type ="text"
 id ="billAmount" name ="billAmount"></f:input></td></tr>
 
</table>
</f:form>
<a href = "index.html">Index Page</a>

</body>

</html>