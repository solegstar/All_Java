<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	label {
		width: 150px;
		display: inline-block;
		cursor: pointer;
	}
</style>
<body>
	<form action="createTour" method="POST">
		<p><label for="tourName">Name of Tour:</label>
		<input id="tourName" type="text" name="nametour" placeholder="Название тура?" required/></p>
		<p><label for="tourPrice">Price of Tour:</label>
		<input id="tourPrice" type="number" name="pricetour" placeholder="Стоимость тура?" required/></p>
		<p><label for="dateTourBegin">Date of Tour Begin:</label>
		<input id="dateTourBegin" type="date" name="datetourbegin" placeholder="Дата начала тура?" required/></p>
		<p><label for="dateTourEnd">Date of Tour End:</label>
		<input id="dateTourEnd" type="date" name="datetourend" placeholder="Дата окончания тура?" required/></p>
		<p><label for="flyTime">FlyTime:</label>
		<input id="flyTime" type="time" name="flytime" placeholder="Время вылета?" required/></p>
 		<input type="submit" value="Регистрация"/> <input type="reset" value="Очистить"/>
	</form>
</body>
</html>