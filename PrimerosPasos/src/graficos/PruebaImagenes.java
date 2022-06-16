package graficos;

import java.awt.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		setTitle("Marco con Imagen");
		setBounds(750,300,500,700);
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		File miImagen = new File("src/graficos/icono.gif");
		try {
			imagen = ImageIO.read(miImagen);
			}
			catch(IOException e){
				System.out.println("La imagen no se encuentra");
			}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		File miImagen = new File("src/graficos/icono.gif");
		try {
		imagen = ImageIO.read(miImagen);
		}
		catch(IOException e){
			System.out.println("La imagen no se encuentra");
		}
		if(imagen==null) {
			g.drawString("No se pudo cargar la imagen",10,10);
		}
		else {		
			g.drawImage(imagen,0,0,null);		
			int anchoImagen=imagen.getWidth(this);		
			int altoImagen=imagen.getHeight(this);		
			for (int i=0; i<500;i+=anchoImagen) {			
				for(int j=0; j<700;j+=altoImagen) {				
					if(i+j>0) {				
						g.copyArea(0, 0, anchoImagen, altoImagen, i, j);			
					}
				}
		}
		}
		
	}
	
	private Image imagen;
}