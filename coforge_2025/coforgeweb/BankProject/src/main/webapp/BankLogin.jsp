<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url("style/style.css");
 form{
  background-color: skyblue;
  border-radius: 20pt;
  border:inset 20pt blue;
 }
</style>
</head>
<body>
	<form action="BankController">
	 <h1>Bank Login Application </h1>

		<div>
			<label>Enter id </label> <input name="id">
		</div>
		<div>
			<label>Enter name </label> <input name="name">
		</div>

		<div style="margin-top: 5pt">
		    <br>
			<label>Select BankType </label>
			<br><br>
			<div>
				<input name="btype" type="radio" value="saving">Saving Account
			</div>
			<div>
				<input name="btype" type="radio" value="demate">Demate Account
			</div>
			<div>
				<input name="btype" type="radio" value="current">Current Account
			</div>
			<div style="margin-top: 5pt">
			   <button type="submit"> Login</button>
			   <button type="reset"> Cancel</button>
			</div>
		</div>
	</form>
</body>
</html>