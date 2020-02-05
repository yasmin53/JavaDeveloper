package com.cts.training.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Registration extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
PrintWriter out = response.getWriter();
	
		String email = request.getParameter("userEmail");
		
		String name = request.getParameter("userName");
		Long phone = Long.parseLong(request.getParameter("phone"));
		String password = request.getParameter("Userpass");
	
		//String Courses[] = request.getParameterValues("courses");
		String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:3306/cts";
        String dbUsername = "admin";
        String dbPassword = "admin";
		try {
		      Class.forName(dbDriver);
		      Connection con = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
            PreparedStatement st = con.prepareStatement("insert into registeruser values(?, ?, ?, ?, ?)");
           
            st.setString(1,email);
            st.setString(2,name);
           
            st.setString(3,password);
            st.setLong(4,phone);
          
            st.executeUpdate();
                        st.close();
            con.close();
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
//		out.println("id : "+Id);
//		out.println("<br>username : "+Username);	
//		out.println("<br>Email : "+Email);
//		out.println("<br>Phone : "+Phone);
//		out.println("<br>password : "+Password);
//		for(String c : Courses) {
		//out.println("<br>password : "+password);
//	}
}
}