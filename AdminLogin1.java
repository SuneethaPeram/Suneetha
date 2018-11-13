package com.eyedonate;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminLogin1")
public class AdminLogin1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String a=req.getParameter("name");
		String b=req.getParameter("password");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Ssuni@495");
		PreparedStatement p1=c2.prepareStatement("select *from admin where name=? and password=?");
		p1.setString(1,a);
		p1.setString(2, b);
	    int x=0;
	ResultSet rs=p1.executeQuery();
	while(rs.next()) {
		x=1;
		}
		if(x==0) {
			res.sendRedirect("error.html");
		}
		else {
			res.sendRedirect("AdminLogin1.html");
		
		}
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}

		
	}
	public void destroy() {
	System.out.println("destroy servlet");	
	}

	
	}

