package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCentrado miMarco = new MarcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit(); //guarda las caracteristicas de la pantalla que estemos usando
		Dimension tamano = miPantalla.getScreenSize(); //guarda el tamaño de la pantallo que estemos usando
		int alturaPantalla = tamano.height;
		int anchoPantalla = tamano.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		setTitle("Marco Centrado");
		Image miIcono = miPantalla.getImage("src/graficos/icono.gif");
		setIconImage(miIcono); //cambia la imagen del extremo sup izq de la ventana
		
	}
}
