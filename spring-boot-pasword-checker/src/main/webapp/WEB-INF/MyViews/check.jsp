<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            text-align: center;
        }

        h1 {
            color: #333;
            font-size: 24px;
            margin-bottom: 20px;
        }

        img {
            width: 80px;
            height: 80px;
            border-radius: 50%;
            margin-bottom: 10px;
            transition: transform 0.3s ease-in-out;
        }

        img:hover {
            transform: rotate(360deg);
        }

        input {
            width: calc(100% - 30px);
            padding: 12px;
            margin-bottom: 15px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 5px;
            padding-left: 30px; /* Added padding for the icons */
        }

        .input-group {
            position: relative;
            margin-bottom: 15px;
        }

        .input-group i {
            position: absolute;
            top: 50%;
            transform: translateY(-50%);
            left: 18px; /* Adjusted the left position */
            color: #555;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        p {
            margin: 0;
        }
    </style>
</head>

<body>

    <div class="container">
        <img src="https://placekitten.com/80/80" alt="Logo">
        <h1>PASSWORD CHECKER</h1>
        <form action="/res">
            <div class="input-group">
                <i class="fas fa-user"></i>
                User Name: <input type="text" name="uname">
            </div>
            <div class="input-group">
                <i class="fas fa-lock"></i>
                Password: <input type="password" name="psw">
            </div>
            <input type="submit" value="Login">
        </form>
    </div>

</body>

</html>
