package Ternario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 21;
		String cadena;
		
		if(numero < 20) {
			cadena = "menos";
		}else {
			cadena = "m�s";
		}
		
		System.out.println(cadena);
		
		String cadena2 = numero < 20 ? "menos":"m�s";
		
		System.out.println(cadena2);
		
		

	}

}
