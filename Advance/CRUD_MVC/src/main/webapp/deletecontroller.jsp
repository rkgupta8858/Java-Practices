<%@page import="com.rahul.mvc.dao.AddDaoImpl"%>
<%@page import="com.rahul.mvc.dao.AddDao"%>
<%@page import="com.rahul.mvc.modal.Add"%>
<%
	Integer empId = Integer.parseInt(request.getParameter("empId"));
	
	Add add = new Add();
	add.setEmpId(empId);
	
	AddDao dao = new AddDaoImpl();
	out.println(dao.delete(add));
%>