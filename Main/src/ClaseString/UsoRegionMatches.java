package ClaseString;

public class UsoRegionMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Esta es la cadena que vamos a comparar";
		
		//El primer parametro especifica si ignora o no may�sculas, el segundo es el indice a partir del cual toma en cuenta la cadena que llama al m�todo
		//el tercer par�metro indica la cadena de comparaci�n, el cuarto indica el indice a partir del cual toma en cuenta la segunda cadena
		//el quinto par�metro indica cuantos caracteres va a tomar en cuenta.
		System.out.println(cadena.regionMatches(true, 11, "Cad", 0, 3));

	}

}
