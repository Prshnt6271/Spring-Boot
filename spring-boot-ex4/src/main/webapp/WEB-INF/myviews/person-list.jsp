<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lombok With Model object</title>
</head>
<body>
	<h1>Person List</h1>


	<c:forEach items="${persons}" var="person">
person first name............ ${person.FirstName} <br>
person last name............ ${person.LastName}  <br>
person email ............ ${person.email}        <br>
 ************************************<br>

	</c:forEach>
</body>
</html>