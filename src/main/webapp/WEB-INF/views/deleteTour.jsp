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
	<form action="deleteTour" method="POST">
		<p class="redtext">DELETE Tour ID</p>
		<input type="number" name="tour_id" />
		 <input type="submit" />
	</form>
</body>
</html>