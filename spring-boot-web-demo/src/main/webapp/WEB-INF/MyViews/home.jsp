<!DOCTYPE html>
<html>
<head>
    <title>Background Image Example</title>
    
     <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .content h1{
        
        color: black;
        }
        
    .footer-section.links a {
        color: black;
        text-decoration: none; /* Remove underline from links, if desired */
    }

    /* Additional styles for better visibility or hover effects */
    .footer-section.links a:hover {
        color: darkgray; /* Change color on hover */
    }

        .scrolling-text-container {
            overflow: hidden;
            text-align: center;
            padding: 20px 0;
            background-color: #333;
            color: white;
        }

        .scrolling-text {
            animation: scrollText 15s linear infinite;
        }

        @keyframes scrollText {
            0% {
                transform: translateX(100%);
            }
            100% {
                transform: translateX(-100%);
            }
        }

        .navbar {
            background-color: #333;
            overflow: hidden;
        }

        .navbar a {
            float: right;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            margin-right: 10px;
        }

        .navbar a:hover {
            background-color: #ddd;
            color: red;
        }

        .content {
            text-align: center;
            padding: 100px;
            color: white;
        }

        .footer {
            background-color: #333;
            color: black;
            padding: 20px 0;
        }

        .footer-content {
            max-width: 1200px;
            margin: 0 auto;
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }

        .footer-section {
            flex: 1;
            margin-right: 20px;
            padding: 10px;
        }

        .socials {
            list-style: none;
            padding: 0;
            display: flex;
            gap: 10px;
        }

        .socials a {
            color: white;
            font-size: 24px;
        }

        .links ul {
            list-style: none;
            padding: 0;
        }

        .links ul li {
            margin-bottom: 10px;
        }

        .links a {
            color: white;
            text-decoration: none;
            transition: color 0.3s;
        }

        .links a:hover {
            color: #ffd700;
        }

        .contact-form form {
            display: flex;
            flex-direction: column;
        }

        .contact-input {
            margin-bottom: 10px;
            padding: 10px;
            border: 1px solid #fff;
            border-radius: 5px;
            background-color: #444;
            color: #fff;
        }

        .btn-primary {
            background-color: #ffd700;
            color: #333;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .btn-primary:hover {
            background-color: #FFC107;
        }

        .footer-bottom {
            text-align: center;
            padding-top: 20px;
            font-size: 14px;
        }
    </style>
   </head>
<body>

 <div class="scrolling-text-container">
        <div class="scrolling-text">
            <h1>Welcome to our Spring boot project</h1>
        </div>
    </div>

<div class="navbar">
    <a href="/">Home</a>
    <a href="/about">About</a>
    <a href="/login">Login</a>
    <a href="/regis">regis</a>
    <a href="/cntact">Contact</a>	
</div>
    <div class="content">
        <h1>This is our Spring Boot Project</h1>
  
    </div>
    
    <footer>
    <div class="footer-content">
        <div class="footer-section about">
            <h2>About Us</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod justo vel augue ultrices.</p>
            <ul class="socials">
                <li><a href="#"><i class="fab fa-facebook"></i></a></li>
                <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                <li><a href="#"><i class="fab fa-linkedin"></i></a></li>
            </ul>
        </div>
        <div class="footer-section links">
            <h2>Quick Links</h2>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
                <li><a href="#">Login</a></li>
                <li><a href="#">Register Us</a></li>
            </ul>
        </div>
        <div class="footer-section contact-form">
            <h2>Contact Us</h2>
            <form action="#">
                <input type="email" name="email" class="text-input contact-input" placeholder="Your email address">
                <textarea rows="4" name="message" class="text-input contact-input" placeholder="Your message"></textarea>
                <button type="submit" class="btn btn-primary">Send</button>
            </form>
        </div>
    </div>
    <div class="footer-bottom">
        &copy; 2023 Banking Website | Designed by Your Company Name
    </div>
</footer>
    
</body>
</html>
