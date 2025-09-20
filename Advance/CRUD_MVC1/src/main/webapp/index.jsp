<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addController.jsp" method="post">
		<h1>Add Employee Record....</h1>
		Employee Id : <input type="text" name="empId" placeholder="Enter Employee Id"> <br><br>
		Employee Name : <input type="text" name="empName" placeholder="Enter Employee Name"><br><br>
		Employee Salary : <input type="text" name="empSal" placeholder="Enter Employee Salary"><br><br>
		<input type="submit" value="Add Record"><br><br>
		
	</form>
	<a href="findAllController.jsp">All Employee Details</a>
</body>
</html>