package SegundoPaquete;
import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		
		long resultado = 1L; //para datos tipo long hay que a�adir el sufijo L
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
		
		for (int i = numero; i > 0; i--) {
			resultado = resultado * i;
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);
	}

}
