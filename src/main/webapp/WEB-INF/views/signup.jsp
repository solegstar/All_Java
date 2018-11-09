<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="signup" method="POST">

		<p>First Name</p>
		<input type="text" name="name" />

		<p>Last Name</p>
		<input type="text" name="last_name" />

		<p>Password</p>
		<input type="password" />
		<p>Email</p>
		<input type="email" name="email" />
		<p>Date of Birth</p>
		<input type="date" name="dob" /> <input type="submit" />


	</form>
</body>
</html>