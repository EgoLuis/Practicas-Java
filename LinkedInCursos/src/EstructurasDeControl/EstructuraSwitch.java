package EstructurasDeControl;

import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el dia de la semana en que quiere su cita");
		String dia = scan.nextLine();
		
		/*
		switch(dia) {
		case "Lunes":
			System.out.println("El Lunes puede venir de 11:00 a 12:30");
			break;
		case "Martes":
			System.out.println("El Martes puede venir de 15:30 a 17:30");
			break;
		case "Mi�rcoles":
			System.out.println("El Mi�rcoles puede venir de 11:00 a 12:30");
			break;
		case "Jueves":
			System.out.println("El Jueves puede venir de 15:30 a 17:30");
			break;
		case "Viernes":
			System.out.println("El Viernes puede venir de 9:00 a 11:00");
			break;
		case "S�bado":
			System.out.println("El S�bado nuestra cl�nica permanecer� cerrada");
			break;
		case "Domingo":
			System.out.println("El Domingo nuestra cl�nica permanecer� cerrada");
			break;
		default:
			System.out.println("Usted no ha introducido un d�a v�lido");
		}*/
		
		switch(dia) {
		case "Lunes":
		case "Mi�rcoles":
			System.out.println("El " + dia + " puede venir de 11:00 a 12:30");
			break;
		case "Martes":
		case "Jueves":
			System.out.println("El " + dia + " puede venir de 15:30 a 17:30");
			break;
		case "Viernes":
			System.out.println("El Viernes puede venir de 9:00 a 11:00");
			break;
		case "S�bado":
		case "Domingo":
			System.out.println("El " + dia + " nuestra cl�nica permanecer� cerrada");
			break;
		default:
			System.out.println("Usted no ha introducido un d�a v�lido");
		}
		
	}

}
