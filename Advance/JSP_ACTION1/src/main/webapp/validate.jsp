<jsp:useBean id="op" class="myPack.Operations"></jsp:useBean>

<%

	// Integer num1 = Integer.parseInt(request.getParameter("num1"));
	// Integer num2 = Integer.parseInt(request.getParameter("num2"));
%> 
	<jsp:setProperty property="x" name="op" param="num1"></jsp:setProperty>
	<jsp:setProperty property="y" name="op" param="num2"></jsp:setProperty>
	
	num 1 : <jsp:getProperty property="x" name="op" /> <br>
	num 2 : <jsp:getProperty property="y" name="op" /> <br>
	
<%
	// Setter Getter 
	// op.setX(num1);
	// op.setY(num2);
	
	Integer num3 = op.mul();
	
%>

<%= "Result is : " +num3 %>
