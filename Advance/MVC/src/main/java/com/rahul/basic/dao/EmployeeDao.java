package com.rahul.basic.dao;

import java.sql.SQLException;

import com.rahul.basic.model.Employee;

public interface EmployeeDao {
	public String addRecord(Employee employee)throws SQLException;
	public String deleteRecord(Employee employee)throws SQLException;
}
