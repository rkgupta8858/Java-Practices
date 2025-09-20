
<%@page import="java.sql.Connection, java.sql.DriverManager,java.sql.PreparedStatement" %>

<%

	Integer empId = Integer.parseInt(request.getParameter("empId"));
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	PreparedStatement ps = connection.prepareStatement("delete from emp where empId=?");
	
	ps.setInt(1,empId);
	Integer count = ps.executeUpdate();
	
	out.println("<h1>"+count+" Record Deleted</h1>");
	out.println("<a href='deleteemp.jsp'>Delete More Record</a> <br><br>");
	out.println("<a href='index.jsp'>Home</a>");
	
%>