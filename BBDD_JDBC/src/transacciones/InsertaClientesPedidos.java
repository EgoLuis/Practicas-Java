package transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertaClientesPedidos {
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection miConexion = null;
		
try {
			
			miConexion = DriverManager.getConnection(URL, USER, PASS);
			
			miConexion.setAutoCommit(false); //con eto evitamos que se ejecuten las instrucciones individualmente
			
			Statement miStatement = miConexion.createStatement();
			
			String instruccionSql_1 = "INSERT INTO CLIENTES (CODIGOCLIENTE, EMPRESA, DIRECCION) "
								+ "VALUES ('CT84', 'EJEMPLO1', 'P.  BOTANICO')";
			
			miStatement.executeUpdate(instruccionSql_1);
	
			String instruccionSql_2 = "INSERT INTO PEDIDOS (NUMEROPEDIDO, CODIGOCLIENTE, FECHADEPEDIDO) "
					+ "VALUES ('82', 'CT84', '2022-08-24')";

			miStatement.executeUpdate(instruccionSql_2);
			
			System.out.println("Datos insertados correctamente");
			
			miConexion.commit(); //si todo va bien, ejecuta las instrucciones como bloque
		
			miConexion.close();
			
		} catch (Exception e) {
			System.out.println("Error en la inserción de datos");
			
			try {
				miConexion.rollback(); //si alguna instruccion falla regresa al estado inicial antes de ejecutar el bloque
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}

	}

}
