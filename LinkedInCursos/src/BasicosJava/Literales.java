package BasicosJava;

public class Literales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteroDecimal = 100;
		
		int enteroOctal = 0100; //Si el número lleva 0 por delante estamos convirtiendolo al sistema octal
		
		int enteroHexadecimal = 0x100; //Si el número lleva 0x por delante estamos convirtiendolo al sistema hexadecimal
		
		System.out.println("enteroHecadecimal es " + enteroHexadecimal);
		
		long numeroLong = 100L;
		
		double numeroDouble = 2.5;
		
		float numeroFloat = 2.5f;
		
		int numeroConGuiones = 25_258_236; //Los _ se usan para facilitar la legibilidad, la maquina no los toma en cuenta
		
		System.out.println("El número con guiones es " + numeroConGuiones);
		
		char miChar = 'b';
		
		char miOtroChar = '\u0062'; //Aqui usamos el sistema UniCode para representar un char
		
		System.out.println("Valor del Unicode es " + miOtroChar);
		
		char comillaSimple = '\''; //Necesitamos la \ para poder asignar caracteres especiales que Java usa en alguna de sus funciones
		
		String stringLiteral = "Esto es un literal";
		
		boolean booleanoVerdadero = true;
		
		String stringNulo = null;
		
		
		

	}

}
