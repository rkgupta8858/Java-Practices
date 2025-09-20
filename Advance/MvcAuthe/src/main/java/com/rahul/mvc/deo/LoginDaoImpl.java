package com.rahul.mvc.deo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rahul.mvc.modal.Login;

public class LoginDaoImpl implements LoginDao{

	@Override
	public Boolean validate(Login login) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://@localhost:3306/signup","root","root");
		PreparedStatement ps = conn.prepareStatement("select * from signin where userName=? and userPassword=?");
		
		ps.setString(1, login.getUserName());
		ps.setString(2, login.getUserPassword());
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			return true;
		}
		else {
			return false;
		}
	}

}
