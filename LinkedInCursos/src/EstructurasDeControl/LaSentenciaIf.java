package EstructurasDeControl;

import java.util.Scanner;

public class LaSentenciaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int x = 5;
		
		System.out.println("Adivina el número que estoy pensando del 1 al 10");
		
		int n = scan.nextInt();
		
		
		if (n == x) {
			System.out.println("¡Bien Hecho!");
			
		}
		else {
			System.out.println("Lo siento. El número que estaba pensando es " + x);
		}

	}

}
