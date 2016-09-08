<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Resume submitted
	<div style="background-color: ${personalBgColor}">
		<h1 style="font-family: ${personalHeaderFontName}; font-size: ${personalHeaderFontSize}px">${firstname} ${lastname}</h1>
		<p style="font-family: ${personalInfoFontName}; font-size: ${personalInfoFontSize}px">
			${birthdate} <br>
			${nationality} <br>
			${address} <br>
			${email} <br>
		</p>
	</div>
</body>
</html>