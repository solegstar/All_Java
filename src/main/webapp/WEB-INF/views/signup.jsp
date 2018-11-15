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
		<p>First Name: <input id="userName" type="text" name="name" required/></p>
		<p>Last Name: <input id="userLastName" type="text" name="last_name" required/></p>
		<p>Password: <input id="userPass" type="password" name="password" required/></p>
		<p>Confirm Password: <input id="userConfPass" type="password" name="confPass" required/></p>
		<p>Email: <input id="userEmail" type="text" name="email" required/></p>
		<p>Day of Birth: <input id="userDob" type="date" name="dob" required/></p>
 		<input type="submit" />
	</form>
</body>
</html>