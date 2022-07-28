package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection miConexion = DriverManager.getConnection(URL, USER, PASS);
			
			String sqlInserta = "INSERT INTO productos (CODIGOARTICULO, NOMBREARTCULO, PRECIO) "
								+ "VALUES ('AR07', 'PANTALON', 25.35)"; 
			
			String sqlActualiza = "UPDATE productos SET PRECIO = PRECIO *2 WHERE CODIGOARTICULO = 'AR07'";
			
			String sqlBorrar = "DELETE FROM productos WHERE CODIGOARTICULO = 'AR07'";
			
			Statement miStatement = miConexion.createStatement();
			
			miStatement.executeUpdate(sqlInserta);
			miStatement.executeUpdate(sqlActualiza);
			miStatement.executeUpdate(sqlBorrar);
			
			
		
			
			miConexion.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
