package ArraysYOtrosDatos;

public class PracticaConStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String unString = new String("Soy un String");
		
		String otroString = new String(unString);
		
		String miTercerString = "Este String se crea directamente con una cadena de caracteres entrecomillada";
		
		String miString = "abcde";
		char caracter;
		caracter = miString.charAt(2);
		System.out.println("El caracter en la posicion 2 es " + caracter);
	
		String resultadoConcat = miString.concat("fghij");
		System.out.println("El resultado de la concatenacion es " + resultadoConcat);
		
		String concatenacionSencilla = "abcde" + "fghij";
		System.out.println("El resultado de concatenar con el operador suma es " + concatenacionSencilla);
		
		resultadoConcat.length();
		

	}

}
