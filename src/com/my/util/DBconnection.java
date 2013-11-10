package com.my.util;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnection {

	public static Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Connection established successfully");
		}

		return con;
	}

	public static void closeConnection(Connection conn) {
		// TODO Auto-generated method stub
		
	}
}
