<%@page import="com.rahul.mvc.dao.AddDaoImpl"%>
<%@page import="com.rahul.mvc.dao.AddDao"%>
<%@page import="com.rahul.mvc.modal.Add"%>

<%
	Integer empId = Integer.parseInt(request.getParameter("empId"));
	String empName = request.getParameter("empName");
	Double empSal = Double.parseDouble(request.getParameter("empSal"));
	
	Add add = new Add();
	add.setEmpId(empId);
	add.setEmpName(empName);
	add.setEmpSal(empSal);
	
	AddDao dao = new AddDaoImpl();
	out.println(dao.addemployee(add));
%>