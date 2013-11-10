<%@page import="java.util.List"%>
<%@ page import="com.my.model.Branch"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Branch Details</title>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<td><b>Branch Code</b></td>
				<td><b>Branch Name</b></td>
			</tr>
			<%
				List<Branch> branches = (List<Branch>) request.getAttribute("branches");
				System.out.println("in JSP no of branches :" + branches.size());
				for (Branch branch : branches) {
			%>
			<tr>
				<td><%=branch.getCode()%></td>
				<td><%=branch.getBranchName()%></td>
			</tr>
			<%
				}
			%>

		</table>
	</form>
</body>
</html>