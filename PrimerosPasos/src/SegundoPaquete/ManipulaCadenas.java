package SegundoPaquete;

public class ManipulaCadenas {

	public static void main(String[] args) {
		
		String nombre = "Luis";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra = nombre.length();
		
		System.out.println("La última letra de mi nombre es " + nombre.charAt(ultima_letra-1));
		
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		
		String frase_resumen = frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo... y " +	
		 frase.substring(29, 57); //Extrae una porción de la cadena indicando desde que indice hasta que indice

		System.out.println(frase_resumen);
		
		String alumno1, alumno2;
		alumno1 = "David";
		alumno2 = "david";
		System.out.println(alumno1.equals(alumno2)); //Devuelve true si ambas cadenas son iguales o false si no lo son, distinque mayúsculas
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); //Igual que equals pero ignora mayúsculas
	}

}
