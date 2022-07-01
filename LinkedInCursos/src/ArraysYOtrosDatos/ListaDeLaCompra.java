package ArraysYOtrosDatos;

import java.util.ArrayList;

public class ListaDeLaCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> miListaDeLaCompra = new ArrayList<String>();
		miListaDeLaCompra.add("Patatas");
		miListaDeLaCompra.add("Leche");
		miListaDeLaCompra.add("Manzanas");
		
		System.out.println("Mi lista contiene " + miListaDeLaCompra);
		
		ArrayList<String> miListaDeEnero = new ArrayList<>(miListaDeLaCompra);
		
		miListaDeEnero.add("Harina");

		System.out.println("miListaDeLaCompra: " + miListaDeLaCompra + " miListaDeEnero: " + miListaDeEnero);
		
		System.out.println("El primer elemento de mi lista de la compra de enero es " + miListaDeEnero.get(0));
		
		miListaDeEnero.set(1,  "Leche entera");
		
		System.out.println(miListaDeEnero);
		
		miListaDeEnero.remove(0);
		
		System.out.println(miListaDeEnero);
		
		miListaDeEnero.remove("Manzanas");
		
		System.out.println(miListaDeEnero);
		System.out.println(miListaDeLaCompra.size());
		
	}

}
