package EstructurasDeControl;

import java.util.Scanner;

public class ElOperadorInterrogante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int dividendo = scan.nextInt();
		System.out.println("Introduce otro número entero");
		int divisor = scan.nextInt();
		
		int resultado;
		/*
		if(divisor ==0) {
			resultado = 0;
		}else {
			resultado = dividendo / divisor;
		}*/
		
		resultado = divisor == 0?0:dividendo / divisor;

		System.out.println("El resultado de dividir " + dividendo + " entre " + divisor + " es " + resultado);
	}

}
