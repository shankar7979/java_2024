<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page errorPage="error1.jsp" %>
<%  

int x=Integer.parseInt(request.getParameter("n1"));
int y=Integer.parseInt(request.getParameter("n2"));
%>


Addition  is <%=x+y %><p>
Subtraction  is <%=x-y %><p>
Multiplication is <%=x*y %><p>

</body>
</html>