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
		<input id="userId" type="hidden" name="user_id" value="${user.id }">
		<p>First Name: <input id="userName" type="text" name="name" value="${user.name }" required/> <span style="color:red"> ${nameErrorMessage} </span></p>
		<p>Last Name: <input id="userLastName" type="text" name="last_name" value="${user.lastName }" required/> <span style="color:red"> ${lastNameErrorMessage} </span></p>
		<p>Password: <input id="userPass" type="password" name="password" value="1234" required/> <span style="color:red"> ${lastNameErrorMessage} </span></p>
		<p>Confirm Password: <input id="userConfPass" type="password" name="confPass" value="1234" required/> <span style="color:red"> ${lastNameErrorMessage} </span></p>
		<p>Email: <input id="userEmail" type="text" name="email" value="${user.email }" required/> <span style="color:red"> ${emailErrorMessage} </span></p>
		<p>Day of Birth: <input id="userDob" type="date" name="dob" value="${user.dob }" required/> <span style="color:red"> ${dobErrorMessage} </span></p>
		 <input type="submit" />
	</form>
</body>
</html>