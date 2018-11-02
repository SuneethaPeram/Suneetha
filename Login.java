package com.login;

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

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int x=0;
		String a=req.getParameter("name");
		String b=req.getParameter("password");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Ssuni@495");
		PreparedStatement p1=c2.prepareStatement("select *from login where name=? and password=?");
		p1.setString(1,a);
		p1.setString(2, b);;
		ResultSet rs=p1.executeQuery();
		while(rs.next()) {
		x=1;
		}
		if(x==0) {
			res.sendRedirect("Error.html");
		}
		else {
			res.sendRedirect("Register.html");
		}
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}

		//System.out.println("hdlskjh")
		//out.println("fbjklsfjkl");
	}
	public void destroy() {
	System.out.println("destroy servlet");	
	}

	
	}

