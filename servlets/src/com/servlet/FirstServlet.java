package com.servlet;

import java.io.IOException;

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
