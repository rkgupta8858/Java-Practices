package com.a.r;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfig1 extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		ServletConfig sc = getServletConfig();
		String picName = sc.getInitParameter("MyPic");
		String picName1 = sc.getInitParameter("MyPic1");
		String picName2 = sc.getInitParameter("MyPic2");
		
		out.println("<img src='img/"+picName+"'width='500px' height='500px'>");
		out.println("<img src='img/"+picName1+"'width='500px' height='500px'>");
		out.println("<img src='img/"+picName2+"'width='500px' height='500px'>");
	}
}
