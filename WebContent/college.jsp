<html>
<body>
	<h3>CollegeDetails</h3>
	<form name="college" action="maintenance" method="post">
<input type="hidden" name="action" value="college">
		<table>
			<tr>
				<td>Code</td>
				<td>:</td>
				<td><input type="text" name="code"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td>:</td>
				<td><textarea rows="5" cols="30" name="address"></textarea></td>
			</tr>
			<tr>
				<td>City</td>
				<td>:</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>State</td>
				<td>:</td>
				<td><input type="text" name="state"></td>
			</tr>
			<tr>
				<td>PostCode</td>
				<td>:</td>
				<td><input type="text" name="postcode"></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="hidden"
					name="college" value=""> <input type="submit" name="submit"
					value="submit"> <input type="reset" name="reset"
					value="reset"></td>
		</table>
	</form>
</body>
</html>