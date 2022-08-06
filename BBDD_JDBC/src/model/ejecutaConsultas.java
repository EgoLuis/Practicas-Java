package model;
import java.sql.*;

public class ejecutaConsultas {
	
	private Conexion miConexion;
	private ResultSet rs;
	private PreparedStatement enviaConsultaSeccion;
	private PreparedStatement enviaConsultaPais;
	private PreparedStatement enviaConsultaAmbos;
	private final String consultaSeccion ="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS "
										 + "WHERE SECCION = ?";
	private final String consultaPais ="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS "
			 							 + "WHERE PAISDEORIGEN = ?";
	private final String consultaAmbos ="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS "
			 							 + "WHERE SECCION = ? AND PAISDEORIGEN = ?";
	
	public ejecutaConsultas() {
		miConexion = new Conexion();
	}
	
	
	public ResultSet filtraBBDD(String seccion, String pais) {
		
		Connection conecta = miConexion.dameConexion();
		rs = null;
		
		try {
		
			if(!seccion.equals("Todos") && pais.equals("Todos")) {
				
				enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);
				enviaConsultaSeccion.setString(1, seccion);
				rs = enviaConsultaSeccion.executeQuery();
				
				
			} else if (seccion.equals("Todos") && !pais.equals("Todos")) {
				
				enviaConsultaPais = conecta.prepareStatement(consultaPais);
				enviaConsultaPais.setString(1, pais);
				rs = enviaConsultaPais.executeQuery();
				
			} else {
				
				enviaConsultaAmbos = conecta.prepareStatement(consultaAmbos);
				enviaConsultaAmbos.setString(1, seccion);
				enviaConsultaAmbos.setString(2, pais);
				rs = enviaConsultaAmbos.executeQuery();

			}
		
		} catch (Exception e) {
			
		}
		
		return rs;
		
	}

}
