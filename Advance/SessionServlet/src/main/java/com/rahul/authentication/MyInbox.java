package com.rahul.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myIn")
public class MyInbox extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter(); 
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>My Inbox</title></head>");
            out.println("<body>");
            
            Cookie[] cookies = req.getCookies();
            if (cookies != null) {
                
                out.println("<h1>My Inbox</h1>");
                out.println("<a href ='signOut'>Sign Out</a>");
                
            } else {
                res.sendRedirect("index.html");
            }
            
            out.println("</body>");
            out.println("</html>");
        
    }
}