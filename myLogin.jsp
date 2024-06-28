<head>
<style>
h3, h1 {
	text-align: center;
	color: red;
}
</style>
</head>

<body>
	<h1>
		<font face="bold" size="10" color="blue">Welcome to Surya's
			World</font>
	</h1>
	<br>
	<h1>Login here</h1>

	<form name="f1" action="/MyProject/myLogin" method="post"
		onsubmit="return validate()">
		<h3>
			username: <input type="text" name="username" />
		</h3>
		<h3>
			password: <input type="password" name="password" />
		</h3>
		<h3>
			<input type="submit" value="Login" />
		</h3>
	</form>
	<h3>
		New User <a href="myRegister.jsp">Register</a>
	</h3>
	<script>
		function validate() {
			var x1 = document.f1.username.value;
			if (x1 == null || x1 == "") {
				alert("Username should not be empty");
				return false;
			}
			var pword = document.f1.password.value
			if (pword == null || pword == "") {
				alert("Password should not be empty");
				return false;
			}
			return true;
		}
	</script>
</body>
