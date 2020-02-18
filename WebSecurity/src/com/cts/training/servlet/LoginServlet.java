package com.cts.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
	    String user=req.getParameter("username");
	    String pass=req.getParameter("password");
	    RequestDispatcher rd=null;
	    
	    if(user.equalsIgnoreCase("admin")&& pass.equals("admin@123"))
	    
	    {
	    	rd=req.getRequestDispatcher("admin.jsp");
	    	rd.forward(req, resp);
	    	
	    }
	    else {
	    	out.println("<h2 style=\"color:red;\">Something went wrong...Please try Again</h2>");
	    	rd=req.getRequestDispatcher("loginPage.jsp");
	    	rd.include(req,resp);
	    	
	      }
		super.doPost(req, resp);
	}

}
