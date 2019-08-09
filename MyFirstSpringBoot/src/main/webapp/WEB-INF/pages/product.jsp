<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%--     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>
	Add products
</h1>

<c:url var="addAction" value="/product/add" ></c:url>

<form:form action="${addAction}" modelAttribute="product">
<table>
<tr>
<td><form:label path="productId"><spring:message text="ID"/></form:label></td>
<td><form:input path="productId" size="8"/></td> 
</tr>
			
<tr>
<td><form:label path="productName"><spring:message text="Name"/></form:label></td>
<td><form:input path="productName" /></td>
</tr>

<tr>
<td><form:label path="quantity"><spring:message text="productQuantity"/></form:label></td>
<td><form:input path="quantity" /></td>
</tr>

<tr>
<td><form:label path="price"><spring:message text="productPrice"/></form:label></td>
<td><form:input path="price" /></td>
</tr>



<tr><td colspan="2">
			<c:if test="${!empty product.productName}">
				<input type="submit" 
				formaction="add/update"
					value="<spring:message text="Edit Product" />" />
			</c:if>
			
			<c:if test="${empty product.productName}">
				<input type="submit"
					value="<spring:message text="Add Product"/>" />
			</c:if>
			
</td></tr>
</table>	
</form:form>
<br>
<h3>Product List</h3>
<c:if test="${!empty listProducts}">
	<table class="tg">
	<tr>
		<th width="80">Product ID</th>
		<th width="120">Product Name</th>
		<th width="60">Quantity</th>
		<th width="120">Price</th>
		
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listProducts}" var="product">
		<tr>
			<td>${product.productId}</td>
			<td>${product.productName}</td>
			<td>${product.quantity}</td>
			<td>${product.price}</td>
			<td><a href="<c:url value='/edit/${product.productId}' />" >Edit</a></td>
			<td><a href="<c:url value='/delete/${product.productId}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="product" action="saveProductRecord">
<h2>Product Form</h2>
Product Id :<form:input path ="productId" name="productId" text="productId"/><br/>
Product Name :<form:input path ="productName" name="productName" text="productName"/><br/>
Product Quantity :<form:input path ="quantity" name="productQuantity" text="productQuantity"/><br/>
Product Price :<form:input path ="price" name="productPrice" text="productPrice"/><br/>

<input type ="submit" value ="Save">
</form:form>
${message} 
</body>
</html>


