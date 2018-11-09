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
	<form action="updateUser" method="POST">
		<p>User ID now is ${user.id }.</p>
		<p>First Name now is ${user.name }.</p>
		<input type="text" name="name" />
		<p>Last Name now is ${user.lastName }.</p>
		<input type="text" name="last_name" />
		<p>Password</p>
		<input type="password" />
		<p>Email now is ${user.email }.</p>
		<input type="email" name="email" />
		<p>Date of Birth now is ${user.dob }</p>
		<input type="date" name="dob" /> <input type="submit" />
	</form>
</body>
</html>