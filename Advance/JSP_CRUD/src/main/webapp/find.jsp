<%@page import="java.sql.Connection, java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet" %>

<%

	Integer empId = Integer.parseInt(request.getParameter("empId"));
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	PreparedStatement ps = connection.prepareStatement("select * from emp where empId=?");
	
	ps.setInt(1,empId);
	ResultSet resultSet = ps.executeQuery();
	
	if(resultSet.next()) {
		out.println("<table border='1' align='center' width='80%'>");
			out.println("<thead>");
				out.println("<th>EmpId</th><th>EmpName</th><th>EmpSalary</th>");
			out.println("</thead>");
			
			out.println("<tr>");
				out.println("<td>"+resultSet.getInt(1)+"</td>");
				out.println("<td>"+resultSet.getString(2)+"</td>");
				out.println("<td>"+resultSet.getDouble(3)+"</td>");
			out.println("</tr>");
		out.println("</table>");
		
	}
	else {
		out.println("<h1> Record Not Found.... <br><br>");
	}

	out.println("<a href='findemp.jsp'>Find More Record</a> <br><br>");
	out.println("<a href='index.jsp'>Home</a>");
	
%>