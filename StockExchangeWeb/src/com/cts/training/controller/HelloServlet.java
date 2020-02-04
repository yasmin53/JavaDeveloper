package com.cts.training.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/helloServlet")

public class HelloServlet extends HttpServlet{
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
	
		PrintWriter out=response.getWriter();
		
		
		out.prinltn("hello servlet");
		
	}
}







