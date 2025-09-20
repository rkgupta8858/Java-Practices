package com.rahul.mvc.dao;
import java.sql.SQLException;
import java.util.List;

import com.rahul.mvc.modal.Add;

public interface AddDao {
	String addemployee(Add add) throws ClassNotFoundException, SQLException;
	String update(Add add) throws ClassNotFoundException, SQLException;
	String delete(Add add) throws ClassNotFoundException, SQLException;
	Add find(Integer empId) throws ClassNotFoundException, SQLException;
	List<Add> findAll()throws ClassNotFoundException, SQLException;
}
