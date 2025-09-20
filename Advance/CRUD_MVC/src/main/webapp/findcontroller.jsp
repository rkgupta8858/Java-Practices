<%@page import="com.rahul.mvc.dao.AddDaoImpl"%>
<%@page import="com.rahul.mvc.dao.AddDao"%>
<%@page import="com.rahul.mvc.modal.Add"%>
<%
	Integer empId = Integer.parseInt(request.getParameter("empId"));
	
	AddDao dao = new AddDaoImpl();
	Add add=dao.find(empId);
	out.print(add.getEmpId());
	out.print(add.getEmpName());
	out.print(add.getEmpSal());
%>