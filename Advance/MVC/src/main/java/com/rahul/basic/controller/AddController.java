package com.rahul.basic.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rahul.basic.dao.EmployeeDao;
import com.rahul.basic.dao.EmployeeDaoImpl;
import com.rahul.basic.model.Employee;

@WebServlet("/addController")
public class AddController extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		Integer empNo = Integer.parseInt(req.getParameter("empNo"));
		String empName = req.getParameter("empName");
		Double empSal = Double.parseDouble(req.getParameter("empSal"));
		
		Employee employee = new Employee();
		employee.setEmpNo(empNo);
		employee.setEmpName(empName);
		employee.setEmpSal(empSal);
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		try {
			out.println(employeeDao.addRecord(employee));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
