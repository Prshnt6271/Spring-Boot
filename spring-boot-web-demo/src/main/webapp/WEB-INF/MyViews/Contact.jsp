<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .contact-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }

        .contact-container h2 {
            margin-bottom: 20px;
        }

        .contact-form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .form-input {
            width: 100%;
            margin: 10px 0;
            padding: 10px;
            box-sizing: border-box;
        }

        .form-submit {
            background-color: #4caf50;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        .form-submit:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="contact-container">
    <h2>Contact Us</h2>
    <form class="contact-form">
        <input class="form-input" type="text" placeholder="Your Name" required>
        <input class="form-input" type="email" placeholder="Your Email" required>
        <textarea class="form-input" placeholder="Your Message" rows="4" required></textarea>
        <button class="form-submit" type="submit">Submit</button>
    </form>
</div>

</body>
</html>
