<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
       .myclass{
         border:solid;
         background:lightyellow;
         color:maroon;
         padding:20pt;
         margin-left:280pt;
         margin-top:100pt;
         width:35%;
         border-radius:20pt;
       }
       body{
         background:skyblue;
       }
    </style>
</head>
<body>
<%@page import="com.coforge.model.Employee"%>
<%
Employee employee=(Employee)request.getAttribute("employee");
%>
  <div class="myclass">
      <div> Id is <%=employee.getEmpId()%></div>
      <div> Name is <%=employee.getEmpName()%></div>
  </div>
  <hr>
  <div class="myclass">
  <p>Using EL (Expression Language)</p>
     Id id ${employee.empId}<p>
     Name id ${employee.empName}<p>
  </div>
</body>
</html>