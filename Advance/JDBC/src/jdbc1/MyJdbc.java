package jdbc1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJdbc {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","root");
		Statement st = con.createStatement();
		st.executeUpdate("insert into student values('abasar','priya')");
		con.close();
		System.out.println("all done"); 
	}
}
