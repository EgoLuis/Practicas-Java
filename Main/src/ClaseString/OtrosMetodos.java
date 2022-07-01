package ClaseString;

public class OtrosMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Esta es una cadena para este ejemplo";
		System.out.println(cadena.charAt(2));
		
		
		char arreglo[] = new char[20];
		//El primer parametro es el indice a partir del cual vamos a copair la cadena, el segundo es cuantos caracteres se copiaran,
		//El tercer parametro es el arreglo al cual se copiaran los caracteres y el cuarto parametro es el indice del arreglo a partir del cual se copaian
		cadena.getChars(0, 3, arreglo, 0);
		System.out.println(arreglo);
		
		
		//los parametros indican el indicie inicial y final de la subcadena que se copiara
	    System.out.println(cadena.substring(6,14));
	    System.out.println(cadena.substring(9));

	}

}
