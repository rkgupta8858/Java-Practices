package com.rahul.gupta;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigExample extends HttpServlet
{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		ServletConfig sc = getServletConfig();
		String picName = sc.getInitParameter("MyPic");
		out.println("<img src='img/"+picName+"'width='500px' height='500px'>");
	}
}
