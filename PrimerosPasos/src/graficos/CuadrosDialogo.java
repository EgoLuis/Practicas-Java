package graficos;

import java.awt.event.*;
import javax.swing.*;

public class CuadrosDialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadros_Dialogos mimarco = new Cuadros_Dialogos();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}


class Cuadros_Dialogos extends JFrame {
	
	public Cuadros_Dialogos() {
		setBounds(500,300,400,250);
		add(new Lamina_Cuadros_Dialogos());
	}
	
}


class Lamina_Cuadros_Dialogos extends JPanel {
	
	JButton boton1, boton2, boton3, boton4, boton5;
	
	public Lamina_Cuadros_Dialogos() {
		boton1 = new JButton("Bot�n 1");
		boton2 = new JButton("Bot�n 2");
		boton3 = new JButton("Bot�n 3");
		boton4 = new JButton("Bot�n 4");
		boton5 = new JButton("Bot�n 5");
		
		boton1.addActionListener(new Accion_botones());
		boton2.addActionListener(new Accion_botones());
		boton3.addActionListener(new Accion_botones());
		boton4.addActionListener(new Accion_botones());
		boton5.addActionListener(new Accion_botones());
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		
	}


	class Accion_botones implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==boton1) {
				JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Has pulsado el bot�n 1");
				
			} else if (e.getSource()==boton2) {
				JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Has pulsado el bot�n 2","Bot�n 2", 0);
				
			} else if (e.getSource()==boton3) {
				JOptionPane.showInputDialog(Lamina_Cuadros_Dialogos.this, "Introduce nombre", "Bot�n 3", 2);
				
			} else if (e.getSource()==boton4) {
				JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this, "Elige opci�n", "Bot�n 4", 0);
				
			} else if (e.getSource()==boton5) {
				JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogos.this, "Elige", "Bot�n 5", 1, 1, null, null, null);
			}
		
		}
	
	}
}