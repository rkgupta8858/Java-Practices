<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String sid =(String) request.getAttribute("sid");
	String spass =(String) request.getAttribute("spass");
%>    
<%= "Welcome : "+sid %>
<%= "Welcome : "+spass %>
