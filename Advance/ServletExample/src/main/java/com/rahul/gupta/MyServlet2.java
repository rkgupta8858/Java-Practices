package com.rahul.gupta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<html>");
			out.println("<body>");
				out.println("<h1>");
					out.println("Hello Rahul ! Welcome to Noida");
				out.println("</h1>");
				out.println("<hr> <br> <br>");
				out.println("<a href='index.html'> home </a>");
			out.println("</body>");
		out.println("</html>");
	}
}
