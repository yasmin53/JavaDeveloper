package com.cts.training.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		out.println("Hello to servlet");
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		String repassword=request.getParameter("repass");
		String phonenumber=request.getParameter("phone");
		String email=request.getParameter("email");
	
		
		
		
		
		out.println("Username:"+username);
		out.println("Password:"+password);
		out.println("RePassword:"+repassword);
		out.println("PhoneNumber:"+phonenumber);
		out.println("Email:"+email);
		
		
	}

	

}
