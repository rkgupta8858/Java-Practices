package com.rahul.rkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectSignup extends HttpServlet
{
	public void doPost( HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String driverName="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://@localhost:3306/signup";
		String username = "root";
		String password = "root";
		String sql = "select * from student where sid = ?";
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String userName = req.getParameter("userName");
		
		try {
			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(url,username,password);
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userName);
			
			
			ResultSet resultSet = ps.executeQuery();
			
			if(resultSet.next()) {
				out.println("<table border='1' align='center' width='80%'>");
					out.println("<thead>");
						out.println("<th>sid</th><th>spass</th>");
					out.println("</thead>");
					
					out.println("<tr>");
						out.println("<td>"+resultSet.getString(1)+"</td>");
						out.println("<td>"+resultSet.getString(2)+"</td>");
					out.println("</tr>");
				out.println("</table>");
				
			}
			else {
				out.println("<h1> Record Not Found....");
			}
				
		}
		catch(ClassNotFoundException e) {
			out.println(e);
		}
		catch(SQLException e) {
			out.println(e);
		}
		
	}
}
