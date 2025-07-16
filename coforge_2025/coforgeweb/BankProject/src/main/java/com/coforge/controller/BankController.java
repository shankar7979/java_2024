package com.coforge.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.coforge.model.BankLogin;

@WebServlet("/BankController")
public class BankController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BankLogin login = new BankLogin();

		login.setId(Integer.parseInt(request.getParameter("id")));
		login.setName(request.getParameter("name"));
		login.setBtype(request.getParameter("btype"));

		request.setAttribute("login", login);

		var btype = request.getParameter("btype");
		response.setContentType("text/html");
		
		response.getWriter().print("<h2> Controller page</h2>");

		RequestDispatcher dispatcher;
		if (btype.equals("saving")) {
          dispatcher=request.getRequestDispatcher("savingpage.jsp");
//          dispatcher.forward(request, response);
          dispatcher.include(request, response);
		}
		
		if (btype.equals("current")) {
			dispatcher=request.getRequestDispatcher("currentpage.jsp");
			dispatcher.forward(request, response);
		}
		
		if (btype.equals("demate")) {
			dispatcher=request.getRequestDispatcher("dematepage.jsp");
			dispatcher.forward(request, response);
		}
		

	}

}
