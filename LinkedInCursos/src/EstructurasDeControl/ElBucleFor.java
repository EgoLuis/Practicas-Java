package EstructurasDeControl;

import java.util.Scanner;

public class ElBucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		int primerOp = scan.nextInt();
		System.out.println("Introduce el segundo número");
		int segundoOp = scan.nextInt();
		int resultado = 0;
		
		for (int i = 0; i < segundoOp; i++) {
			System.out.println("Iteración número; " + (i + 1));
			resultado += primerOp;
		}
		
		System.out.println("El resultado de multiplicar " + primerOp + " por " + segundoOp + " es " + resultado);
		*/
		
		int suma = 0;
		for (int i = 1, j = 100; i<j; i++, j--) {
			System.out.println("Iteración número " + (i+1) + " sumando " + i + " y " + j);
			suma = suma + i + j;
		}
		
		System.out.println("El resultado de sumar los númros del 1 al 100 es " + suma);
	}

}
