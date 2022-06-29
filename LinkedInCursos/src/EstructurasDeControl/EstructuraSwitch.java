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
		case "Miércoles":
			System.out.println("El Miércoles puede venir de 11:00 a 12:30");
			break;
		case "Jueves":
			System.out.println("El Jueves puede venir de 15:30 a 17:30");
			break;
		case "Viernes":
			System.out.println("El Viernes puede venir de 9:00 a 11:00");
			break;
		case "Sábado":
			System.out.println("El Sábado nuestra clínica permanecerá cerrada");
			break;
		case "Domingo":
			System.out.println("El Domingo nuestra clínica permanecerá cerrada");
			break;
		default:
			System.out.println("Usted no ha introducido un día válido");
		}*/
		
		switch(dia) {
		case "Lunes":
		case "Miércoles":
			System.out.println("El " + dia + " puede venir de 11:00 a 12:30");
			break;
		case "Martes":
		case "Jueves":
			System.out.println("El " + dia + " puede venir de 15:30 a 17:30");
			break;
		case "Viernes":
			System.out.println("El Viernes puede venir de 9:00 a 11:00");
			break;
		case "Sábado":
		case "Domingo":
			System.out.println("El " + dia + " nuestra clínica permanecerá cerrada");
			break;
		default:
			System.out.println("Usted no ha introducido un día válido");
		}
		
	}

}
