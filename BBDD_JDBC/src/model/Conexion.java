package model;

import java.sql.*;

public class Conexion {
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";
	Connection miConexion = null;
	
	public Conexion() {
		
	}
	
	public Connection dameConexion() {
		
		try {
			miConexion = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
				
		}
		
		return miConexion;
	}

}
