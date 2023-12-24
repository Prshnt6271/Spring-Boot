<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            text-align: center;

            background-size: cover; /* Cover the entire viewport */
            background-repeat: no-repeat; /* Do not repeat the image */
            background-attachment: fixed; /* Fixed background (doesn't scroll with content) */
        }

        h1 {
            color: black;
            font-size: 24px;
            margin-bottom: 20px;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }

        label {
            text-align: left;
            display: block;
            margin-bottom: 8px;
            color: #555;
        }

        .input-group {
            position: relative;
            margin-bottom: 15px;
        }

        .input-group i {
            position: absolute;
            top: 50%;
            transform: translateY(-50%);
            left: 15px;
            color: #555;
        }

        input {
            width: calc(100% - 30px);
            padding: 12px;
            margin-bottom: 15px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 5px;
            padding-left: 30px;
        }

        button {
            background-color: #4caf50;
            color: #fff;
            padding: 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>

<body>

    <h1>AMAZON PRODUCT INVOICE</h1>
    <form:form action="/res" method="post" modelAttribute="md">
        <div class="input-group">
            <i class="fas fa-id-card"></i>
            <label for="customerId">Customer ID:</label>
            <form:input type="text" id="customerId" path="customerId" required="true"/>
        </div>

        <div class="input-group">
            <i class="fas fa-user"></i>
            <label for="customerName">Customer Name:</label>
            <form:input type="text" id="customerName" path="customerName" required="true"/>
        </div>

        <div class="input-group">
            <i class="fas fa-mobile-alt"></i>
            <label for="mobileNumber">Mobile Number:</label>
            <form:input type="number" id="mobileNumber" path="mobileNumber" required="true"/>
        </div>

        <div class="input-group">
            <i class="fas fa-shopping-cart"></i>
            <label for="productName">Product Name:</label>
            <form:input type="text" id="productName" path="productName" required="true"/>
        </div>
        <div class="input-group">
            <i class="fas fa-shopping-cart"></i>
            <label for="price"> Price:</label>
            <form:input type="number" id="price" path="price" required="true"/>
        </div>
        <div class="input-group">
            <i class="fas fa-box"></i>
            <label for="quantity">Quantity:</label>
            <form:input type="number" id="quantity" path="quantity" required="true"/>
        </div>

        <button type="submit">Print Invoice</button>
    </form:form>

</body>

</html>
