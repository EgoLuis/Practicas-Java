package Layouts;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCalculadora mimarco = new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		

	}

}

class MarcoCalculadora extends JFrame {
	
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500,300,450,300);
		LaminaCalculadora milamina = new LaminaCalculadora();
		add(milamina);
		//pack(); //con este metodo el marco (contenedor) toma el tamaño de acuerdo con los elementos que contiene
	}
	
}


class LaminaCalculadora extends JPanel {
	
	private JPanel milamina2 = new JPanel();
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
	
	public LaminaCalculadora() {
		principio = true;
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla,BorderLayout.NORTH);
		
		milamina2.setLayout(new GridLayout(4,4)); //En los parametro de GridLayout damos el numero de filas y de columnas
		
		String[] botones ={"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
		ActionListener insertar = new InsertaNumero();
		ActionListener orden = new AccionOrden();
		for (String r:botones) { 
			if(r != "/" && r != "*" && r != "-" && r != "+" && r != "=") {
				ponerBoton(r,insertar);
			} else {
				ponerBoton(r,orden);
			}
	}
		
		add(milamina2, BorderLayout.CENTER);
		ultimaOperacion = "=";
	}
	
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);
		milamina2.add(boton);
	}
	
	
	public void calcular(double x) {
		if(ultimaOperacion.equals("+")) {
			resultado += x;
		} else if(ultimaOperacion.equals("-")) {
			resultado -= x;
		} else if(ultimaOperacion.equals("*")) {
			resultado *= x;
		} else if(ultimaOperacion.equals("/")) {
			resultado /= x;
		} else if(ultimaOperacion.equals("=")) {
			resultado = x;
		}
		 pantalla.setText(String.valueOf(resultado));
		
	}
	
	private class InsertaNumero implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String entrada = e.getActionCommand();
			if(principio) {
				pantalla.setText(" ");
				principio = false;
			}
			pantalla.setText(pantalla.getText() + entrada);
		}
	}
	
	
	private class AccionOrden implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String operacion = e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaOperacion = operacion;

			principio = true;
		}
		
	}
}



