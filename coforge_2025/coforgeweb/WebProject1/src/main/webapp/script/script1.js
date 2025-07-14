var validate=()=>{
	   var id=document.getElementById("id").value;
	   var name=document.getElementById("name").value;
	   var pass=document.getElementById("pass").value;
	   if(id==""){
		   //alert("id is blank")
		   document.getElementById("id_err").innerHTML="id is blank"
		   return false;
	   }
	   
	   else  if(isNaN(id)){
		//   alert("id must have numeric value")
		document.getElementById("id_err").innerHTML="id must have numeric value"	
		   return false;
	   }
	   
	   else if(name==""){
		   //alert("name is blank")
		   document.getElementById("name_err").innerHTML="name is blank"
		   return false;
	   }
	   else if(name.length<6){
		   //alert("name must of 5 character minimum")
		   document.getElementById("name_err").innerHTML="name must of 5 character minimum"
		   return false;
	   }
	   
	   else if(pass==""){
		   //alert("password is blank")
		   document.getElementById("pass_err").innerHTML=
		   "password is blank"
		   return false;
	   }
	   else{
		   return true
	   }
   }
   
   var clock=()=>document.getElementById("clock").innerHTML=new Date().toLocaleTimeString()
   
   var myclock=()=>{
	setInterval("clock()",1000)
   }

   var time=()=>document.getElementById("time").innerHTML=new Date().toLocaleDateString()
      
      var mytime=()=>{
   	setInterval("time()",1000)
      }
      
   
   