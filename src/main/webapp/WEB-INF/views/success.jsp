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
	<p>Dear ${user.name } ${user.lastName }!</p>
	<p>You were successfully signed up with email - ${user.email }.</p>
	<p>And Day of Birth ${user.dob }</p>
</body>
</html>