package SegundoPaquete;
import javax.swing.*;

public class Peso_ideal_bucle {

	public static void main(String[] args) {
		
		String genero="";
		do {
			
			genero=JOptionPane.showInputDialog("Introduce tu g�nero (H/M)");
		
		} while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
		
		int pesoideal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoideal = altura - 110;
		}
		else {
			pesoideal = altura - 120;
		}
		System.out.println("Tu peso ideal es "+ pesoideal + " kg");

	}

}
