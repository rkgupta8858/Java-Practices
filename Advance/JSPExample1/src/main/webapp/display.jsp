
<% 
	Integer empNo = Integer.parseInt(request.getParameter("empNo"));
	String empName = request.getParameter("empName");
	Integer empAge = Integer.parseInt(request.getParameter("empAge"));
	%>

<%="Number is : "+ empNo %>
<br>
<%="Name is : "+ empName %>
<br>
<%="Age is : "+ empAge %>
<br>