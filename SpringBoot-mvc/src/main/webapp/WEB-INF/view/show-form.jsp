<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
<form:form action="/processForm" method="post" modelAttribute="customer">
	<label>First Name:</label><form:input type="text" path="firstName"/><br/>
	<label>Last Name:</label><form:input type="text" path="lastName"/><br/>
	<label>Phone Number:</label><form:input type="number" path="phone"/><br/>
	<input type="submit"/>
</form:form>
</body>
</html>