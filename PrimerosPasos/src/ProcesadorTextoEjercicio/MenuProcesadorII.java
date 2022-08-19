package ProcesadorTextoEjercicio;

import javax.swing.JFrame;

public class MenuProcesadorII extends JFrame {
	
	public MenuProcesadorII() {
		setBounds(500,300,550,400);
		LaminaProcesadorIII milamina = new LaminaProcesadorIII();
		add(milamina);
		setVisible(true);
	}
	

}
