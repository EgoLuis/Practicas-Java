package conectaBD;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Aplicacion_Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mimarco = new Marco_Aplicacion();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}
}

class Marco_Aplicacion extends JFrame {
	
	private JComboBox secciones;
	private JComboBox paises;
	private JTextArea resultado;
	private Connection miConexion;
	private PreparedStatement enviaConsultaSeccion;
	private PreparedStatement enviaConsultaPais;
	private PreparedStatement enviaConsultaCompleta;
	private PreparedStatement enviaConsultaTodos;
	private final String consultaSeccion = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM productos "
											+ "WHERE SECCION = ?";
	private final String consultaPais = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM productos "
											+ "WHERE PAISDEORIGEN = ?";
	private final String consultaCompleta = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM productos "
											+ "WHERE SECCION = ? AND PAISDEORIGEN = ?";
	private final String consultaTodos = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM productos";
	
	
	private static String URL = "jdbc:mysql://localhost:3306/pruebas";
	private static String USER = "root";
	private static String PASS = "Huge360S";
	
	public Marco_Aplicacion() {
		
		//--------CONSTRUCCION DEL MARCO DE LA APP-------
		setTitle ("Consulta BBDD");
		setBounds(500,300,400,400);
		setLayout(new BorderLayout());
		JPanel menus = new JPanel();
		menus.setLayout(new FlowLayout());
		secciones = new JComboBox();
		secciones.setEditable(false);
		secciones.addItem("Todos");
		paises = new JComboBox();
		paises.setEditable(false);
		paises.addItem("Todos");
		resultado = new JTextArea(4,50);
		resultado.setEditable(false);
		add(resultado);
		menus.add(secciones);
		menus.add(paises);
		add(menus, BorderLayout.NORTH);
		add(resultado, BorderLayout.CENTER);
		JButton botonConsulta = new JButton("Consulta");
		
		botonConsulta.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				ejecutaConsulta();
			}
		});
		
		add(botonConsulta, BorderLayout.SOUTH);
		
		
		//-------CONEXION CON BBDD---------
		try {
			miConexion = DriverManager.getConnection(URL, USER, PASS);
			
			//------RELLENAR COMBOBOX CON LAS SECCIONES------
			String sql = "SELECT DISTINCT SECCION FROM productos"; 
			Statement sentencia = miConexion.createStatement();
			ResultSet rs = sentencia.executeQuery(sql);
			while(rs.next()) {
				secciones.addItem(rs.getString(1));
			}
			rs.close();
			
			//------RELLENAR COMBOBOX CON LOS PAISES------
			sql = "SELECT DISTINCT PAISES FROM productos"; 
			rs = sentencia.executeQuery(sql);
			while(rs.next()) {
				paises.addItem(rs.getString(1));
			}
			rs.close();
			
			
			
			
			miConexion.close();
			
		} catch (Exception e) {
			
		}
	}
	
	
	
	//-------METODO QUE EJECUTA LA CONSULTA Y SERA LLAMADO POR EL BOTON--------
	private void ejecutaConsulta() {
		
		ResultSet rs = null; 
		 try {	
			 resultado.setText("");
			 String seccion = secciones.getSelectedItem().toString();
			 String pais = secciones.getSelectedItem().toString();
			 
			 if(!seccion.equals("Todos") && paises.equals("Todos")) {
				 enviaConsultaSeccion = miConexion.prepareStatement(consultaSeccion);
				 enviaConsultaSeccion.setString(1, seccion);
				 rs = enviaConsultaSeccion.executeQuery();
				 
			 } else if(seccion.equals("Todos") && !paises.equals("Todos")) {
				 enviaConsultaPais = miConexion.prepareStatement(consultaPais);
				 enviaConsultaPais.setString(1, pais);
				 rs = enviaConsultaPais.executeQuery();	
				 
			 } else if(!seccion.equals("Todos") && !paises.equals("Todos")){
				 enviaConsultaCompleta = miConexion.prepareStatement(consultaCompleta);
				 enviaConsultaCompleta.setString(1, seccion);
				 enviaConsultaCompleta.setString(2, pais);
				 rs = enviaConsultaCompleta.executeQuery();
			 } else {
				 enviaConsultaTodos = miConexion.prepareStatement(consultaTodos);
				 rs = enviaConsultaTodos.executeQuery();	 
			 }
			 
			 while(rs.next()) {
				 resultado.append(rs.getString(1));
				 resultado.append(", ");
				 resultado.append(rs.getString(2));
				 resultado.append(", ");
				 resultado.append(rs.getString(3));
				 resultado.append(", ");
				 resultado.append(rs.getString(4));
				 resultado.append("\n");
			 }
			 
		 } catch (Exception e) {
			 
		 }
		 
		 
		
	}
	
}
