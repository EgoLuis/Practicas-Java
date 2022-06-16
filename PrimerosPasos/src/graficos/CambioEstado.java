package graficos;
import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*;

public class CambioEstado {

	public static void main(String[] args) {
		
		MarcoEstado marco1 = new MarcoEstado();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setBounds(300,300,500,350); 
		setVisible(true);	
		CambiaEstado nuevo_estado = new CambiaEstado();
		addWindowStateListener(nuevo_estado);
		
	}
	
}

class CambiaEstado implements WindowStateListener{

	public void windowStateChanged(WindowEvent e) {
		
		//System.out.println("La ventana ha cambiado de estado");
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana está a pantalla completa");
		}else if(e.getNewState()==Frame.NORMAL) {
			System.out.println("La ventana está normal");
		}else if(e.getNewState()==Frame.ICONIFIED) {
			System.out.println("La ventana está minimizada");
		}
		
	}
	
}



