<%@page import="myPack.Operations" %>

<%
	Integer num1 = Integer.parseInt(request.getParameter("num1"));
	Integer num2 = Integer.parseInt(request.getParameter("num2"));
	
	Operations op = new Operations();
	
	op.setX(num1);
	op.setY(num2);
	
	Integer num3 = op.div();
	
%>

<%= "Result is : " +num3 %>