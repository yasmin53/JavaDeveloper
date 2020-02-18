<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="${categoryUrl}" modelAttribute="category">
<div class="row">
	<div class="col">
		<form:label path="id">ID</form:label>
	</div>
	<div class="col">
		<form:input type="number" path="id" class="form-control"
			placeholder="id" />
	</div>
</div>
<div class="row">
	<div class="col">
		<form:label path="name">Name</form:label>
	</div>
	<div class="col">
		<form:input path="name" class="form-control"
			 placeholder="Enter the name" />
	</div>
</div>
</div>
<hr>
<div>
	<button type="button" class="btn btn-primary btn-block">Submit</button>
</div>
<br>
<hr>
<div>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${category.id }</td>
				<td>${category.name }</td>
				<td><button type="button" class="btn btn-success">
						<i class="fas fa-edit"></i>
					</button>
					<button type="button" class="btn btn-danger">
						<i class="far fa-trash-alt"></i>
					</button></td>
			</tr>
		</tbody>
	</table>
</div>
</form:form>