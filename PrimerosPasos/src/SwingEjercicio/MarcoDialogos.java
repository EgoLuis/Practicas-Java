package SwingEjercicio;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.*;
import javax.swing.*;

public class MarcoDialogos extends JFrame {
	
	private LaminaBotones laminaTipo, laminaTipoMensaje, laminaMensaje, laminaConfirmar, laminaOpcion, laminaEntrada;
	private String cadenaMensaje = "Mensaje";
	private Icon iconoMensaje = new ImageIcon("src/graficos/icono.gif");
	private Object objetoMensaje = new Date();
	private Component componenteMensaje = new LaminaEjemplo();
	
	public MarcoDialogos() {
		setTitle("Prueba de diálogos");
		setBounds(500,300,600,450);
		JPanel laminaCuadricula = new JPanel();
		laminaCuadricula.setLayout(new GridLayout(2,3));
		
		String primero[] = {"Mensaje", "Confirmar", "Opción", "Entrada"};

		laminaTipo = new LaminaBotones("Tipo", primero);
		laminaTipoMensaje = new LaminaBotones("Tipo", new String[]{"ERROR_MESSAGE","INFORMATION_MESSAGE","WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"});
		laminaMensaje = new LaminaBotones("Tipo", new String[]{"Cadena", "Icono", "Componente", "Otros", "Object[]"});
		laminaConfirmar = new LaminaBotones("Tipo", new String[]{"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"});
		laminaOpcion = new LaminaBotones("Tipo", new String[]{"String[]", "Icon[]", "Object[]"});
		laminaEntrada = new LaminaBotones("Tipo", new String[]{"Campo de texto", "Combo"});
		
		setLayout(new BorderLayout());
		
		laminaCuadricula.add(laminaTipo);
		laminaCuadricula.add(laminaTipoMensaje);
		laminaCuadricula.add(laminaMensaje);
		laminaCuadricula.add(laminaConfirmar);
		laminaCuadricula.add(laminaOpcion);
		laminaCuadricula.add(laminaEntrada);
		
		JPanel lamina_mostrar = new JPanel();
		JButton boton_mostrar = new JButton("Mostrar");
		boton_mostrar.addActionListener(new AccionMostrar());
		lamina_mostrar.add(boton_mostrar);
		
		add(lamina_mostrar, BorderLayout.SOUTH);
		add(laminaCuadricula, BorderLayout.CENTER);
	}
	
	
	public Object dameMensaje() {
		String s = laminaMensaje.dameSeleccion();
		if(s.equals("Cadena")) return cadenaMensaje;
		
		else if (s.equals("Icono")) return iconoMensaje;
		
		else if (s.equals("Otros")) return objetoMensaje;
		
		else if (s.equals("Componente")) return componenteMensaje;
		
		else return new Object[] {cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje};
	}
	
	
	public int dameTipoMensaje() {
		String s = laminaTipoMensaje.dameSeleccion();
		if(s.equals("ERROR_MESSAGE")) return JOptionPane.ERROR_MESSAGE;
		else if (s.equals("INFORMATION_MESSAGE")) return JOptionPane.INFORMATION_MESSAGE;
		else if (s.equals("WARNING_MESSAGE")) return JOptionPane.WARNING_MESSAGE;
		else if (s.equals("QUESTION_MESSAGE")) return JOptionPane.QUESTION_MESSAGE;
		else return JOptionPane.PLAIN_MESSAGE;
		
	}
	
	
	public int dameConfirmar() {
		String s = laminaConfirmar.dameSeleccion();
		if(s.equals("DEFAULT_OPTION")) return JOptionPane.DEFAULT_OPTION;
		else if(s.equals("YES_NO_OPTION")) return JOptionPane.YES_NO_OPTION;
		else if(s.equals("YES_NO_CANCEL_OPTION")) return JOptionPane.YES_NO_CANCEL_OPTION;
		else return JOptionPane.OK_CANCEL_OPTION;
	}
	
	
	public Object[] dameOpcion() {
		String s = laminaOpcion.dameSeleccion();
		if(s.equals("String[]")) return new String[] {"Amarillo", "Azul", "Rojo"};
		else if (s.equals("Icon[]")) return new Icon[] {new ImageIcon("src/graficos/bola_amarilla.gif"), new ImageIcon("src/graficos/bola_azul.gif"), new ImageIcon("src/graficos/bola_roja.gif")};
		else return new Object[] {cadenaMensaje, iconoMensaje, componenteMensaje, objetoMensaje};
	}
	
	
	
	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(laminaTipo.dameSeleccion().equals("Mensaje")) {
				JOptionPane.showMessageDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipoMensaje());
				
			} else if (laminaTipo.dameSeleccion().equals("Confirmar")) {
				JOptionPane.showConfirmDialog(MarcoDialogos.this, dameMensaje(), "Título", dameConfirmar(), dameTipoMensaje());
				
			} else if (laminaTipo.dameSeleccion().equals("Entrada")) {
				if(laminaEntrada.dameSeleccion().equals("Campo de texto")) {
					JOptionPane.showInputDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipoMensaje());
				} else {
					JOptionPane.showInputDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipoMensaje(), null, new String[] {"Amarillo", "Azul", "Rojo"}, "Azul");
				}
				
			} else if (laminaTipo.dameSeleccion().equals("Opción")) {
				JOptionPane.showOptionDialog(MarcoDialogos.this, dameMensaje(), "Título", 1, dameTipoMensaje(), null, dameOpcion(), null);
				
			}
		}
	}
	
}


class LaminaEjemplo extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
		g2.setPaint(Color.YELLOW);
		g2.fill(rectangulo);
	}
	
}