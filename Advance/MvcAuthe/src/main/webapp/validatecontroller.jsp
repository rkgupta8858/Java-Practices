<%@page import="com.rahul.mvc.deo.LoginDaoImpl"%>
<%@page import="com.rahul.mvc.deo.LoginDao"%>
<%@page import="com.rahul.mvc.modal.Login" %>
<%
	String userName = request.getParameter("userName");
	String userPassword = request.getParameter("userPassword");
	
	Login login = new Login();
	login.setUserName(userName);
	login.setUserPassword(userPassword);
	
	LoginDao dao = new LoginDaoImpl();
	Boolean res = dao.validate(login);
	
	if(res==true){
		response.sendRedirect("welcome.jsp");
	}
	else{
		response.sendRedirect("error.jsp");
	}
%>