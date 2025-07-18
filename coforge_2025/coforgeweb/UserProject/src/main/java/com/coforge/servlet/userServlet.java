package com.coforge.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int id;
	String name;
	String password;

	String url;
	String user;
	String dbpassword;
	String driver;

	Connection connection;
	PreparedStatement preparedStatement;

	ServletContext context;

	@Override
	public void init(ServletConfig config) throws ServletException {

		context = config.getServletContext();
		try {
			// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			url = context.getInitParameter("url");
			user = context.getInitParameter("user");
			dbpassword = context.getInitParameter("pass");
			driver = context.getInitParameter("driver");

			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, dbpassword);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		id = Integer.parseInt(request.getParameter("id"));
		name = request.getParameter("name");
		password = request.getParameter("password");

		try {
			preparedStatement = connection
					.prepareStatement("select * from user1 where id=? and  name=? and password=?");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, password);

			ResultSet resultSet = preparedStatement.executeQuery();

			RequestDispatcher dispatcher;

			if (resultSet.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				session.setAttribute("name", name);

				dispatcher = request.getRequestDispatcher("userSuccess.jsp");
				dispatcher.forward(request, response);
			} else {
				dispatcher = request.getRequestDispatcher("userFailure.jsp");
				dispatcher.forward(request, response);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
