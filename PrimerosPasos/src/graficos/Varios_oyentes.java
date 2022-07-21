package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Varios_oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Principal mimarco = new Marco_Principal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}
}

class Marco_Principal extends JFrame{
	public Marco_Principal() {
		setTitle("Prueba varios");
		setBounds(1300,100,300,200);
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);
	}
}


class Lamina_Principal extends JPanel{
	
	JButton boton_cerrar;	
	
	private class OyenteNuevo implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
		}
	}
	
	public Lamina_Principal(){
		JButton boton_nuevo = new JButton("Nuevo");
		add(boton_nuevo);
		boton_cerrar = new JButton("Cerrar todo");
		add(boton_cerrar);
		OyenteNuevo miOyente = new OyenteNuevo();
		boton_nuevo.addActionListener(miOyente);
		
	}
}


class Marco_Emergente extends JFrame{
	
	private static int contador = 1;
	
	private class CierraTodos implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			contador = 1;
		}
	}
	
	
	public Marco_Emergente(JButton boton_de_principal) {
		setTitle("Ventana " + contador);
		contador++;
		setBounds(40*contador,40*contador,300,150);
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
	}
}





