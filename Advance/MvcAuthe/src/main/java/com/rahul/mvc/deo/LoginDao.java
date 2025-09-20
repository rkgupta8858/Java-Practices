package com.rahul.mvc.deo;

import java.sql.SQLException;

import com.rahul.mvc.modal.Login;

public interface LoginDao {
	Boolean validate(Login login) throws ClassNotFoundException, SQLException;
}
