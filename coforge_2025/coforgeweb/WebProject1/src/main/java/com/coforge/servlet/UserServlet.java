package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/UserServlet")
@WebServlet("/userAction")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.print("<h1>User Data </h1>");

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		out.print("<br>Id is " + id);
		out.print("<br>Name is " + name);

		String queryString = request.getQueryString();
		out.print("<br>QueryString  is " + queryString);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.print("<h1>User Data  using post </h1>");

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		out.print("<br>Id is " + id);
		out.print("<br>Name is " + name);

		String queryString = request.getQueryString();
		out.print("<br>QueryString  is " + queryString);

	}
}
