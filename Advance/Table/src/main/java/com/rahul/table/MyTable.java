package com.rahul.table;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyTable extends HttpServlet 
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
    	res.setContentType("text/html");
    	PrintWriter out = res.getWriter();
    	Integer num = Integer.parseInt(req.getParameter("num"));
    	out.println("<table border='2' width=100%>");
    	for(int i=1;i<=10;i++)
    	{
    		out.println("<tr>");
//    			out.println("<td>");
//    				out.println(num);    				
//      		out.println("</td>");
      			
      			out.println("<td>"+ num + "</td>");
      			
//      			out.println("<td>");
//      				out.println("*");    				
//      			out.println("</td>");
      			
      			out.println("<td>"+ "*" + "</td>");
//      			
//      			out.println("<td>");
//      				out.println(i);    				
//      			out.println("</td>");
      			
      			out.println("<td>"+ i + "</td>");
      			
//      			out.println("<td>");
//      				out.println("=");    				
//      			out.println("</td>");
      			
      			out.println("<td>"+ "=" + "</td>");
      			
//      			out.println("<td>");
//      				out.println(num*i);    				
//      			out.println("</td>");

      			out.println("<td>"+ num*i +"</td>");
      			
    		out.println("</tr>");
    	}
    	out.println("</table>");   
    	
    	out.println("<a href=\"index.html\"> Home</a>");
    	
  
    }
}
