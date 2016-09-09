<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Skills</title>
</head>
<body>
<div class="container">
	Skills
	<button onclick="addSkill">+</button>
		
		<form:form commandName="skill" modelAttribute="skill" action="/skills" method="POST">
			<form:input path="name" placeholder="Skill"/>
			<form:select path="skillLevel">
				<form:option value="1">1</form:option>
				<form:option value="2">2</form:option>
				<form:option value="3">3</form:option>
				<form:option value="4">4</form:option>
				<form:option value="5">5</form:option>
				<form:option value="6">6</form:option>
				<form:option value="7">7</form:option>
				<form:option value="8">8</form:option>
				<form:option value="9">9</form:option>
				<form:option value="10">10</form:option>
			</form:select>
			<form:button>Save</form:button>
		</form:form>
		
		 
		<%-- <form:form action="/user" method="POST">
			<input type="text" name="skill"/>
			<select name="skillLevel">
				<option value="1" selected>1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option>
			</select>
			
			<input type="submit" value="Submit"/>
		</form:form> --%>
</div>	
</body>
</html>