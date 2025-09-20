<%@page import="java.util.List"%>
<%@page import="com.rahul.rk.modal.Employee"%>
<%@page import="com.rahul.rk.dao.EmployeeDaoImpl"%>
<%@page import="com.rahul.rk.dao.EmployeeDao"%>

<h1 align="center">Employee Details...</h1>
<hr>
<table border="2" align="center" width="70%">

<thead>
	<tr>
		<th>Sr No</th>
		<th>EmpId</th>
		<th>EmpName</th>
		<th>EmpSalary</th>
		<th>Modify</th>
		<th>Remove</th>
	</tr>
</thead>

<%
	Integer num=1;
	EmployeeDao ad=new EmployeeDaoImpl();
	List<Employee> list=ad.findAll();
	for(Employee add:list)
	{		
%>
	<tr align="center">
		<td><%= num++ %></td>
		<td><%=add.getEmpId()%></td>
		<td><%=add.getEmpName()%></td>
		<td><%=add.getEmpSal()%></td>
		<td>
			<a href="update.jsp?empId=<%=add.getEmpId()%>">Update</a>
		</td>
		<td>
			<a href="deleteController.jsp?empId=<%= add.getEmpId()%>">Delete</a>
		
		</td>

	</tr>
<%
	}
%>
</table>
<hr>
<a href="index.jsp">Add More Record</a>