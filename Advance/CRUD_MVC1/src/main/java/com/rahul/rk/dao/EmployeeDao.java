package com.rahul.rk.dao;

import java.sql.SQLException;
import java.util.List;

import com.rahul.rk.modal.Employee;

public interface EmployeeDao {
	 Boolean addEmployee(Employee emp) throws SQLException;
	 List<Employee> findAll() throws SQLException;
	 Boolean delete(Integer empId) throws SQLException;
	 Boolean update(Employee emp) throws SQLException;
	 
}
