<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
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
	<form action="updateTour" method="POST">
		<input id="tourId" type="hidden" name="tour_id" value="${tour.id }">
		<p><label for="tourName">Name of Tour:</label>
		<input id="tourName" type="text" name="nametour" value="${tour.nameTour }" required/></p>
		<p><label for="tourPrice">Price of Tour:</label>
		<input id="tourPrice" type="number" name="pricetour" value="${tour.priceTour }" required/></p>
		<p><label for="dateTourBegin">Date of Tour Begin:</label>
		<input id="dateTourBegin" type="date" name="datetourbegin" value="${tour.dateTourBegin }" required/></p>
		<p><label for="dateTourEnd">Date of Tour End:</label>
		<input id="dateTourEnd" type="date" name="datetourend" value="${tour.dateTourEnd }" required/></p>
		<p><label for="flyTime">FlyTime:</label>
		<input id="flyTime" type="time" name="flytime" value="${tour.flyTime }" required/></p>
		 <input type="submit" value="Обновить."/>
	</form>
</body>
</html>