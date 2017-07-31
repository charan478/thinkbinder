<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="login.css">
</head>
<body>
	<form name="login" onsubmit="return validateForm();" method="post">
		<div class="header">
			<div class="image">
				<img src="http://www.vintech.com/assets/img/basic/logo-nav.png"
					alt="Vintech">
			</div>
		</div>

		<div class="panel-body">

			<h2>Who we are</h2>
			<div>Vintech Solutions is an US based Information Technology
				company based in Saint Louis, Missouri that provides a portfolio of
				Software and Technology services. It has developed intense
				information over many years and uses specific tools and practices to
				deliver any project for the customer.</div>
		</div>

		<div class="container">

			<h1>Think Binder</h1>

			<div class="table1">
				<table>
					<tr>
						<td>User ID</td>
						<td><input class="username" type="text" name="username"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input class="password" type="password" name="password"></td>
					</tr>
					<tr>
						<td><input type="button" class="submit" value="Login"
							name="submit" onclick="validate()"></td>
					</tr>

				</table>
			</div>
	</form>
	</div>

	<script>
		var count = 2;//Login tries

		function validate() {
			var un = document.login.username.value;
			var pw = document.login.password.value;
			var valid = false;
			var usernameArray = $
			{
				username
			}
			;
			var passwordArray = $
			{
				password
			}
			;
			for (var i = 0; i < usernameArray.length; i++) {
				if ((un == usernameArray[i]) && (pw == passwordArray[i])) {
					valid = true;
					break;
				}
			}
			if (valid) {
				alert("Login Successful");
				window.location = "login.jsp";
				return false;
			}
			var again = "tries";
			if (count == 1) {
				again = "try"
			}
			if (count >= 1) {
				alert("Incorrect Username or Password ");
				count++;
			} else {
				alert("Your account blocked - Incorrect Username or Password ");
				document.login.username.value = "You are now Blocked";
				document.login.password.value = "Blocked";
				document.login.username.disabled = true;
				document.login.password.disabled = true;
				return false;
			}
		}
	</script>
</body>
</html>