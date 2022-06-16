package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConTexto miMarco = new MarcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTexto extends JFrame{
	public MarcoConTexto() {
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("primer texto");
		Lamina miLamina = new Lamina(); //instanciamos la lamina que queremos sobreponer
		add(miLamina);//añadimos la lamina
		
	}
}

class Lamina extends JPanel{ //contenedor donde vamos a "dibujar" los elementos que esten dentro de la ventana
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}