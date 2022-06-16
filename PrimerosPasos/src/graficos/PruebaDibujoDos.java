package graficos;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class PruebaDibujoDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor miMarco = new MarcoConColor();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		setTitle("Prueba con colores");
		setSize(400,400);
		LaminaConColor miLamina = new LaminaConColor();
		add(miLamina);
		miLamina.setBackground(SystemColor.window); //Color por defecto del sistema operativo
	}
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		//dibujo de rectángulo, primero dibujamos el contorno de un color y despues lo rellenamos con otro
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.BLUE);
		g2.draw(rectangulo);
		g2.setPaint(Color.RED.brighter());
		g2.fill(rectangulo);
		
		
		
		//dibujo elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		Color miColor = new Color(125,189,200).darker();
		g2.setPaint(miColor);
		g2.fill(elipse);
	}
	
}