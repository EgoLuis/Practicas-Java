package ClaseString;

public class UsoEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "José";
		String nombreA = "josé";
		
		if(nombre.equals(nombreA)) {
			System.out.println("Iguales A");
		} else if (nombre.equalsIgnoreCase(nombreA)) {
			System.out.println("Iguales B");
		} 

	}

}
