package com.rahul.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vali")
public class ValidateServlate extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String id = req.getParameter("Id");
        String pass = req.getParameter("Pass");

        
            if (id.equals("admin") && pass.equals("pass")) 
            {
                Cookie userCookie = new Cookie("username", id);
                Cookie passCookie = new Cookie("password", pass);
                userCookie.setMaxAge(60*60); 
                passCookie.setMaxAge(60*60 ); 
               

                res.addCookie(userCookie);
                res.addCookie(passCookie);
                res.sendRedirect("myIn");
            } else {
                out.println("<h3>Invalid Password</h3>");
                out.println("<a href='index.html'>Login Again</a>");
            }
        }
    }