<!DOCTYPE html>
<html lang="en">

<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="resources/assets/css/styles.css">
<title>Home Page</title>
<style>
</style>

</head>
<body class="pt-5">
	<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top">
		<a class="navbar-brand" href="index.html"> <img class="avatar"
			src="resources/assets/images/logo.png" alt="Stock Logo">
		</a> <a href="home" class="h3 nav-link">E-Commerce</a>
		<button class="navbar-toggler" data-toggle="collapse"
			data-target="#collNav">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse justify-content-between"
			id="collNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a href="home"
					class="nav-link text-center">Home</a></li>
				<li class="nav-item"><a href="admin"
					class="nav-link text-center">Admin</a></li>
				<li class="nav-item"><a href="register-user"
					class="nav-link text-center">Register User</a></li>
				<li class="nav-item"><a href="register-supplier"
					class="nav-link text-center">Register Supplier</a></li>
				<li class="nav-item"><a href=""
					class="nav-link text-danger text-center">Logout</a></li>
			</ul>
		</div>
	</nav>
	
	<div id="body" class="container mt-5">