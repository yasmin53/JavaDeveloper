<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="userUrl" value="/user/save" />
	<form:form action="${userUrl}" modelAttribute="user">
		<table>
		<c:if test="${!empty user.username }">
		<tr>
				<td><form:label path="id">Id</form:label></td>
				<td><form:input path="id" readOnly="true" disabled="true" />
				<form:hidden path="id" />
				</td>
			</tr>
		</c:if>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="phone">Phone</form:label></td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td></td>
				<td>
				<c:if test="${empty user.username}"><input type="submit" value="Register"></c:if>
				<c:if test="${empty user.username}"><input type="submit" value="Update"></c:if></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br />
	<div>
	<h2> User Details</h2>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Email</th>
				<th>User Name</th>
				<th>Password</th>
				<th>Phone</th>
				<th>Enabled</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="user" items="${list}">
				<tr>
					<td>${user.id }</td>
					<td>${user.email }</td>
					<td>${user.username }</td>
					<td>${user.password }</td>
					<td>${user.phone }</td>
					<td>${user.enabled }</td>
					<td><a href="<c:url value='/remove/${user.id }' />">Remove</a>|
					<a href="<c:url value='/update/${user.id }' />">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>