package ClaseString;

public class BusquedaCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Hola Jos�, Buenos d�as, que tenFgas un buen d�a";
		String cadenaB = "Estamos comiendo una sopa muy deliciosa";
		
		int b;
		int buscar = 20;
		
		b = cadena.indexOf((int)'F', buscar);
		
		System.out.println(b);
		
		int x;
		x = cadenaB.lastIndexOf((int)'y');
		System.out.println(x);
		
		x = cadenaB.lastIndexOf("muy");
		System.out.println(x);
	}

}
