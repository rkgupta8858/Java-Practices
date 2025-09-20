package com.rahul.gupta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet1 extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<html>");
			out.println("<body>");
				out.println("<h1>");
					out.println("Hello Vishal ! Welcome to Delhi");
				out.println("</h1>");
				out.println("<hr> <br> <br>");
				out.println("<a href='index.html'> home </a>");
			out.println("</body>");
		out.println("</html>");
		
	}
	

}
