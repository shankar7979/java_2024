<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@import url("style/style.css");

form {
	padding: 30pt;
	background-color: pink;
	color: blue;
	border-radius: 20pt;
	border: inset maroon 20pt;
}
</style>
</head>
<body>

	<form action="userServlet">
		<div>
			<label>Enter id </label> <input name="id">
		</div>

		<div>
			<label>Enter name </label> <input name="name">
		</div>

		<div>
			<label>Enter password </label> 
			<input name="password" type="password">
		</div>
		<div>
			<button type="submit">Login</button>
			<button type="reset">Cancel</button>
		</div>

	</form>


</body>
</html>