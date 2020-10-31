package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.ws.http.HTTPException;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws HTTPException, ServletException, IOException {
		System.out.println("This is get method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>This is the doGet method of servlet</h1>");
		out.println(new Date().toString());
	}
}
