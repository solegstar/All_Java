<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<script src="resources/js/jquery-3.3.1.js" type="text/javascript"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	$(document).ready(function() {
		$("#update_button").onclick(function() {
			var password = $('#userPass').val();
			var passwordRepeat = $('#userConfPass').val();
			if (password !== passwordRepeat) {
				$('#passErrorMessage').html('Check password');
				return;
			}

			$.ajax({
				url : 'updateUser',
				data : {
					userId: $('#userId').val(),
					name : $('#userName').val(),
					lastName : $('#userLastName').val(),
					userPass : $('#userPass').val(),
					userConfPass : $('#userConfPass').val(),
					userEmail : $('#userEmail').val(),
					userDob : $('#userDob').val()
				},
				method: 'POST',
				success : function(result) {
					$("#successMessage").html("updated successfully");
					console.log(result);
					window.location = result;
				},
				error: function(smth) {
					console.log(smth)
				}
			});
		});
	});
</script>
</head>
<style>
	label {
		width: 150px;
		display: inline-block;
		cursor: pointer;
	}
</style>
<body>
	<form action="updateUser" method="POST">
		<input id="userId" type="hidden" name="user_id" value="${user.id }">
		<p><label for="userName">First Name:</label>
		<input id="userName" type="text" name="name" value="${user.name }" required/> <span style="color:red"> ${nameErrorMessage} </span></p>
		<p><label for="userLastName">Last Name:</label>
		<input id="userLastName" type="text" name="last_name" value="${user.lastName }" required/> <span style="color:red"> ${lastNameErrorMessage} </span></p>
		<p><label for="userPass">Password:</label>
		<input id="userPass" type="password" name="pass" required/> <span style="color:red"> ${passwordErrorMessage} </span></p>
		<p><label for="userConfPass">Confirm Password:</label>
		<input id="userConfPass" type="password" name="confPass" required/> <span id="passErrorMessage" style="color:red"/></p>
		<p><label for="userEmail">Email:</label>
		<input id="userEmail" type="text" name="email" value="${user.email }" required/> <span style="color:red"> ${emailErrorMessage} </span></p>
		<p><label for="userDob">Day of Birth:</label>
		<input id="userDob" type="date" name="dob" value="${user.dob }" required/> <span style="color:red"> ${dobErrorMessage} </span></p>
		<input type="submit" value="Обновить."/>
	</form>
<p><button id="update_button">UPDATE</button></p>

<div id="successMessage"/>
</body>
</html>