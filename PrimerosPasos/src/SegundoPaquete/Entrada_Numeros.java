package SegundoPaquete;

import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {
		double x = 10000.0;
		//System.out.printf("%1.2f",x/3); //se usa printf para imprimir con formato, en este caso cantidad de decimales
		
		String num1 = JOptionPane.showInputDialog("Introduce un n�mero");
		
		double num2 = Double.parseDouble(num1); //M�todo para convertir de string a double
		
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
