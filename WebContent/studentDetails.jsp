<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@ page import="com.my.model.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<td><b>Name</b></td>
				<td><b>SurName</b></td>
				<td><b>RollNo</b></td>
				<td><b>College_Id</b></td>
				<td><b>Branch_Id</b></td>
				<td><b>Address</b></td>
				<td><b>City</b></td>
				<td><b>State</b></td>
				<td><b>PostCode</b></td>
			</tr>
			<%
				List<Student> students = (List<Student>) request
						.getAttribute("students");
				System.out.println("in JSP no of users :" + students.size());
				for (Student student : students) {
			%>
			<tr>
				<td><%=student.getName()%></td>
				<td><%=student.getSurName()%></td>
				<td><%=student.getRollno()%></td>
				<td><%=student.getCollege_Id()%></td>
				<td><%=student.getBranch_Id()%></td>
				<td><%=student.getAddress()%></td>
				<td><%=student.getCity()%></td>
				<td><%=student.getState()%></td>
				<td><%=student.getPostCode()%></td>
			</tr>
			<%
				}
			%>

		</table>
	</form>

</body>
</html>