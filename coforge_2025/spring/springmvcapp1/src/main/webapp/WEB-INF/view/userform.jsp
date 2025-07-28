<html>
<head>
<style>
  .label{
     width:100pt;
     float:left;
  }
  .input{
    width:100pt;
  }
  .form{
     border-radius:20pt;
     border:solid;
     padding:20pt;
     margin-top:100pt;
     margin-left:270pt;
     width:50%;
     background:skyblue;
  }
  .error{
    color:red;

  }
  button{
    background:pink;
    padding:5pt;
  }
</style>
</head>
<body>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="user" action="userAction" cssClass="form">
    <div>
    <h3>User Form</h3>
    </div>
    <div>
        <form:label  path="userId" cssClass="label">User Id</form:label>
        <form:input path="userId" cssClass="input"/>
        <form:errors path="userId" cssClass="error"/>
    </div>
    <div>
        <form:label  path="userName" cssClass="label">User Name</form:label>
        <form:input path="userName" cssClass="input"/>
        <form:errors path="userName" cssClass="error"/>
    </div>
    <div>
        <form:label  path="userAge" cssClass="label">User Age</form:label>
        <form:input path="userAge" cssClass="input"/>
        <form:errors path="userAge" cssClass="error"/>
    </div>
    <div>
    <p>
       <form:label  path="hobbies" cssClass="label">Hobbies</form:label>
       <p>
       <form:errors path="hobbies" cssClass="error"/>
       </p>
       <form:checkboxes path="hobbies" items="${hobbies}" delimiter="<br>"/>
    </div>

    <div>
     <button type="submit">Login</button>
     <button type="reset">Cancel</button>
    </div>
</form:form>
</body>
</html>
