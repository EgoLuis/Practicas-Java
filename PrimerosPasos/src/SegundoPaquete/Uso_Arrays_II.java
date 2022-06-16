package SegundoPaquete;
import javax.swing.*;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		/*
		String[] paises = new String[8];
		
		for(int i = 0; i < 8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1));
		}
		
		for(int i = 0; i < paises.length; i++) {
			System.out.println("País " + (i+1) + " " + paises[i]);
		}
		
		for(String elemento:paises) {
			System.out.println("Pais: " + elemento);
		}*/
		
		int[] matriz_aleatorios = new int [150];
		for (int i=0; i<matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int)(Math.random()*100);
		}
		
		for(int numero:matriz_aleatorios) {
			System.out.print(numero + " ");
		}
		
	}

}
