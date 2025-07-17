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
	border-radius: 20pt;
	border: inset maroon 20pt;
}
</style>

</head>
<body>

	<%
	/* int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name"); */
	if(session.isNew()){
	  out.print("<h2> Your Session is expired </h2>");
	  out.print("<h2> Login Again</h2>");
	  out.print("<p> <a href='UserLogin.jsp'> Login Again</a>");
	}
	else {
	Object id=session.getAttribute("id");
	Object name=session.getAttribute("name");
	String prd1 = request.getParameter("prd1");
	String prd2 = request.getParameter("prd2");
	%>

	<form action="delievery.jsp">
		<div style="float:right">
		  <a href="logout.jsp">Logout </a>
		
		</div>
		<h2>Add Product Page</h2>
		<div>
			<label>Id is <%=id%></label> <br> <label>Name is <%=name%></label>
		</div>

		<div>
		<br>
			<label>Product1 : <%=prd1%></label> <br> <label>Product2 : <%=prd2%></label>
		</div>

		<div>
		<br><br>
			<label style="font-weight: bold">Select Payment type </label> <select name="ptype">
				<option value="card">Card</option>
				<option value="cash">Cash</option>
				<option value="upi">UPI</option>
			</select>
		</div>
		<div style="margin-top: 5pt;">
			<button type="submit">pay for  product</button>
			<button type="reset">cancel</button>
		</div>
	</form>
<%} %>
</body>
</html>