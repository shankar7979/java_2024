package com.coforge.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	private static Connection connection;

	static {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getMyConnection() throws SQLException {
		if (connection == null)
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge_db", "root", "mysql");
		return connection;
	}

}
