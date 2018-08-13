package com.cg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.service.Service;
import com.cg.service.ServiceInterface;

/**
 * @author Himanshu Kumar Guliya 
 *   Controller class of controller layer of Shopping Cart
 */
@WebServlet("*.app")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Instantiate Service class with reference of ServiceInterface
		ServiceInterface bookShopService = new Service();

		// creating HttpSession
		HttpSession session = request.getSession();
		String action = request.getServletPath();

		switch (action) {
		// To open homepage
		case "/home.app":
			session.setAttribute("books", bookShopService.allBooks());
			session.setAttribute("cart", bookShopService.viewCart());
			response.sendRedirect("home.jsp");
			break;

		// To add books into cart
		case "/add.app":
			int id = Integer.parseInt(request.getParameter("bookId"));
			bookShopService.addToCart(id);
			response.sendRedirect("home.jsp");
			break;
			
		// To open cart
		case "/view.app":
			session.setAttribute("cart", bookShopService.viewCart());
			response.sendRedirect("cart.jsp");
			break;

		// To remove objects from cart
		case "/remove.app":
			int id1 = Integer.parseInt(request.getParameter("bookId"));
			bookShopService.removeFromCart(id1);
			session.setAttribute("cart", bookShopService.viewCart());
			response.sendRedirect("cart.jsp");
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
