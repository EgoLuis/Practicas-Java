package conectaBD;

import java.sql.*;

public class ConsultaPreparada {
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";

	public static void main(String[] args) {
		
		try {
			//1. CREAR CONEXION
			Connection miConexion = DriverManager.getConnection(URL, USER, PASS);
			
			//2. PREPARAR CONSULTA
			String sql = "SELECT NOMBREARTICULO, SECCION, PAISDEORGEN FROM PRDUCTOS WHERE SECCION = ? AND PAISDEORIGEN = ?";
			PreparedStatement miSentencia = miConexion.prepareStatement(sql);
			
			//3. ESTABLECER PARAMETROS DE CONSULTA
			miSentencia.setString(1, "Deportes");
			miSentencia.setString(2, "Italia");
			
			//4. EJECUTAR Y RECORRER CONSULTA
			ResultSet rs = miSentencia.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("NOMBREARTICULO") + " " 
									+ rs.getString("SECCION") + " " 
									+ rs.getString("PAISDEORGEN")
									);
			}
			
			rs.close();
			
			//5. REUTILIZACION DE CONSULTA SQL
			System.out.println("EJECUCION SEGUNDA CONSULTA\n");
			miSentencia.setString(1, "Ceramica");
			miSentencia.setString(2, "China");
			rs = miSentencia.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("NOMBREARTICULO") + " " 
									+ rs.getString("SECCION") + " " 
									+ rs.getString("PAISDEORGEN")
									);
			}
			rs.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
