<%@page import="java.sql.Connection, java.sql.DriverManager,java.sql.PreparedStatement" %>

<%

	Integer empId = Integer.parseInt(request.getParameter("empId"));
	String empName = request.getParameter("empName");
	Double empSal = Double.parseDouble(request.getParameter("empSal"));
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	PreparedStatement ps = connection.prepareStatement("update emp set empName=?, empSalary=? where empId=?");
	
	ps.setInt(3,empId);
	ps.setString(1,empName);
	ps.setDouble(2,empSal);
	
	Integer count = ps.executeUpdate();
	
	out.println("<h1>"+ count +" Record Updated</h1>");
	out.println("<a href='updateemp.jsp'>Update More Record</a> <br><br>");
	out.println("<a href='index.jsp'>Home</a>");
	

%>