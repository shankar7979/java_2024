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
<div class="form">
    <div> Id is ${user.userId}</div>
    <div> Name is ${user.userName}</div>
    <div> Age is ${user.userAge}</div>
    <div>  Hobbies are   ${user.hobbies}</div>
</div>


</body>
</html>
