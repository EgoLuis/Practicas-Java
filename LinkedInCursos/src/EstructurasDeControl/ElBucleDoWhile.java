package EstructurasDeControl;

import java.util.Scanner;

public class ElBucleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		double numero;
		do {
			System.out.println("Introduce un número y le mostraremos la raiz cuadrada. Para salir introduzca el cero");
			numero = scan.nextDouble();
			if(numero == 0) {
				System.out.println("Hasta la vista");
			}else {
				System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
			}
		} while (numero != 0);

	}

}
