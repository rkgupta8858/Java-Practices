package com.rahul.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rahul.mvc.modal.Add;

public class AddDaoImpl implements AddDao{

	@Override
	public String addemployee(Add add) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://@localhost:3306/employee","root","root");
		PreparedStatement ps = conn.prepareStatement("insert into emp values(?,?,?)");
		
		ps.setInt(1, add.getEmpId());
		ps.setString(2, add.getEmpName());
		ps.setDouble(3, add.getEmpSal());
		
		return ps.executeUpdate() +" Record Added";
	}

	@Override
	public String update(Add add) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://@localhost:3306/employee","root","root");
		PreparedStatement ps = conn.prepareStatement("update emp set empName=?,empSalary=? where empId=?");
		
		ps.setInt(3, add.getEmpId());
		ps.setString(1, add.getEmpName());
		ps.setDouble(2, add.getEmpSal());
		
		return ps.executeUpdate() +" Record updated";	
		}
	
	public String delete(Add add) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://@localhost:3306/employee","root","root");
		PreparedStatement ps = conn.prepareStatement("delete from emp where empId=?");
		
		ps.setInt(1, add.getEmpId());
		
		return ps.executeUpdate() +" Record Deleted";	
		}
	public Add find(Integer empId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://@localhost:3306/employee","root","root");
		PreparedStatement ps = conn.prepareStatement("select * from emp where empId=?");
		ps.setInt(1, empId);
		
	ResultSet rs=	ps.executeQuery();
			Add add2=new Add();
			if(rs.next())
			{
				add2.setEmpId(rs.getInt(1));
				add2.setEmpName(rs.getString(2));
				add2.setEmpSal(rs.getDouble(3));
			}
			return add2;
		}

	
	@Override
	public List<Add> findAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://@localhost:3306/employee","root","root");
		PreparedStatement ps = conn.prepareStatement("select * from emp");
	   ResultSet rs=	ps.executeQuery();
	   List<Add> list = new ArrayList<Add>();
			while(rs.next())
			{
				Add add2=new Add();
				add2.setEmpId(rs.getInt(1));
				add2.setEmpName(rs.getString(2));
				add2.setEmpSal(rs.getDouble(3));
				list.add(add2);

			}
			return list;
		}
	}
