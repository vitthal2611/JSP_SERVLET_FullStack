package com.etp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {

	// init service destroy

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String userName = request.getParameter("userName");

		String userPass = request.getParameter("userPass");

		PrintWriter writer = response.getWriter();

		if (userName.equalsIgnoreCase("Test")) {

			writer.println("<html><body>");

			writer.println("Welcome dear User : " + userName);
			writer.println("</body></html>");

		} else {
			writer.println("<html><body>");
			writer.println("Enter Correct UserName ");
			writer.println("</body></html>");
		}
		writer.close();

	}

}
