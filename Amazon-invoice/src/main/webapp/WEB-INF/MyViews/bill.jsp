<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bill Details</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
         
        }

        h1 {
            color: #333;
            font-size: 24px;
            margin-bottom: 20px;
        }

        p {
            margin: 10px 0;
        }
    </style>
</head>
<body>

    <h1>Bill Details</h1>

    <p>Customer ID: <%= request.getAttribute("customerId") %></p>
    <p>Customer Name: <%= request.getAttribute("customerName") %></p>
    <p>Mobile Number: <%= request.getAttribute("mobileNumber") %></p>
    <p>Product Name: <%= request.getAttribute("productName") %></p>
    <p>Price: <%= request.getAttribute("price") %></p>
    <p>Quantity: <%= request.getAttribute("quantity") %></p>

    <p>Total: <%= request.getAttribute("total") %></p>
    <p>Discount: <%= request.getAttribute("discount") %></p>
    <p>GST: <%= request.getAttribute("gst") %></p>

</body>
</html>
