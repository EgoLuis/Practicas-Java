package SegundoPaquete;
import java.util.*;

public class AdivinaNumero_bucle {

	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		do{
			System.out.println("Introduce un número");
			numero = entrada.nextInt();
			if(aleatorio < numero) {
				System.out.println("El número es menor");
			}
			else if(aleatorio > numero) {
				System.out.println("El número es mayor");
			}
			intentos++;
		}while(numero != aleatorio);
			
		System.out.println("Correcto");
		System.out.println("Te tomó " + intentos + " intentos.");
	}

}
