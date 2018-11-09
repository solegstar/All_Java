<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>User with ID: ${user.id }</p>
	<p>${user.name }.</p>
	<p>${user.lastName }.</p>
	<p>${user.email }.</p>
	<p>${user.dob }</p>
	<p>Info successfully updated!</p>
</body>
</html>