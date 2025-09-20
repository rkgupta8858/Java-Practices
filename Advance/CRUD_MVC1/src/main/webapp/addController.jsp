<%@page import="com.rahul.rk.dao.EmployeeDaoImpl"%>
<%@page import="com.rahul.rk.dao.EmployeeDao"%>
<%@page import="com.rahul.rk.modal.Employee"%>
<%
	Integer empId = Integer.parseInt(request.getParameter("empId"));
	String empName = request.getParameter("empName");
	Double empSal = Double.parseDouble(request.getParameter("empSal"));
	
	Employee emp = new Employee();
	emp.setEmpId(empId);
	emp.setEmpName(empName);
	emp.setEmpSal(empSal);
	
	EmployeeDao dao = new EmployeeDaoImpl();
	Boolean isAdded = dao.addEmployee(emp);
	if(isAdded==true)
	{
		response.sendRedirect("findAllController.jsp");
	}
%>