<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<form:form action="${productUrl}" modelAttribute="product">
		<table class="table">
			<c:if test="${!empty product.name}">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" />
						<form:hidden path="id" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="name">Product Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="price">Price</form:label></td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td><form:label path="quantity">Quantity</form:label></td>
				<td><form:input path="quantity" /></td>
			</tr>
			<tr>
				<td><form:label path="specification">Specification</form:label></td>
				<td><form:input path="specification" /></td>
			</tr>
			<tr>
				<td><form:label path="rating">Rating</form:label></td>
				<td><form:input path="rating" /></td>
			</tr>
			<tr>
				<td></td>
				<td><c:if test="${empty product.name}">
						<input type="Submit" value="Register" />
					</c:if> <c:if test="${!empty product.name}">
						<input type="Submit" value="Update" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<hr>
	<div>
		<table class="table table-striped">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Price</th>
				<th scope="col">Quantity</th>
				<th scope="col">Specifications</th>
				<th scope="col">Ratings</th>
				<th scope="col">Actions</th>
			</tr>
			<tr>
				<td>${product.id }</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.quantity }</td>
				<td>${company.specifications }</td>
				<td>${company.ratings }</td>
				<td><a href="<c:url value='/removeproduct/${product.id }'/> ">Delete</a>
					| <a href="<c:url value='/updateproduct/${prodct.id }'/> ">Update</a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>