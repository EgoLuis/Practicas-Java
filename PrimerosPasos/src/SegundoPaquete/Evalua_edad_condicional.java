package SegundoPaquete;
import java.util.*;

public class Evalua_edad_condicional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad = entrada.nextInt();
		
		if (edad < 18) {
			System.out.println("Eres un menor de edad");
		}
		else if (edad < 40) {
			System.out.println("Eres adulto joven");
		}
		else if (edad < 65) {
			System.out.println("Eres adulto mayor");
		}
		else {
			System.out.println("Eres de la tercera edad");
		}

	}

}
