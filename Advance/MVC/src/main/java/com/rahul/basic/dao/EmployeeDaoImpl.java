package com.rahul.basic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rahul.basic.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	Connection connection;
	PreparedStatement ps;
	String sql;
	
	public EmployeeDaoImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","root");
		} catch (ClassNotFoundException |SQLException e) {
			
			e.printStackTrace();
		}		
	}
	@Override
	public String addRecord(Employee employee) throws SQLException {
		sql="insert into employee values(?,?,?)";
		ps = connection.prepareStatement(sql);
		ps.setInt(1, employee.getEmpNo());
		ps.setString(2, employee.getEmpName());
		ps.setDouble(3, employee.getEmpSal());
		
		Integer count = ps.executeUpdate();
		return count +" Record Added....";
	}
	@Override
	public String deleteRecord(Employee employee) throws SQLException {
		sql="delete from employee where empNo=?";
		ps = connection.prepareStatement(sql);
		ps.setInt(1, employee.getEmpNo());
		Integer count = ps.executeUpdate();
		return count +" Record Deleted....";
	}

}
