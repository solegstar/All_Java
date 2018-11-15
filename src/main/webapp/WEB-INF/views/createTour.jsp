<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="createTour" method="POST">
		<p>Name of Tour:<input type="text" name="nametour" required/></p>
		<p>Price of Tour:<input type="number" name="pricetour" required/></p>
		<p>Date of Tour Begin:<input type="date" name="datetourbegin" required/></p>
		<p>Date of Tour End:<input type="date" name="datetourend" required/></p>
		<p>FlyTime:<input type="time" name="flytime" required/></p>
		<input type="submit"/>
	</form>
</body>
</html>