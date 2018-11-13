package com.eyedonate;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Donor")
public class Donor extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String a=req.getParameter("name");
		String b=req.getParameter("email");
		String c=req.getParameter("mobileNo");
		String d=req.getParameter("bday");
		String e=req.getParameter("query");
		String f=req.getParameter("bdgroup");
		String g=req.getParameter("city");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Ssuni@495");
		PreparedStatement p1=c2.prepareStatement("insert into donor values(?,?,?,?,?,?,?)");
		p1.setString(1,a);
		p1.setString(2,b);
		p1.setString(3,c);
		p1.setString(4, d);
		p1.setString(5, e);
		p1.setString(6, f);
		p1.setString(7, g);
		p1.execute();
		res.sendRedirect("success.html");
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
}
	public void destroy() {
	System.out.println("destroy servlet");	
	}

	
	}


