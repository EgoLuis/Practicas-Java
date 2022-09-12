package Layouts;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;

public class DisposicionLibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLibre mimarco = new MarcoLibre();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoLibre extends JFrame {
	public MarcoLibre() {
		setBounds(450,350,600,400);
		LaminaLibre milamina = new LaminaLibre();
		add(milamina);
		setVisible(true);
	}
	
}

class LaminaLibre extends JPanel {
	public LaminaLibre() {
		setLayout(new LayoutPersonalizada());
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JLabel edad = new JLabel("Edad: ");
		JLabel telefono = new JLabel("Teléfono: ");
		JTextField c_nombre = new JTextField();
		JTextField c_apellido = new JTextField();
		JTextField c_edad = new JTextField();
		JTextField c_telefono = new JTextField();
		/*
		nombre.setBounds(20, 20, 80, 20);
		c_nombre.setBounds(100, 20, 100, 20);
		apellido.setBounds(20, 60, 80, 20);
		c_apellido.setBounds(100, 60, 100, 20);
		*/
		add(nombre);
		add(c_nombre);
		add(apellido);
		add(c_apellido);
		add(edad);
		add(c_edad);
		add(telefono);
		add(c_telefono);
	}
	
}


class LayoutPersonalizada implements LayoutManager {
	
	private int x;
	private int y = 20;

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void layoutContainer(Container parent) {
		// TODO Auto-generated method stub
		int dim = parent.getWidth();
		x = dim / 2;
		int contador = 0;
		int n = parent.getComponentCount();
		for(int i = 0; i < n; i++) {
			contador++;
			Component c = parent.getComponent(i);
			c.setBounds(x-100, y, 100, 20);
			x += 100;
			if(contador % 2 == 0) {
				x = dim / 2;
				y += 40;
			}
		}
		
	}
	
}





