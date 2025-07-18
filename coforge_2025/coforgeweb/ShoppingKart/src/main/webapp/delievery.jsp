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
	<%
	Object id = session.getAttribute("id");
	var name = session.getAttribute("name");
	var product1 = session.getAttribute("prd1");
	var product2 = session.getAttribute("prd2");
	var paymentType = request.getParameter("ptype");
	%>

	<form>
		<table>
			<tr>
				<td>Id is <%=id%></td>
			</tr>
			<tr>
				<td>Name is <%=id%></td>
			</tr>
			<tr>
				<p>Product Purchased are:
				<td>Product1 is <%=product1%>Product1 is <%=product1%></td>
			</tr>

			<tr>
				<td>Id is <%=product2%></td>
			</tr>
			<tr>
				<td>Payment type is <%=paymentType%></td>
			</tr>
		</table>
	</form>
</body>
</html>