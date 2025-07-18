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
	background-color: black;
	color:white;
	border-radius: 20pt;
	border: inset maroon 20pt;
}
</style>

</head>
<body>
<%@page isErrorPage="true" %>
<form>
   <h2> Error Page </h2>
   <p>Error is <%=exception.getMessage()  %>
   
    <p>
   Login Again
  </p>
  <a href="UserLogin.jsp">Login Again</a>
   
</form>

</body>
</html>