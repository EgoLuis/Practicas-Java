package EstructurasDeControl;

import java.util.Scanner;

public class LaEscaleraIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un n�mero entero y te dar� informaci�n sobre �l");
		int numI = scan.nextInt();
		if(numI < 3) {
			System.out.println("El n�mero introducido es menor que 3");
		}else if (numI < 5) {
			System.out.println("El n�mero introducido est� entre 3 y 5");
		}else if (numI < 8) {
			System.out.println("El n�mero introducido est� entre 5 y 8");
		}else {
			System.out.println("El n�mero introducido es mayor o igual que 8");
		}

	}

}
