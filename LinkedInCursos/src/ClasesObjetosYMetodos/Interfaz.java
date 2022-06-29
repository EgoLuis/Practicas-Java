package ClasesObjetosYMetodos;

import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca su número de identificación");
		Scanner scan = new Scanner(System.in);
		String identificador = scan.nextLine();
		System.out.println("Introduzca su contraseña");
		String contrasena = scan.nextLine();
		CajeroAutomatico cajero = new CajeroAutomatico(identificador, contrasena);
		
		
		int opcionSeleccionada;
		do {
			System.out.println("Elija una de las siguientes opciones: ");
			System.out.println("     Escriba 1 para consultar su saldo");
			System.out.println("     Escriba 2 para ingresar dinero");
			System.out.println("     Escriba 3 para sacar dinero");
			System.out.println("     Escriba 4 para consultar sus últimos movimientos");
			System.out.println("     Para salir escriba cualquier otro numero");
			
			opcionSeleccionada = scan.nextInt();
			
			switch (opcionSeleccionada) {
			case 1:
				System.out.println("La opción que ha elegido es consultar saldo");
				cajero.mostrarSaldo();
				break;
			case 2:
				System.out.println("La opción que ha elegido es ingresar dinero");
				cajero.ingresarDinero();
				break;
			case 3:
				System.out.println("La opción que ha elegido es sacar dinero");
				cajero.sacarDinero();
				break;
			case 4:
				System.out.println("La opción que ha elegido es consultar sus últimos movimientos");
				cajero.cosultarUltimosMovimientos();
				break;
			default:
				System.out.println("Muchas gracias por usar nuestros servicios");

			}
			
		}while(opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);

	}

}
