<html>
<head>
<script type="text/javascript">
	function validate() {
		//alert("in validation method");
		if (document.user.name.value == "") {
			alert("Please provide your name!");
			document.user.name.focus();
			return false;
		}
		if (document.user.pwd.value == "") {
			alert("Please provide your Password!");
			document.user.pwd.focus();
			return false;
		}
		return true;
	}
	
</script>
<p>Click the button to display what day it is today.</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction()
{
var x;
var d=new Date().getDay();
switch (d)
  {
  case 0:
    x="Today it's Sunday";
    break;
  case 1:
    x="Today it's Monday";
    break;
  case 2:
    x="Today it's Tuesday";
    break;
  case 3:
    x="Today it's Wednesday";
    break;
  case 4:
    x="Today it's Thursday";
    break;
  case 5:
    x="Today it's Friday";
    break;
  case 6:
    x="Today it's Saturday";
    break;
  }
document.getElementById("demo").innerHTML=x;
}
</script>

</head>
<body>

	<form name="user" action="login" method="post"
		onsubmit="return(validate());">
		<table bgcolor="E0E0E0" cellspacing="2" cellpadding="2">
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="hidden"
					name="action" value="login"> <input type="submit"
					name="submit" value="login">&nbsp;&nbsp;&nbsp; <input
					type="reset" name="reset" value="Reset"></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><a href="forgotpassword.jsp">ForgotPassword</a>&nbsp;&nbsp;&nbsp;
					<a href="register.jsp">Register</a></td>
			</tr>
		</table>
	</form>
</body>
</html>