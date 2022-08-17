package ProcedimientoAlmacenado;

import java.sql.*;

import javax.swing.JOptionPane;

public class actualizaProductos {
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nPrecio = Integer.parseInt(JOptionPane.showInputDialog("Introduce precio"));
		String nArticulo = JOptionPane.showInputDialog("Introduce nombre artículo");
		
		try {
	
			Connection miConexion = DriverManager.getConnection(URL, USER, PASS);
			
			//Este objeto se utiliza para ejecutar procedimientos almacenados en la base de datos con envío de parámetros
			CallableStatement miSentencia = miConexion.prepareCall("{call ACTUALIZA_PROD(?,?)}");
			miSentencia.setInt(1, nPrecio);
			miSentencia.setString(2, nArticulo);
			miSentencia.execute();
			System.out.println("Producto actualizado");
			
			/*
			  En SQL debe existir un procedimiento almacenado que se crea con la siguiente sintaxis:
			  
			  CREATE PROCEDURE ACTUALIZA_PROD(N_PRECIO INT, N_ART VARCHAR(20));
			  UPDATE PRODUCTOS SET PRECIO = N_PRECIO WHERE NOMBREARTICULO = N_ART;
			  
			 */
			
			miConexion.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
