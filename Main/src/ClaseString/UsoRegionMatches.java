package ClaseString;

public class UsoRegionMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Esta es la cadena que vamos a comparar";
		
		//El primer parametro especifica si ignora o no mayúsculas, el segundo es el indice a partir del cual toma en cuenta la cadena que llama al método
		//el tercer parámetro indica la cadena de comparación, el cuarto indica el indice a partir del cual toma en cuenta la segunda cadena
		//el quinto parámetro indica cuantos caracteres va a tomar en cuenta.
		System.out.println(cadena.regionMatches(true, 11, "Cad", 0, 3));

	}

}
