package com.rahul.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/signOut")
public class LogOut extends HttpServlet{
	 protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	        res.setContentType("text/html");
	        PrintWriter out = res.getWriter();
	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head><title>My Inbox</title></head>");
	            out.println("<body>");
	            
	            Cookie[] cookies = req.getCookies();
	            Cookie c1 = cookies[0];
	            Cookie c2 = cookies[1];
	            c1.setMaxAge(0);
	            c2.setMaxAge(0);
	            res.addCookie(c1);
                res.addCookie(c2);
	            res.sendRedirect("index.html");
	            
	            
	            out.println("</body>");
	            out.println("</html>");
	        }
	    
}