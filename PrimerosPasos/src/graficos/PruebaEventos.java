package graficos;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700,300,500,300);
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
	}
	
}
/*
class LaminaBotones extends JPanel implements ActionListener{ //es necesario implementar esta interfaz cuando creamos eventos
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		botonAzul.addActionListener(this); //Aqui estamos diciendo que el botonAzul desencadenara un evento y el "this" se refiere a que el evento afectara a la propia lamina
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource(); //con este método se obtiene cual es el objeto que desencadenara la accion (botonazul, rojo o amarillo)
		
		if(botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		}else if(botonPulsado == botonRojo) {
			setBackground(Color.RED);
		}else if(botonPulsado == botonAmarillo) {
			setBackground(Color.YELLOW);
		}
	}
	*/

	//Segunda forma de hacer el ejercicio anterior
	class LaminaBotones extends JPanel{
		
		JButton botonAzul = new JButton("Azul");
		JButton botonAmarillo = new JButton("Amarillo");
		JButton botonRojo = new JButton("Rojo");
		
		public LaminaBotones() {
			
			add(botonAzul);
			add(botonAmarillo);
			add(botonRojo);
			ColorFondo AmarilloF = new ColorFondo(Color.YELLOW);
			ColorFondo AzulF = new ColorFondo(Color.BLUE);
			ColorFondo RojoF = new ColorFondo(Color.RED);
			botonAzul.addActionListener(AzulF); 
			botonAmarillo.addActionListener(AmarilloF);
			botonRojo.addActionListener(RojoF);
			
		}
		
		private class ColorFondo implements ActionListener{

			public ColorFondo(Color c) {
				colorDeFondo = c;
			}
			
			public void actionPerformed(ActionEvent e) {				
				setBackground(colorDeFondo);
			}
			
			private Color colorDeFondo;
		}
	}
	
	