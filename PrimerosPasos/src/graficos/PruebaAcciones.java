package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoAccion extends JFrame {
	
	public MarcoAccion() {
		setTitle("Prueba Acciones");
		setBounds(600,350,600,300);
		PanelAccion lamina = new PanelAccion();
		add(lamina);
	}
	
}

class PanelAccion extends JPanel {
	
	public PanelAccion() {
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.gif"), Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.gif"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.gif"), Color.RED);
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		//Codigo para que los eventos funcionen con atajos de teclado
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl Y");
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
		mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		mapaEntrada.put(teclaAzul, "fondo_azul");
		mapaEntrada.put(teclaRojo, "fondo_rojo");
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo",accionAmarillo);
		mapaAccion.put("fondo_azul",accionAzul);
		mapaAccion.put("fondo_rojo",accionRojo);
			
	}
	
	private class AccionColor extends AbstractAction {
		
		public AccionColor(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("color_de_fondo", color_boton);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("color_de_fondo");
			setBackground(c);
		
			System.out.println("Nombre: " + getValue(Action.NAME));
			System.out.println("Descripción: " + getValue(Action.SHORT_DESCRIPTION));
		}
	}
}











