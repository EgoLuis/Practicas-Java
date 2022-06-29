package graficos;

import java.awt.event.*;

import javax.swing.*;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton miMarco = new MarcoRaton();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		setVisible(true);
		setBounds(700,300,600,450);
		EventosDeRaton3 EventoRaton = new EventosDeRaton3();
		//addMouseListener(EventoRaton);
		addMouseMotionListener(EventoRaton); //este metodo es para el uso de interfaz MouseMotionListener
	}
}


class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho click");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Suelta el botón!");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Gracias por soltarlo");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de entrar a la ventana");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de salir a la ventana");
	}
	
}

class EventosDeRaton2 extends MouseAdapter{ //si heredamos del adaptador no es necesario implementar todos los métodos de la interfaz
	/*
	public void mouseClicked(MouseEvent e) {
		System.out.println("Coordenada X: " + e.getX() + ". Coordenada Y: " + e.getY());
		
		System.out.println("Numero de clicks seguidos : " + e.getClickCount());
		
	}*/
	
	public void mousePressed(MouseEvent e) {
		int claveRaton = e.getModifiersEx();
		
		if(claveRaton == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Pulsaste el botón izquierdo");	
		
		}else if(claveRaton == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Pulsaste el botón central");
			
		}else if(claveRaton == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Pulsaste el botón derecho");
			
		}
	}
}

class EventosDeRaton3 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando el raton");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo el raton");
	}
	
}