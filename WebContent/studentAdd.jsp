<%@ page import="com.my.util.DBconnection"%>
<%@ page import="com.my.util.DataUtil"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.Iterator"%>
<html>
<head>
<title>Form Validation</title>
<script type="text/javascript">
function validate()
{
	 if( document.student.College_Id.value == "-1" )
	   {
	     alert( "Please provide your college!" );
	     return false;
	   }
	 if( document.student.Branch_Id.value == "-1" )
	   {
	     alert( "Please provide your branch!" );
	     return false;
	   }
	 
 
   if( document.student.name.value == "" )
   {
     alert( "Please provide your Name!" );
     document.student.name.focus() ;
     return false;
   }
   if( document.student.surname.value == "" )
   {
     alert( "Please provide your SurName!" );
     document.student.surname.focus() ;
     return false;
   }
   if( document.student.rollno.value == "")
   {
     alert( "Please provide your RollNumber" );
     document.myForm.rollno.focus() ;
     return false;
   }
   
   return true ;
}
</script>
</head>
<body>
<form action="" name="student" onsubmit="return(validate());">


	<table width="70%" align="center">
		<tr>
			<td width="20%">College Name</td>
			<td width="3%">:</td>
			<td><select name="College_Id">
					<option value="0">--Select College--</option>
					<%
						Map<String, String> college = DataUtil.getCollegeDetails();
						Iterator it = college.entrySet().iterator();
						while (it.hasNext()) {
							Map.Entry pairs = (Map.Entry) it.next();
							System.out.println(pairs.getKey() + "=" + pairs.getValue());
					%>
					<option value="<%=pairs.getKey()%>"><%=pairs.getValue()%></option>
					<%
						}
					%>
			</select></td>
		</tr>
		<tr>
			<td width="20%">Branch Name</td>
			<td width="3%">:</td>
			<td><select name="Branch_Id">
					<option value="0">--Select Branch--</option>
					<%
						Map<String, String> branch = DataUtil.getBaranchDetails();
						Iterator it1 = branch.entrySet().iterator();
						while (it1.hasNext()) {
							Map.Entry pairs = (Map.Entry) it1.next();
							System.out.println(pairs.getKey() + "=" + pairs.getValue());
					%>
					<option value="<%=pairs.getKey()%>"><%=pairs.getValue()%></option>
					<%
						}
					%>
			</select></td>
		</tr>
		<tr>
			<td>Name</td>
			<td>:</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>SurName</td>
			<td>:</td>
			<td><input type="text" name="surname"></td>
		<tr>
			<td>Address</td>
			<td>:</td>
			<td><textarea rows="4" cols="50" name="address"></textarea></td>
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
			<td>RollNo</td>
			<td>:</td>
			<td><input type="text" name="rollno"></td>
		</tr>
		<tr>
			<td colspan="3" align="center"><input type="submit"
				value="submit" value="submit"> <input type="reset"
				name="reset" value="reset"></td>
		</tr>
	</table>
	</form>

</body>
</html>