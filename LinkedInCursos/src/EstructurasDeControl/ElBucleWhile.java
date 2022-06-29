package EstructurasDeControl;

import java.util.Scanner;

public class ElBucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un número");
		double num = scan.nextDouble();
		double candidatoARaiz = 0.0;
		
		while(candidatoARaiz * candidatoARaiz <= num) {
			candidatoARaiz += 0.01;
			
		}
		
		candidatoARaiz -= 0.01;
		System.out.println("La raiz que calculamos nosotros es " + candidatoARaiz);
		System.out.println("La raíz que calcula Java es " + Math.sqrt(num));
		

	}

}
