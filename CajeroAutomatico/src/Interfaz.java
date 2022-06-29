import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int saldo = 0;
		int deposito = 0;
		int retiro = 0;
		boolean flag = true;
		ArrayList<String> movimientos = new ArrayList<String>();
		
		while(flag==true) {
			System.out.println("Elija una de las siguientes opciones:");
			System.out.println("	Escriba 1 para consultar su saldo.");
			System.out.println("	Escriba 2 para ingresar dinero.");
			System.out.println("	Escriba 3 para sacar dinero.");
			System.out.println("	Escriba 4 para consultar sus últimos movimientos.");
			System.out.println("	Escriba 5 para salir del cajero.");
			
			int respuesta = scan.nextInt();
			
			switch(respuesta) {	
			
			case 1:
				System.out.println("Su saldo es de $" + saldo + ".");
				break;
			
			case 2:
				System.out.println("Ingrese la cantidad a depositar.");
				deposito = scan.nextInt();
				saldo += deposito;
				System.out.println("Su nuevo saldo es de $" + saldo + ".");
				movimientos.add("Depósito de $" + String.valueOf(deposito) + ".");
				break;
				
			case 3:
				System.out.println("Ingrese la cantidad a retirar.");
				retiro = scan.nextInt();
				saldo -= retiro;
				System.out.println("Su nuevo saldo es de $" + saldo + ".");
				movimientos.add("Retiro de $" + String.valueOf(retiro) + ".");
				break;
				
			case 4:
				System.out.println("Sus movimientos son:");
				for(String e : movimientos) {
					System.out.println(e);
				}
				break;
				
			case 5:
				System.out.println("Gracias por usar el cajero");
				flag = false;
				break;
				
			default:
				System.out.println("Opción incorrecta");

			}
			System.out.println("");
		}	
	}
}
