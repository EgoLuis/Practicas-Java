package ClaseString;

public class UsoStartEndWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = new String ("Hola Jos�. esta es una cadena");
		
		if(cadena.startsWith("Hola J")) {
			System.out.println("S�");
		} else {
			System.out.println("No");
		}
		
		if(cadena.endsWith("ena")) {
			System.out.println("S�");
		} else {
			System.out.println("No");
		}
		

	}

}
