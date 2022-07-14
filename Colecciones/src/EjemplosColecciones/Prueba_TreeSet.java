package EjemplosColecciones;

import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ordenaPersonas = new TreeSet<String>();
		
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		ordenaPersonas.add("Adriana");
		
		//siempre ordenará a los elementos, para String lo hace en orden alfabetico
		System.out.println(ordenaPersonas);
		
		Articulo primero = new Articulo(1, "Z Primer Articulo");
		Articulo segundo = new Articulo(2, "X Segundo Articulo");
		Articulo tercero = new Articulo(3, "Y Tercer Articulo");
		
		
		
		//Para clases que nosotros creamos, es necesario sobreescribir el metodo compareTo para que el TreeSet sea capaz de ordenarlos
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo a : ordenaArticulos) {
			System.out.println(a.getDescripcion());
		}
		System.out.println("");
		
		//Este segundo TreeSet ordena los articulos de acuerdo con el orden alfabatico, fue necesario sobreescribir el metodo compare() y pasar como argumento al TreeSet el comparador
		ComparadorArticulos comparadorArticulos = new ComparadorArticulos();
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);
		ordenaArticulos2.add(tercero);
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		
		for(Articulo a : ordenaArticulos2) {
			System.out.println(a.getDescripcion());
		}
	}
}


class Articulo implements Comparable<Articulo> {
	private int numero_articulo;
	private String descripcion;
	
	public Articulo(int num, String desc) {
		numero_articulo = num;
		descripcion = desc;
	}
	
	public String getDescripcion() {
		return descripcion;
	}	
	
	@Override
	public int compareTo(Articulo o) {
		return numero_articulo - o.numero_articulo;
	}
}


class ComparadorArticulos implements Comparator<Articulo> {
	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}	
}