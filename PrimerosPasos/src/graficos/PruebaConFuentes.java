package graficos;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class PruebaConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes miMarco = new MarcoConFuentes();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		
	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		setTitle("Prueba con fuentes");
		setSize(400,400);
		LaminaConFuentes miLamina = new LaminaConFuentes();
		add(miLamina);
		miLamina.setForeground(Color.BLUE); //con este método coloreamos todo lo que este en la lámina
	}
	
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Font miFuente = new Font("Courier", Font.BOLD, 26);
		g2.setFont(miFuente);
		//g2.setColor(Color.BLUE);
		g2.drawString("Luis", 100, 100);
		g2.setFont(new Font("Arial", Font.ITALIC,24));
		//g2.setColor(new Color(128,90,50).brighter());
		g2.drawString("Curso de Java", 100, 200);
	}
	
}