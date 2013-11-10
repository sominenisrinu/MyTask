<html>
<head>
<title>Form Validation</title>
<script type="text/javascript">
<!--
	// Form validation code will come here.
	function validate() {

		if (document.user.email.value == "" && document.user.name.value == "") {
			alert("Please provide a email or name !.");
			document.user.name.focus();
			return false;
		}
		return true;
	}
//-->
</script>
</head>
<body>
	<form name="user" action="login" method="post"
		onsubmit="return(validate());">
		<input type="hidden" name="action" value="forgotpassword">
		<table>
			<tr>
				<td>Enteremail</td>
				<td>:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td colspan="3" align="center">OR</td>
			<tr>
				<td>EnteruserName</td>
				<td>:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit"
					name="submit" value="submit">&nbsp;&nbsp;&nbsp; <input
					type="reset" name="reset" value="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>