<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Resume Builder <br/><br/>
	<form:form commandName="resume" modelAttribute="resume" action="resume" method="POST">
		<form:input path="firstname" placeholder="First Name"/> <br/>
		<form:input path="middlename" placeholder="Middle Name"/> <br/>
		<form:input path="lastname" placeholder="Last Name"/> <br/>
		<form:input path="birthdate" placeholder="Birthdate"/> <br/>
		<form:input path="nationality" placeholder="Nationality"/> <br/>
		<form:input path="address" placeholder="Address"/> <br/>
		<form:input path="email" placeholder="Email Address"/> <br/>
		<br/>
		<form:input path="personalInfoFontName" placeholder="Personal Info Font Name"/> <br/>
		<form:input path="personalInfoFontSize" placeholder="Personal Info Font Size"/> <br/>
		<form:input path="personalHeaderFontName" placeholder="Personal Header Font Name"/> <br/>
		<form:input path="personalHeaderFontSize" placeholder="Personal Header Font Size"/> <br/>
		<form:input path="personalBgColor" placeholder="Personal Info Background Color"/> <br/>
		<br/>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>