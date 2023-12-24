<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }
        
        .navbar {
    background-color: black; /* Background color of the navbar */
    overflow: hidden; /* Hide any overflowing content */
    
}

.container h1{
color:black;
}

/* Style the navigation bar links */
.navbar a {
    float: left; /* Float the links to create a horizontal layout */
    display: block; /* Display the links as blocks for styling */
    color: white; /* Text color of the links */
    text-align: center; /* Center-align the text */
    padding: 14px 16px; /* Add some padding for spacing */
    text-decoration: none; /* Remove underlines from links */
      margin-right: 80px;
}

/* Change link color on hover */
.navbar a:hover {
    background-color: #ddd; /* Background color on hover */
    color: black; /* Text color on hover */
}
        

        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
       
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            color:#ffff;
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"],
        input[type="password"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 4px;
            padding: 10px 20px;
            cursor: pointer;
            font-weight: bold;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        
         input[type="button"]:hover {
            background-color: #0056b3;
        }
           button[type="reset"] {
            background-color: #e74c3c;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .label-custom-color { color: black; }
    </style>
</head>
<body>

<!-- <div class="navbar">
    <a href="Home.html">Home</a>
    <a href="NewAc.html">New Account</a>
    <a href="Balance.html">Balance</a>
    <a href="Deposit.html">Deposit</a>
    <a href="Withdraw.html">Withdraw</a>
    <a href="Transfer.html">Transfer</a>
    <a href="Close.html">Close A/C</a>
    <a href="AboutUs.html">About Us</a>
</div> -->
    <div class="container">
        <h1>Account Registration</h1>
        <form action="New_Account" method="post">
            <label for="accountNumber"  class="label-custom-color">Adhar Number:</label>
            <input type="text" id="accountNumber" name="accountNumber" required>

            <label for="name"  class="label-custom-color">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="password"  class="label-custom-color">Password:</label>
            <input type="password" id="password" name="psw" required>

            <label for="address"  class="label-custom-color">Address:</label>
            <input type="text" id="address" name="address" required>

            <label for="mobileNumber"  class="label-custom-color">Mobile Number:</label>
            <input type="tel" id="mobileNumber" name="mobileNumber" required>

            <input type="submit" value="Submit">
            
          <button type="reset">Clear</button>  
        </form>
    </div>
</body>
</html>
