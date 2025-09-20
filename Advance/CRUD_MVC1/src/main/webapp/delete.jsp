<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="deleteController.jsp" method="post">
		<h1>Delete Employee Record....</h1>
		Employee Id : <input type="text" name="empId" placeholder="Enter Employee Id"> <br><br>
		<input type="submit" value="Delete Record"><br><br>
		<a href="index.jsp">Home</a>
	</form>
</body>
</html>