package conectaBD;

import java.sql.*;

public class Conecta_Pruebas {
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection miConexion = DriverManager.getConnection(URL, USER, PASS);
			
			String sql = "SELECT * FROM productos"; 
			
			Statement miStatement = miConexion.createStatement();
			
			ResultSet miResultSet = miStatement.executeQuery(sql);
			
			while (miResultSet.next()) {
				System.out.println(miResultSet.getString("CODIGOARTICULO") + " " 
									+ miResultSet.getString("NOMBREARTICULO") + " " 
									+ miResultSet.getFloat("PRECIO")
									);
			}
			
			miResultSet.close();
			miConexion.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
