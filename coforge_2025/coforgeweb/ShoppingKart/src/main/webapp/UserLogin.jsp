<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@import url("style/style.css");
form{
 padding:30pt;
 border-radius:20pt;
 border:double maroon 20pt;  
}
</style>
</head>
<body>
	<form action="userAction.jsp">
		<div>
			<label>Enter Id</label> 
			<input placeholder="enter id" name="id">
		</div>
		
		<div>
			<label>Enter Name</label> 
			<input placeholder="enter name"  name="name">
		</div>
		<div>
		<button type="submit">login</button>
		<button type="reset">cancel</button>
		</div>

	</form>
</body>
</html>