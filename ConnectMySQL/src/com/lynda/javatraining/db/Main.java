package com.lynda.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

public class Main {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "Huge360S";
	private static final String CONN_STRING ="jdbc:mysql://localhost:3306/explorecalifornia";
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		
		try {	
			System.out.println("intentando conectar");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			System.out.println("Connected!");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {		
			System.out.println("Aqui esta el fnally");
			if(conn != null) {
				conn.close();
			}		
		}
		
	}

}
