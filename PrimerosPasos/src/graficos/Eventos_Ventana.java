package graficos;
import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventana {

	public static void main(String[] args) {
		
		MarcoVentana marco1 = new MarcoVentana();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		MarcoVentana marco2 = new MarcoVentana();
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		
		marco1.setTitle("Ventana 1");
		marco1.setBounds(300,300,500,350);
		marco2.setTitle("Ventana 2");
		marco2.setBounds(900,300,500,350);
		
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//setBounds(300,300,500,350); 
		//setTitle("Respondiendo"); 
		setVisible(true);
		//M_Ventana oyente_Ventana = new M_Ventana();
		//addWindowListener(oyente_Ventana);
		addWindowListener(new M_Ventana());
		
	}
	
}

/*
class M_Ventana implements WindowListener{

	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");
	}

	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando Ventana");
	}

	public void windowClosed(WindowEvent e) {
		
		System.out.println("Ventana cerrada");	
	}

	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");	
	}

	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada");
	}

	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana activada");
	}

	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana desactivada");
	}
	
}*/

class M_Ventana extends WindowAdapter{ //Al utilizar WindowListener estabamos obligados a implementar los 7 métodos, pero al usar WindowAdapter estos ya están implementados y solamente hay que sobreescribirlos

	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada");
	}
	
public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");
	}
}


