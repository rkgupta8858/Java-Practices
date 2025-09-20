package com.rahul.rk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hiddenCookies")
public class HiddenFieldServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String userName = req.getParameter("userName");
		String userPass = req.getParameter("userPass");
		
		if(userName.equals("admin") && userPass.equals("pass")) 
		{
			out.println("<form method='post' action='welcome'>");
				out.println("<input type='hidden' name='userName' value='"+userName+"'>");
				out.println("<input type='hidden' name='userPass' value='"+userPass+"'>");
				out.println("<input type='submit' value='next'>");
			out.println("</form>");
			
		}
		else {
			out.println("<font color = 'red' size='4'> You Are Not Authorized User </font>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
	}
}
