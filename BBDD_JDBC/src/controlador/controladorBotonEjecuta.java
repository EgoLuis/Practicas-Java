package controlador;

import java.awt.event.*;
import java.sql.*;
import model.*;
import vista.*;

public class controladorBotonEjecuta implements ActionListener {
	
	private Marco_Aplicacion2 elmarco;
	private ejecutaConsultas obj = new ejecutaConsultas();
	private ResultSet resultadoConsulta;
	
	public controladorBotonEjecuta(Marco_Aplicacion2 elmarco) {
		this.elmarco = elmarco;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String seleccionSeccion = elmarco.secciones.getSelectedItem().toString();
		
		String seleccionPais = elmarco.paises.getSelectedItem().toString();
		
		resultadoConsulta = obj.filtraBBDD(seleccionSeccion, seleccionPais);
		
		try {
			elmarco.resultado.setText("");
			while(resultadoConsulta.next()) {
				elmarco.resultado.append(resultadoConsulta.getString("NOMBREARTICULO"));
				elmarco.resultado.append(", ");
				elmarco.resultado.append(resultadoConsulta.getString("SECCION"));
				elmarco.resultado.append(", ");
				elmarco.resultado.append(resultadoConsulta.getString("PRECIO"));
				elmarco.resultado.append(", ");
				elmarco.resultado.append(resultadoConsulta.getString("PAISDEORIGEN"));
				elmarco.resultado.append("\n");
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
	}

}
