package com.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegistrationServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome</h1>");
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		String condition = request.getParameter("condition");
		if (condition.equals("checked")) {
			out.println("<h1>Name: </h1>" + name);
			out.println("<h1>Password: </h1>" + password);
			out.println("<h1>Email: </h1>" + email);
			out.println("<h1>Gender: </h1>" + gender);
			out.println("<h1>Course: </h1>" + course);
			
		} else {
			out.println("<h1>You have not accepted terms and conditions</h1>");
		}
	}
}