<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.redtext {
        color: red;
}
</style>
</head>
<body>
	<form action="deleteUser" method="POST">
		<p class="redtext">DELETE User ID</p>
		<input type="number" name="user_id" />
		 <input type="submit" />
	</form>
</body>
</html>