package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejemplo2AreaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}
}


class MarcoPruebaArea extends JFrame {
	
	private JPanel laminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
	
	public MarcoPruebaArea() {
		
		setTitle("Probando �rea de texto");
		setBounds(500,300,500,350);
		setLayout(new BorderLayout());
		
		laminaBotones = new JPanel();
		botonInsertar = new JButton("Insertar");
		botonSaltoLinea = new JButton("Salto L�nea");
		
		botonInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme... ");
			}
		});
		
		botonSaltoLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean saltar = !areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
				
				/*
				if(saltar) {
					botonSaltoLinea.setText("Quitar salto");
				} else {
					botonSaltoLinea.setText("Salto L�nea");
				}
				*/
				botonSaltoLinea.setText(saltar ? "Quitar salto" : "Salto L�nea");
			}
		});
		
		laminaBotones.add(botonInsertar);
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaBotones, BorderLayout.SOUTH);
		
		areaTexto = new JTextArea(8,20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
		
		
	}
	
	
}
