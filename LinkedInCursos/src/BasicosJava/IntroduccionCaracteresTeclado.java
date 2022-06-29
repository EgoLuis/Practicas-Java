package BasicosJava;

import java.util.*;

public class IntroduccionCaracteresTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cómo te llamas?");
		String nombre = scan.nextLine();
		System.out.println("hola " + nombre + " ¡Bienvenido!");
		System.out.println("Introduce tu edad");
		int edad = scan.nextInt();
		System.out.println("Tienes " + edad + " años");
	}

}
