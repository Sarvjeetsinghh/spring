package in.sp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sp.dbcon.DBConnection;

@WebServlet("/regForm")
public class Register extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email");
		String mypass = req.getParameter("password");
		String mycity = req.getParameter("city");
		
		try 
		{
			DBConnection dbconn = new DBConnection();
			Connection con = dbconn.getConnection();
			String sql_quries = "INSERT INTO register VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql_quries);
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypass);
			ps.setString(4, mycity);
			
			int count = ps.executeUpdate();
			if(count > 0) {
				out.println("<h3 style='color : green'>insert success </h3>");
			    RequestDispatcher rd = req.getRequestDispatcher("login.html");
			    
			    rd.include(req, resp);
			}
		} catch (Exception e)
		{
			out.println("User not registered due to some reason");
			RequestDispatcher rd = req.getRequestDispatcher("register.html");
			rd.include(req, resp);
		}
	}
}
