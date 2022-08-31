package transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class TransaccionProductos {
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection miConexion = null;
		
try {
			
			miConexion = DriverManager.getConnection(URL, USER, PASS);
			
			miConexion.setAutoCommit(false); 
			
			Statement miStatement = miConexion.createStatement();
			
			String instruccionSql_1 = "DELETE FROM PRODUCTOS WHERE PAISDEORIGEN = 'ITALIA'";
	
			String instruccionSql_2 = "DELETE FROM PRODUCTOS WHERE PRECIO > 300";
			
			String instruccionSql_3 = "UPDATE PRODUCTOS SET PRECIO = PRECIO * 1.15";
			
			boolean ejecutar = ejecutarTransaccion();
			
			if(ejecutar) {
				miStatement.executeUpdate(instruccionSql_1);
				miStatement.executeUpdate(instruccionSql_2);
				miStatement.executeUpdate(instruccionSql_3);
				miConexion.commit(); 
				System.out.println("Transacción ejecutada exitosamente");
			} else {
				System.out.println("No se ejecutó ningun cambio en la Base de Datos");
			}
			
			miConexion.close();
			
		} catch (Exception e) {
				
			try {
				miConexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Algo salió mal y no se realizó cambio en Base de Datos");

		}

	}
	
	static boolean ejecutarTransaccion() {
		
		String ejecucion = JOptionPane.showInputDialog("¿Ejecutar transacción?");
		if(ejecucion.equals("Sí")) return true;
		else return false;
	}

}
