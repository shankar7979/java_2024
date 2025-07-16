<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%

String search1=request.getParameter("search");

	if(search1.equals("google")){
		response.sendRedirect("https://www.google.com/");
	}

	else if(search1.equals("bing")){
		response.sendRedirect("https://www.bing.com/");
	}

	else if(search1.equals("duckduckgo")){
		response.sendRedirect("https://duckduckgo.com/");
	}
	else if(search1.equals("banklogin")){
		response.sendRedirect("http://localhost:8080/BankProject/BankLogin.jsp");
	}
	
	

%>

</body>
</html>