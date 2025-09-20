package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextTest extends HttpServlet
{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		ServletContext sc = getServletContext();
		
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String password = sc.getInitParameter("password");
		String sql = "insert into student values(?,?)";
		
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, user, password);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "akanksha");
			preparedStatement.setString(2, "Password");
			
			Integer num = preparedStatement.executeUpdate();
			out.println(num +" Record Added");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		String image = sc.getInitParameter("pic");
		out.println("<img src='img/"+image+"'width='100px' height='100px'>");
	}
}
