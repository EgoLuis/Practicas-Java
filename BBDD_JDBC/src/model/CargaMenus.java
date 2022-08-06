package model;

import java.sql.*;

public class CargaMenus {
	
	private Conexion miConexion;
	public ResultSet rs;
	public ResultSet rs2;
	
	public CargaMenus() {
		miConexion = new Conexion();
		
	}
	
	public String ejecutaConsultas() {
		
		Productos miProducto = null;
		Connection accesoBBDD = miConexion.dameConexion();
		String sql = "SELECT DISTINCTROW SECCION FROM PRODUCTOS";
		String sql2 = "SELECT DISTINCTROW PAISDEORIGEN FROM PRODUCTOS";
		
		try {
			Statement secciones = accesoBBDD.createStatement();
			Statement paises = accesoBBDD.createStatement();
			rs = secciones.executeQuery(sql);
			rs2 = paises.executeQuery(sql2);
			miProducto = new Productos();
			miProducto.setSeccion(rs.getString("SECCION"));
			miProducto.setPaisOrigen(rs2.getString("PAISDEORIGEN"));
			rs.close();
			rs2.close();
			accesoBBDD.close();
			
			
		} catch (Exception e) {
			
		}
		return miProducto.getSeccion();
		
	}

}
