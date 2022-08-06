package controlador;

import java.awt.event.*;
import model.*;
import vista.*;

public class controladorCargaMenus extends WindowAdapter {
	
	private CargaMenus obj = new CargaMenus();
	private Marco_Aplicacion2 elmarco;
	
	public controladorCargaMenus(Marco_Aplicacion2 elmarco) {
		this.elmarco = elmarco;
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		obj.ejecutaConsultas();
		
		try {
			
			while(obj.rs.next()) {
				elmarco.secciones.addItem(obj.rs.getString("SECCIONES"));
			}
			
			while(obj.rs2.next()) {
				elmarco.paises.addItem(obj.rs2.getString("PAISDEORIGEN"));
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	
}
