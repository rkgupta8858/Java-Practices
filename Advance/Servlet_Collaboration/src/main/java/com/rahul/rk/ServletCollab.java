package com.rahul.rk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class ServletCollab extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h1>Validate Servlet</h1>"); 
		
		String userName = req.getParameter("userName");
		String userPassword = req.getParameter("userPassword");
		
		if(userName.equals("Admin") && userPassword.equals("Pass")) 
		{
			RequestDispatcher rd1 = req.getRequestDispatcher("wel");
			rd1.forward(req, res);
		}
		else {
			RequestDispatcher rd2 = req.getRequestDispatcher("err");
			rd2.include(req, res);
		}
	}
}
