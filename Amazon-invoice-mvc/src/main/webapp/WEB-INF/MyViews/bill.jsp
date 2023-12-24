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

    <p>Customer ID: ${md.customerId}</p>
    <p>Customer Name: ${md.customerName}</p>
    <p>Mobile Number: ${md.mobileNumber}</p>
    <p>Product Name: ${md.productName}</p>
    <p>Price: ${md.price}</p>
    <p>Quantity: ${md.quantity}</p>

    <p>Total: ${total}</p>
    <p>Discount: ${discount}</p>
    <p>GST: ${gst}</p>

</body>
</html>
