<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New Book</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container-fluid bg-success text-white text-center">
    <h1>Spring Boot MVC Project</h1>
    <h2>@Controller layer @Service Exceptions Validations JSP layer...</h2>
</div>

<div class="container">
    <h1><i>Add a New Book...</i></h1>

    <form method="post" action="/books/savebook">
        <div class="mb-3">
            <label for="isbn" class="form-label">Book ISBN:</label>
            <input type="text" class="form-control" id="isbn" name="isbn" placeholder="Book number" required>
        </div>

        <div class="mb-3">
            <label for="name" class="form-label">Book Name:</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Book Name" required>
        </div>

        <div class="mb-3">
            <label for="author" class="form-label">Book Author:</label>
            <input type="text" class="form-control" id="author" name="author" placeholder="Book Author" required>
        </div>

        <button type="submit" class="btn btn-primary">Save Book</button>
    </form>
</div>

</body>
</html>
