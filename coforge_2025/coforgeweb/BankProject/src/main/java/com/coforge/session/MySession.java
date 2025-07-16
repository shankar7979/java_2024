package com.coforge.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Date;

@WebServlet("/MySession")
public class MySession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		HttpSession session = request.getSession();
		var session = request.getSession();
		var out = response.getWriter();
		response.setContentType("text/html");

		out.print("<h2>Session Program </h2>");
		out.print("<p>Session id " + session.getId());
		out.print("<p>Session inactive time interval " + session.getMaxInactiveInterval());
		
		out.print("<p>Session create time " + new Date(session.getCreationTime()));
		out.print("<p>Session last accessed " + new Date(session.getLastAccessedTime()));
		
		
	}

}
