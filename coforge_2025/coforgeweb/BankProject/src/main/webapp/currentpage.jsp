<%@page import="com.coforge.model.BankLogin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> Current Page </h2>	
	<jsp:useBean id="login" scope="request"
		class="com.coforge.model.BankLogin"/>
     
    Id  :<jsp:getProperty  name="login" property="id" />
    <br>
    
    Name  :<jsp:getProperty  name="login" property="name" />
    <br>
    

</body>
</html>