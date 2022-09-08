package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Barra_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBarra mimarco = new MarcoBarra();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoBarra extends JFrame {
	
	public MarcoBarra() {
		setTitle("Marco con Barra");
		setBounds(500,300,600,450);
		lamina = new JPanel();
		add(lamina);
		
		Action accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.gif"), Color.YELLOW);
		Action accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.gif"), Color.BLUE);
		Action accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.gif"), Color.RED);
		Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/graficos/icono.gif")) {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		
		JMenu menu = new JMenu("Color");
		menu.add(accionAmarillo);
		menu.add(accionAzul);
		menu.add(accionRojo);
		
		JMenuBar barra_menus = new JMenuBar();
		barra_menus.add(menu);
		
		setJMenuBar(barra_menus);
		
		JToolBar barra = new JToolBar();
		barra.add(accionAmarillo);
		barra.add(accionAzul);
		barra.add(accionRojo);
		barra.addSeparator();
		barra.add(accionSalir);
		add(barra, BorderLayout.NORTH);
		
	}
	
	private class AccionColor extends AbstractAction {
		
		public AccionColor(String nombre, Icon icono, Color c) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo... " + nombre);
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("Color");
			setBackground(c);
			lamina.setBackground(c);
		}
	}
	
	private JPanel lamina;
}





