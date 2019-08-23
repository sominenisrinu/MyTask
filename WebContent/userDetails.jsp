<%@page import="java.util.List"%>
<%@ page import="com.my.model.User" %>
<html>
<form action="">
<table bgcolor="FFFFCC" border="1" cellspacing="0" cellpadding="0">
<tr>
<td><b>User Name</b></td>
<td><b>Email</b></td>
<td><b>Phone Number</b></td>
</tr>
<%
List<User> users=(List<User>)request.getAttribute("users");
System.out.println("in JSP no of users :"+users.size());
for(User user:users){%>
<tr>
<td><%=user.getUsername()%></td>
<td><%=user.getEmail()%></td>
<td><%=user.getPhno()%></td>
</tr>
<% } %>

</table>
</form>
</html>
<!-- sample test-->
