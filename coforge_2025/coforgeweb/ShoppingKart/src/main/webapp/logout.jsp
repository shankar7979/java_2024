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
 background-color:red;
 border-radius:20pt;
 color:yellow;
 border:inset maroon 20pt;  
}
</style>
</head>
<body>
<form>
<% 
   session.invalidate();
%>
  <p>
  <h2> You have logged out successfully</h2>
  <p>
   Login Again
  </p>
  <a href="UserLogin.jsp">Login Again</a>
</form>

</body>
</html>