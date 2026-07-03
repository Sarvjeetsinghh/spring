package in.sp.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	public Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_db", "root", "root");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return conn;
		
	}
}
