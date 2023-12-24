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
        }

        h1 {
            color: #333;
            font-size: 24px;
            margin-bottom: 20px;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
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
            left: 19px;
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
    <form:form action="/calculate" method="post" modelAttribute="electricBillForm">
        <h1>Electric Bill Form</h1>

        <div class="input-group">
            <i class="fas fa-id-card"></i>
            <label for="consumerId">Consumer ID:</label>
            <form:input type="text" id="consumerId" path="consumerId" required="true"/>
        </div>

        <div class="input-group">
            <i class="fas fa-user"></i>
            <label for="consumerName">Consumer Name:</label>
            <form:input type="text" id="consumerName" path="consumerName" required="true"/>
        </div>

        <div class="input-group">
            <i class="fas fa-chart-line"></i>
            <label for="currentReading">Current Reading:</label>
            <form:input type="number" id="currentReading" path="currentReading" required="true"/>
        </div>

        <div class="input-group">
            <i class="fas fa-chart-bar"></i>
            <label for="previousReading">Previous Reading:</label>
            <form:input type="number" id="previousReading" path="previousReading" required="true"/>
        </div>

        <button type="submit">Print Bill</button>
    </form:form>

</body>
</html>