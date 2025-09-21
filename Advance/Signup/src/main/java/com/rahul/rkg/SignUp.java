package com.rahul.rkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet
{
	public void doPost( HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String driverName="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://@localhost:3306/signup";
		String username = "root";
		String password = "root";
		String sql = "insert into student values(?,?)";
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String userName = req.getParameter("userName");
		String userPassword = req.getParameter("userPassword");
		
		try {
			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(url,username,password);
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, userPassword);
			
			Integer count = ps.executeUpdate();
			out.println("<h1>"+ count + " Record Added </h1>");
				
		}
		catch(ClassNotFoundException e) {
			out.println(e);
		}
		catch(SQLException e) {
			out.println(e);
		}
		
	}
}
