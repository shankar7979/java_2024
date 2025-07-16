<!--  declarative tag  -->
<%!int x = 10;
	int y = 20;
	int counter = 1;

	int addition(int x, int y) {
		return x + y;
	}%>
<!--
 expression tag  
  will add value in the out.println()
-->
<div
	style="border: inset green 20pt; margin: 100pt; color: blue; background: yellow; padding: 20pt; width: 30%">
	<div>
		No1 is
		<%=x%>
	</div>

	<div>
		No2 is
		<%=y%>
	</div>

	<div>
		Subtraction of
		<%=x%>
		and
		<%=y%>
		is
		<%=x - y%>
	</div>
	<div></div>
	Addition of
	<%=x%>
	and
	<%=y%>
	is
	<%=addition(x, y)%>
	<p>
		Count is
		<%=++counter%>
</div>

<!-- scriptlet     allows to use implicit objects like out, request, response 
      it adds the code in the service  method of the servelt 
 -->

<hr color="red">

<%
out.println("<br>no1 is " + x);
out.println("<br>no2 is " + y);
out.println("<br>addition  " + addition(x, y));
out.println(" <p>Count is  " + counter);
%>


