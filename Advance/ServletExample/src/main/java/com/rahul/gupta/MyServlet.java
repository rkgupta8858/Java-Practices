package com.rahul.gupta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet
{
	public void init(ServletConfig sc) throws ServletException{
		
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<html>");
			out.println("<body>");
				out.println("<h1>");
					out.println("Hello Rahul ! Welcome to DUCAT Noida Sector -16.");
				out.println("</h1>");
				out.println("<hr> <br> <br>");
				out.println("<a href='index.html'> home </a>");
			out.println("</body>");
		out.println("</html>");
	}
	
	public void destroy() {
		
	}
	
	public ServletConfig getServletConfig() {
		return null;
	}
	
	public String getServletInfo() {
		return null;
	}
}

