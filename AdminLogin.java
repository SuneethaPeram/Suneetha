package com.eyedonate;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet
 {
Statement st=null;
Connection con=null;
ResultSet rs;
public void init()
{
System.out.println("init");
}
public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
{
	 try
	 {
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Ssuni@495");

	 }
	 catch(Exception ae)
	 {
	 }


 	 
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
            out.println("<head>");
            out.println("<h1><center>Report Of Donor</h1><hr>");  
            out.println("</head>");
          out.println("<body>");
 out.println("<img src=eye2.jpg border=0 height=200 width=820>");
          
	out.println("<table border=2>");
 out.println("<tr>");
	  out.println("<th>NAME</th><th>EMAIL</th><th>MOBILENo</th><th>DATEOFBIRTH</th><th>QUERY</th><th>BLOODGROUP</th><th>City</th>");
	 out.println("</tr>");
	 try {
st=con.createStatement();
	rs=st.executeQuery("select * from donor");
	 while(rs.next())
{
out.println("<tr><td>");
out.println(rs.getString(1));
out.println("<td>");
out.println(rs.getString(2));
out.println("<td>");
out.println(rs.getString(3));
out.println("<td>");
out.println(rs.getString(4));
out.println("<td>");
out.println(rs.getString(5));
out.println("<td>");
out.println(rs.getString(6));
out.println("<td>");
out.println(rs.getString(7));
out.println("</tr>");
}
		 }
	 
catch(Exception e) {}
	 
out.println("</body>");
out.println("</html>");
out.println("<br><br><br>");
}
   
public void destroy()
{
System.out.println("this is destroy");
}}
