<%@page import="java.util.List"%>
<%@ page import="com.my.model.College"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College Details</title>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<td><b>College Code</b></td>
				<td><b>College Name</b></td>
				<td><b>College Address</b></td>
				<td><b>College City</b></td>
				<td><b>College State</b></td>
				<td><b>Branch PoatCode</b></td>
			</tr>
			<%
				List<College> colleges = (List<College>) request
						.getAttribute("colleges");
				System.out.println("in JSP no of branches :" + colleges.size());
				for (College college : colleges) {
			%>
			<tr>
				<td><%=college.getCode()%></td>
				<td><%=college.getName()%></td>
				<td><%=college.getAddress()%></td>
				<td><%=college.getCity()%></td>
				<td><%=college.getState()%></td>
				<td><%=college.getPostCode()%></td>
			</tr>
			<%
				}
			%>

		</table>
	</form>

</body>
</html>