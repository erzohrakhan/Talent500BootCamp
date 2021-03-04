package com.expresso.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnectionUtil {

	static private Connection connection;
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/expresso";
	public static final String USER_NAME = "expresso";
	public static final String PASSWORD = "Expresso123";

	public static Connection getConnection() throws SQLException {
		connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		return connection;
	}
}
