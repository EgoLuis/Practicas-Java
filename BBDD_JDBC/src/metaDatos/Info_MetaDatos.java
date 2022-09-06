package metaDatos;

import java.sql.*;

public class Info_MetaDatos {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		mostrarInfo_BBDD();
		mostrarInfo_Tablas();

	}

	
	static void mostrarInfo_BBDD() throws SQLException {
		
		Connection miConexion = null;
		
		try {
			miConexion = DriverManager.getConnection(URL, USER, PASS);
			//Obtención de metadatos
			DatabaseMetaData datosBBDD = miConexion.getMetaData();
			
			//Mostar info de la BBDD
			System.out.println("Gestor de BBDD: " + datosBBDD.getDatabaseProductName());
			System.out.println("Versión del gestor: " + datosBBDD.getDatabaseProductVersion());
			System.out.println("Nombre del driver: " + datosBBDD.getDriverName());
			System.out.println("Versión del driver: " + datosBBDD.getDriverVersion());
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			miConexion.close();
		}
	}
	
	
	static void mostrarInfo_Tablas() throws SQLException {
			
			Connection miConexion = null;
			ResultSet miResultSet = null;
			
			try {
				miConexion = DriverManager.getConnection(URL, USER, PASS);
				//Obtención de metadatos
				DatabaseMetaData datosBBDD = miConexion.getMetaData();
				
				//Mostar nombre de las Tablas
				System.out.println("Tablas existentes:");
				miResultSet = datosBBDD.getTables(null, null, null, null);
				while(miResultSet.next()) {
					System.out.println(miResultSet.getString("TABLE_NAME"));
				}
				
				//Lista de columnas de la tabla productos
				System.out.println("");
				System.out.println("Campos de Productos:");
				miResultSet = datosBBDD.getColumns(null, null, "productos", null);
				while(miResultSet.next()) {
					System.out.println(miResultSet.getString("COLUMN_NAME"));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				miConexion.close();
			}
		}
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";
	
}

