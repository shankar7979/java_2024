<%@page import="com.coforge.util.DatabaseUtil"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 table{
   border:double;
   margin-left: 240pt;
   margin-top: 36pt;
   padding: 20pt;
   width:50%;
   height:100pt;
   background-color: pink;
   color:green;
   /* display: table-row; */
 }
 td{
   border:solid;
 }
 tr{
   border:double green;
 }
 th{
   border:solid;
   font-weight: bold;
   color: blue;
 } 
 body{
 background: lightyellow;
 }
</style>
</head>
<body>
<!-- declarative section -->
	<%!
	Connection connection;
	Statement statement;
	ResultSet rs;
	%>

   <!-- scriptlet section -->
	<%
	/* DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge_db", "root", "mysql");
 */
 
 connection=DatabaseUtil.getMyConnection();
 statement = connection.createStatement();
	rs = statement.executeQuery("select * from person");
	%>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		<%
		while (rs.next()){
		%>
		<tr>
		<!-- expression   -->
		<td><%=rs.getInt(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getFloat(3) %></td>
		</tr>
		
		<% } %>
	</table>
</body>
</html>