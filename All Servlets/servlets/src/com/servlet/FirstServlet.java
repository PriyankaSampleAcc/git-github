package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;

public class FirstServlet implements Servlet {
	// Life cycle methods
	ServletConfig config;

	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Creating objects ");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Servicing ..");
		// set the content type of the response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>This is my output from servlet program </h1>");
		out.println("<h1>Today's date and time" + new Date().toString() + "</h1>");
	}

	public void destroy() {
		System.out.println("Going to destroy servlet object");
	}

	// Non lifecycle methods
	public ServletConfig getServletConfig() {
		return this.config;
	}

	public String getServletInfo() {
		return "Created by Priyanka";
	}

}
