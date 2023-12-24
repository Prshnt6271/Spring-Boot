<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Books</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container-fluid bg-success text-white text-center">
    <h1>Spring Boot MVC Project</h1>
    <h2>@Controller layer @Service Exceptions Validations JSP layer...</h2>
</div>

<div class="container">
    <h1><i>List of Books Information</i></h1>
    <div class="text-center">
        <a class="link-primary badge bg-warning" href="/books/addbook">Click here to add a new book</a>
    </div>

    <br>

    <table class="table table-striped table-bordered table-hover">
        </thead>
        <tbody>
             <c:forEach items="${book}" items="books">
                <tr>
                    <td>${book.isbn}</td>
                    <td>${book.name}</td>
                    <td>${book.author}</td>
                    <td>
                        <a href="/delete">Delete</a>
                        <a href="/edit">Edit</a>
                    </td>
                </tr>
            </c:forEach> 
        </tbody>
    </table>
</div>

</body>
</html>
