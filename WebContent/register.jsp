<html>
<head>
<title>Form Validation</title>
<script type="text/javascript">
	function validate() {

		if (document.user.username.value == "") {
			alert("Please provide your name!");
			document.user.username.focus();
			return false;
		}
		if (document.user.pwd.value == "") {
			alert("Please provide your password!");
			document.user.pwd.focus();
			return false;
		}
		if (document.user.email.value == "") {
			alert("Please provide your Email!");
			document.user.email.focus();
			return false;
		}
		if (document.user.phno.value == "") {
			alert("Please provide a phno");
			document.myForm.phno.focus();
			return false;
		}

		return (true);
	}
</script>
<title>RgistrationForm</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="user" action="login" method="post"
		onsubmit="return(validate());">
		<input type="hidden" name="action" value="register">

		<table>
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="username" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="pwd" /></td>
			</tr>

			<tr>
				<td>E-mail</td>
				<td>:</td>
				<td><input type="text" name="email" /></td>
			</tr>



			<tr>
				<td>Phno</td>
				<td>:</td>
				<td><input type="text" name="phno" /></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit"
					name="submit" value="Submit">&nbsp;&nbsp;&nbsp; <input
					type="reset" name="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>