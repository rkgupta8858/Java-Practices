<%@page import="java.sql.Connection, java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet" %>

<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	PreparedStatement ps = connection.prepareStatement("select * from emp");
	
	ResultSet resultSet = ps.executeQuery();
	
		out.println("<table border='1' align='center' width='80%'>");
			out.println("<thead>");
				out.println("<th>EmpId</th><th>EmpName</th><th>EmpSalary</th>");
			out.println("</thead>");
		while(resultSet.next()){	
			out.println("<tr>");
				out.println("<td>"+resultSet.getInt(1)+"</td>");
				out.println("<td>"+resultSet.getString(2)+"</td>");
				out.println("<td>"+resultSet.getDouble(3)+"</td>");
			out.println("</tr>");
		}	
		out.println("</table>");
		

	out.println("<a href='findemp.jsp'>Find More Record</a> <br><br>");
	out.println("<a href='index.jsp'>Home</a>");
	
%>