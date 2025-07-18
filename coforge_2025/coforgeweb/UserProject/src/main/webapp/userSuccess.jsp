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
<form>
  <h1>User Page</h1>
  <p>
   Welcome user <%=session.getAttribute("name") %>
   <p>
   Ur id  is <%=session.getAttribute("id") %>
 </p>
  
</form>
</body>
</html>