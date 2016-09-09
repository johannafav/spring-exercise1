<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Skills</title>
<link rel="stylesheet" href="<c:url value='/css/bootstrap.min.css'/>">
</head>
<body>
<div class="container">
	<h4>Skills</h4>
	<button id="addSkillBtn" class="btn btn-default">Add</button>
	<div id="addSkill" class="col-lg-6">
		<div class="form-group">
			<input type="text" id="skillName" class="form-control" placeholder="Skill name">
			<input type="number" value="1" name="skillLevel" min="1" max="10" class="form-control">
		</div>
		<button id="saveBtn" class="btn btn-default">Save</button>
	</div>
		
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
</div>	
<script src="/js/jquery-3.1.0.min.js"></script>
<script src="/js/index.js"></script>
</body>
</html>