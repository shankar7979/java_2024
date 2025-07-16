<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@import url("style/style.css");
 .hello{
   width: 40%;
   margin: 100pt;
   padding: 20pt;
   border: solid 10pt red;
   background-color: yellow;
 } 
</style>
</head>

<%@page import="java.time.LocalTime"%>

<body>
	<div class="hello">
		<h1>Hello world</h1>
		<h2>
			Time is
			<%=LocalTime.now()%></h2>
		<h2>
			Date is
			<%=LocalDate.now()%></h2>
	</div>
	
	<script>
	  function validate(){
		   var id=document.getElementById("id").value
		   var name=document.getElementById("name").value
	        if(id==""){
	        	alert("id is blank")
	        	return false
	        }
	        else if(name==""){
	        	alert("name is blank")
	        	return false
	        }
	        else{
	        	return true;
	        }
	  }
	</script>
	
	<form action="empAction" onsubmit="return validate()">
	 <div>
	  <label>enter id </label>
	  <input name="id" id="id">
	 </div>
	 
	 <div>
	  <label>enter name </label>
	  <input name="name" id="name">
	 </div>
	 
	 <div>
	 <button type="submit">Login</button>
	 <button type="reset">Cancel</button>
	 </div>
	 
	 
	</form>
</body>
</html>