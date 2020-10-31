package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("This is the implementation of servlet using generic servlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1> This is again a servlet using generic class</h1>");
	}

}
