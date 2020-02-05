<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loginpage</title>
</head>
<body>
<a href="index.jsp">Home</a>
<a href="login.jsp">LOgin</a>
<a href="register.jsp">Register</a>
<%
Date date=new Date();
//out.println(date);
%>
<%=date %>
<br>
<%= getSum(4,8) %>
<%!
public static int getSum(int a, int b){
	return a+b;
}
%>
</body>
</html>










