<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
</head>
<body>
<div class="container" style="margin-top:5px">
<div class="panel panel-default">
<div class="panel-heading">
    <h3 class="panel-title">User Registration</h3>
  </div>
  <div class="panel-body">
	<form:form commandName="user" modelAttribute="user" action="/registration" method="POST" class="form-horizontal">
		<div class="form-group" cssErrorClass="has-error">
			<form:label path="firstname" cssClass="col-md-2 control-label" cssErrorClass="col-md-2 control-label">
				<spring:message code="label.firstname"></spring:message>
			</form:label>
			<div class="col-md-10">
				<form:input path="firstname" placeholder="First Name" class="form-control" cssErrorClass="form-control"/> <br/>
				<form:errors path="firstname" cssClass="text-danger"/>
			</div>
		</div>
		<div class="form-group">
			<form:label path="middlename" cssClass="col-md-2 control-label" cssErrorClass="col-md-2 control-label has-error">
				<spring:message code="label.middlename"></spring:message>
			</form:label>
			<div class="col-md-10">
				<form:input path="middlename" placeholder="Middle Name" class="form-control"/> <br/>
			</div>
		</div>
		<div class="form-group">
			<form:label path="lastname" cssClass="col-md-2 control-label" cssErrorClass="col-md-2 control-label has-error">
				<spring:message code="label.lastname"></spring:message>
			</form:label>
			<div class="col-md-10">
				<form:input path="lastname" placeholder="Last Name" class="form-control"/> <br/>
				<form:errors path="lastname" cssClass="text-danger"/>
			</div>
		</div>
		<div class="form-group">
			<form:label path="birthdate" cssClass="col-md-2 control-label" cssErrorClass="col-md-2 control-label has-error">
				<spring:message code="label.birthdate"></spring:message>
			</form:label>
			<div class="col-md-10">
				<form:input path="birthdate" placeholder="Birthdate (yyyy-MM-dd)" class="form-control"/> <br/>
			</div>
		</div>
		<div class="form-group">
			<form:label path="email" cssClass="col-md-2 control-label" cssErrorClass="col-md-2 control-label has-error">
				<spring:message code="label.email"></spring:message>
			</form:label>
			<div class="col-md-10">
				<form:input path="email" placeholder="Email" class="form-control"/> <br/>
				<form:errors path="email" cssClass="text-danger"/>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-2 control-label">Password</label>
			<div class="col-md-10">
				<form:password path="password" placeholder="Password" class="form-control"/> <br/>
				<form:errors path="password" cssClass="text-danger"/>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-2 control-label">Confirm password</label>
			<div class="col-md-10">
				<form:password path="confirmPassword" placeholder="Password" class="form-control"/> <br/>
				<form:errors path="confirmPassword" cssClass="text-danger"/>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-2 control-label">Role</label>
			<div class="col-md-10">
				<form:select path="role" class="form-control">
					<form:option value="Admin"></form:option>
					<form:option value="User"></form:option>
				</form:select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-2 col-md-2">
				<form:button class="btn btn-default">Submit</form:button>
			</div>
		</div>
	</form:form>
	</div>
	</div>
	</div>
</body>
</html>