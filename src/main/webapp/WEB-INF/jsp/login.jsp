<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
</head>
<body>
	<div class="container">
		<form:form commandName="user" action="/" attributeModel="user" method="POST" class="form-signin">
			<h2 class="form-signin-heading">Please sign in</h2>
			<form:input path="email" placeholder="Email" class="form-control"/>
				<form:password path="password" placeholder="Password" class="form-control"/>
				<form:errors path="email"></form:errors>
				<form:button class="btn btn-lg btn-primary btn-block">Sign in</form:button>
		</form:form>
	</div>
</body>
</html>
