package JDBC_JavaDeveloper;

import java.sql.*;

public class JDBC2_Connection {
	private static String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	private static String USERNAME = "root";
	private static String PASSWORD = "rootpw";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("Conexion exitosa");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (Exception e) {

		}
	}
}

