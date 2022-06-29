package EstructurasDeControl;

import java.util.Scanner;

public class LaEscaleraIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número entero y te daré información sobre él");
		int numI = scan.nextInt();
		if(numI < 3) {
			System.out.println("El número introducido es menor que 3");
		}else if (numI < 5) {
			System.out.println("El número introducido está entre 3 y 5");
		}else if (numI < 8) {
			System.out.println("El número introducido está entre 5 y 8");
		}else {
			System.out.println("El número introducido es mayor o igual que 8");
		}

	}

}
