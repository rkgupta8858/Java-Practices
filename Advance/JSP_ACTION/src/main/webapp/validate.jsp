<jsp:useBean id="op" class="myPack.Operations"></jsp:useBean>

<%
	Integer num1 = Integer.parseInt(request.getParameter("num1"));
	Integer num2 = Integer.parseInt(request.getParameter("num2"));
%> 
	<jsp:setProperty property="x" name="op" value="<%=num1%>"></jsp:setProperty>
	<jsp:setProperty property="y" name="op" value="<%=num2%>"></jsp:setProperty>
	
<%
	// Setter Getter 
	// op.setX(num1);
	// op.setY(num2);
	
	Integer num3 = op.mul();
	
%>

<%= "Result is : " +num3 %>