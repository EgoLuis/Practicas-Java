package ProcedimientoAlmacenado;

import java.sql.*;

public class consultaClientes {
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	
			Connection miConexion = DriverManager.getConnection(URL, USER, PASS);
			
			//Este objeto se utiliza para ejecutar procedimientos almacenados en la base de datos
			CallableStatement miSentencia = miConexion.prepareCall("{call MUESTRA_CLIENTES}");
			
			/*
			  En SQL debe existir un procedimiento almacenado que se crea con la siguiente sintaxis:
			  
			  CREATE PROCEDURE MUESTRA_CLIENTES();
			  SELECT * FROM CLIENTES WHERE POBLACION = 'BARCELONA';
			  
			 */
			
			ResultSet rs = miSentencia.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			rs.close();
		
			miConexion.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
