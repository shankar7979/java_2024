 // var const and let 
     // var  global , let -- local , const  constant 

     var p=100 
     document.write("outside  block  "+p)
     {
     let p=200
        document.write("<br>inside block  "+p)
     }
     document.write("<br>after block "+p)
     const k=1000;
     k=6778; // error 
