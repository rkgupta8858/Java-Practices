<%@page import="com.rahul.rk.dao.EmployeeDaoImpl"%>
<%@page import="com.rahul.rk.dao.EmployeeDao"%>
<%@page import="com.rahul.rk.modal.Employee"%>
<%
	Integer empId = Integer.parseInt(request.getParameter("empId"));

	EmployeeDao dao = new EmployeeDaoImpl();
	Boolean isDeleted = dao.delete(empId);
	
	if(isDeleted){
		response.sendRedirect("findAllController.jsp");
	}
	
	
%>