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
 background-color:pink;
 border-radius:20pt;
 border:inset maroon 20pt;  
}
</style>
</head>
<body>
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	
	 session.setMaxInactiveInterval(10);
	 session.setAttribute("id", id);
	 session.setAttribute("name", name);
	%>

	<form action="payment.jsp">
		<h2>Add Product Page</h2>
		<div>
		<label>Id is <%=id %></label>
		<br>
		<label>Name is <%=name %></label>
		</div>
		<div>
		<br>
			<label>Enter Product1</label> <input placeholder="product1"
				name="prd1">
		</div>

		<div>
			<label>Enter Product2</label> <input placeholder="product2"
				name="prd2">
		</div>
		<div>
			<button type="submit">buy product</button>
			<button type="reset">cancel</button>
		</div>
	</form>
</body>
</html>