// even odd || image print || table print


package com.nadeem.rahul;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyTable01 extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
//		 image print		
//		String name=req.getParameter("name");
//		out.println("<img src = 'img/"+ name+".gif' alt = 'image not found'>");
		
		
// 		 even odd check
		
		Integer num=Integer.parseInt(req.getParameter("name"));
		if(num%2==0) {
			out.println("Number is even !!");
		}
		else {
			out.println("Number is odd !!");
		}
		
		
		
// 		 table print
		
//		Integer num=Integer.parseInt(req.getParameter("num"));
//		out.println("<table border='2' width=100%>");
//		for(int i=1;i<=10;i++) {
		
//			out.println("<tr>");
//				out.println("<td>");
//					out.println(num);
//				out.println("</td>");
//				out.println("<td>");
//					out.println("*");
//				out.println("</td>");
//				out.println("<td>");
//					out.println(i);
//				out.println("</td>");
//				out.println("<td>");
//					out.println("=");
//				out.println("</td>");
//				out.println("<td>");
//					out.println(num*i);
//				out.println("</td>");
//			out.println("</tr>");
//			
//		}
//		out.println("</table>");
		out.println("</br>");
		
		out.println("<a href='abc.html'> Home </a>");
	}
}
