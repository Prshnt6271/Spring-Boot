<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>student name........${name}</h1> <br>
<h1>student age........${age}</h1> <br>
<h1>student mobile........${email}</h1> <br>
<h1>student email........${mobile}</h1> <br>

<c:forEach items="${marks}" var="mark">
    <h1>Your marks data.........${mark}</h1>
</c:forEach>

</body>
</html>