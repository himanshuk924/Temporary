package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("*.app")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		//Create Session
		HttpSession session = request.getSession();
		
		switch (action) {
		//For login
		case "/login.app":
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			if (username.equals("admin") && password.equals("admin")) {
				session = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("Success.jsp");
			} else
				response.sendRedirect("Error.jsp");
			break;
			
		//For logout
		case "/logout.app":
			response.sendRedirect("login.jsp");
			session.invalidate();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
