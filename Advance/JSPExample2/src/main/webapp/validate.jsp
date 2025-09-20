<%@page import="java.sql.Connection, java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet" %>
<%
 	String sid = request.getParameter("sid");
 	String spass = request.getParameter("spass");
 
 	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","root");
	PreparedStatement ps = connection.prepareStatement("select * from student where sid=? ");
	ps.setString(1,sid);
	ResultSet rs = ps.executeQuery(); 
	if(rs.next())
	{
		if(rs.getString(2).equals(spass))
		{
			request.setAttribute("sid", sid);
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}
		else{
			request.setAttribute("sid", sid);
			request.setAttribute("spass", spass);
			RequestDispatcher rd = request.getRequestDispatcher("erorr.jsp");
			rd.include(request, response);
		}
		
	}
	


%>