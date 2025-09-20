package com.rahul.rk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rahul.rk.modal.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public EmployeeDaoImpl() throws ClassNotFoundException, SQLException {
		super();
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://@localhost:3306/employee","root","root");
	}

	@Override 
	public Boolean addEmployee(Employee emp) throws SQLException {
		 ps=conn.prepareStatement("insert into emp values(?,?,?)");
		 ps.setInt(1, emp.getEmpId());
		 ps.setString(2, emp.getEmpName());
		 ps.setDouble(3, emp.getEmpSal());
		 ps.executeUpdate();
			
		return true;
	}

	@Override
	public List<Employee> findAll() throws SQLException {
		ps = conn.prepareStatement("select * from emp");
		rs = ps.executeQuery();
		List<Employee> list = new ArrayList<Employee>();
		while(rs.next())
		{
			Employee emp1 = new Employee();
			emp1.setEmpId(rs.getInt(1));
			emp1.setEmpName(rs.getString(2));
			emp1.setEmpSal(rs.getDouble(3));
			list.add(emp1);

		}
		return list;	}

	@Override
	public Boolean delete(Integer empId) throws SQLException {
		ps = conn.prepareStatement("delete from emp where empId=?");
		ps.setInt(1, empId);
		Integer deleteRow = ps.executeUpdate();
		
		return deleteRow > 0;
	}

	@Override
	public Boolean update(Employee emp) throws SQLException {
		ps = conn.prepareStatement("update emp set empName=?, empSalary=? where empId=?");
		ps.setString(1, emp.getEmpName());
		ps.setDouble(2, emp.getEmpSal());
		ps.setInt(3, emp.getEmpId());
		ps.executeUpdate();
		
		return true;
	}

	

}
