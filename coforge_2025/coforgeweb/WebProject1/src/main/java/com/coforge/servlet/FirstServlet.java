package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/FirstServlet")
//@WebServlet("/Welcome")
@WebServlet(urlPatterns = {"/Welcome","/FirstServlet","/Test"})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int c;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init  called");
		c = 1;
	}

	public void destroy() {
		System.out.println("destroy   called..");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet/service   called");

//		PrintWriter printWriter=response.getWriter();
//		PrintWriter out=response.getWriter();
		var out = response.getWriter();
        out.print("<br> User Visit  Count  "+c++);
		
	}

}
