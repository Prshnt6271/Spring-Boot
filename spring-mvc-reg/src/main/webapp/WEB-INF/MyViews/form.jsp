<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC form tags</title>
  <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        table {
            width: 100%;
            margin-top: 10px;
        }

        td {
            padding: 10px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        form:errors {
            color: #ff0000;
        }
    </style>
</head>

<body>
	

	<form:form method="POST" modelAttribute="user" action="register">
	
	<h2>Fill below form to register</h2>
		<table>
			<tr>
				<td>Enter your name:</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssStyle="color: #ff0000;"/></td>
			</tr>
			<tr>
				<td>Enter your mail:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td>Enter your gender</td>
				<td><form:radiobuttons path="gender" items="${genders}" /></td>
				<td><form:errors path="gender" cssStyle="color: #ff0000;"/></td> 
			</tr>
			<tr>
				<td>Enter a password:</td>
				<td><form:password path="password"  showPassword="true"/></td>
				<td><form:errors path="password" cssStyle="color: #ff0000;"/></td>
			<tr>
				<td>Confirm your password:</td>
				<td><form:password path="passwordConfirm" showPassword="true"/></td>
				<td><form:errors path="passwordConfirm" cssStyle="color: #ff0000;"/></td>
			</tr>
			
			<tr>
				<td>Choose your Batches:</td>
				<td><form:checkboxes path="batches" items="${batches}" /></td>
				<td><form:errors path="batches" cssStyle="color: #ff0000;"/></td> 
			</tr>
			
			<tr>
				<td>Please select your courses:</td>
				<td><form:select path="courses">
					  <form:option value="" label="Please Select" />
					  <form:options items="${courses}" />
				       </form:select>
                </td>
				<td><form:errors path="courses" cssStyle="color: #ff0000;" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Register"></td>
			</tr>
			<tr>
		</table>
	</form:form>

</body>
</html>