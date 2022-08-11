package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ejemplo_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_radio mimarco = new Marco_radio();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco_radio extends JFrame {
	
	public Marco_radio() {
		setBounds(550,300,500,300);
		Lamina_radio milamina = new Lamina_radio();
		add(milamina);
		setVisible(true);
	}
}


class Lamina_radio extends JPanel {
	
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;
	private ButtonGroup migrupo;
	private JPanel lamina_botones;
	
	public Lamina_radio() {
		
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		texto.setFont(new Font("Serif", Font.PLAIN, 12));
		add(texto, BorderLayout.CENTER);
		lamina_botones = new JPanel();
		migrupo = new ButtonGroup();
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy Grande", false, 24);
		add(lamina_botones, BorderLayout.SOUTH);
	}
	
	public void colocarBotones(String nombre, boolean seleccionado, final int tamano) {
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		migrupo.add(boton);
		lamina_botones.add(boton);
		
		ActionListener mievento = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif", Font.PLAIN, tamano));
			}
		};
		boton.addActionListener(mievento);
	}

}

