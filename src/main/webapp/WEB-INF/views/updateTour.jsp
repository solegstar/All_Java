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
	<form action="updateTour" method="POST">
		<input id="tourId" type="hidden" name="tour_id" value="${tour.id }">
		<p>Name of Tour:<input type="text" name="nametour" value="${tour.nameTour }" required/></p>
		<p>Price of Tour:<input type="number" name="pricetour" value="${tour.priceTour }" required/></p>
		<p>Date of Tour Begin:<input type="date" name="datetourbegin" value="${tour.dateTourBegin }" required/></p>
		<p>Date of Tour End:<input type="date" name="datetourend" value="${tour.dateTourEnd }" required/></p>
		<p>FlyTime:<input type="time" name="flytime" value="${tour.flyTime }" required/></p>
		 <input type="submit" />
	</form>
</body>
</html>