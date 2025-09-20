<%@page import="com.rahul.mvc.dao.AddDaoImpl"%>
<%@page import="com.rahul.mvc.dao.AddDao"%>
<%@page import="com.rahul.mvc.modal.Add"%>
<%@page import="java.util.List"%>


<table border="1" align="center">
<thead>
	<tr>
		<td>EmpId</td>
		<td>EmpName</td>
		<td>EmpSalary</td>
	</tr>
</thead>

<%
	AddDao ad=new AddDaoImpl();
	List<Add> list=ad.findAll();
	for(Add add:list)
	{
%>
	<tr>
		<td><%=add.getEmpId()%></td>
		<td><%=add.getEmpName()%></td>
		<td><%=add.getEmpSal()%></td>

	</tr>
<%
	}
%>
</table>