<head>
<style>
h3, h1 {
	text-align: center;
	color: red;
}
</style>
</head>
<h1>
	<font face="bold" size="30" color="blue">Welcome to Akshara's
		World</font>
</h1>
<br>
<h1>Login here</h1>
<body>
	<form name="f1" action="myRegister" method="post"
		onSubmit="return validate()">
		<h3>
			First Name : <input type="text" name="fname" />
		</h3>
		<h3>
			Second Name : <input type="text" name="sname" />
		</h3>
		<h3>
			Username : <input type="text" name="username" />
		</h3>
		<h3>
			Password : <input type="password" name="password" />
		</h3>
		<h3>
			Retype Password : <input type="password" name="retypepassword" />
		</h3>
		<h3>
			Mobile Number : <input type="text" name="pnumber" />
		</h3>
		<h1>
			<input type="submit" value="Register" />
		</h1>
		<br>
	</form>
	<script>
		function validate() {
			var fname = document.f1.fname.value;
			var sname = document.f1.sname.value;
			var username = document.f1.username.value;
			var password = document.f1.password.value;
			var retypepassword = document.f1.retypepassword.value;
			var pnumber = document.f1.pnumber.value;
			if (fname == null || fname == "") {
				alert("First Name Cannot be empty");
				return false;
			}
			if (sname == "" || sname == null) {
				alert("Second Name Cannot be empty");
				return false;
			}
			if (username == "" || username == null) {
				alert("Username Cannot be empty");
				return false;
			}
			if (password == "" || password == null) {
				alert("Password Cannot be empty");
				return false;
			}
			if (password != retypepassword) {
				alert("Password did not match");
				return false;
			}
			if (pnumber == "" || pnumber == null) {
				alert("Mobile Number cannot be empty");
				return false;
			}
		}
	</script>
</body>
