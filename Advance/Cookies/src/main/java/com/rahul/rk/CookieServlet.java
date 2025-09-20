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

@WebServlet("/valiCookies")
public class CookieServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String userName = req.getParameter("userName");
		String userPass = req.getParameter("userPass");
		
		if(userName.equals("admin") && userPass.equals("pass")) 
		{
			Cookie c1 = new Cookie("userName", userName);
			Cookie c2 = new Cookie("userPass", userPass);
			res.addCookie(c1);
			res.addCookie(c2);
			out.println("<a href='welcome'>Next</a>");
			
		}
		else {
			out.println("<font color = 'red' size='4'> You Are Not Authorized User </font>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
	}
}
