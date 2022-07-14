package EjemplosColecciones;

import java.util.*;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> paises = new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		LinkedList<String> capitales = new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("Ciudad de México");
		capitales.add("Lima");
		
		System.out.println(paises);
		System.out.println(capitales);
		
		ListIterator<String> itPaises = paises.listIterator();
		ListIterator<String> itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			if(itPaises.hasNext()) {
				itPaises.next();
			}
			itPaises.add(itCapitales.next());
		}
		
		System.out.println(paises);
		System.out.println(capitales);
		
		//al iniciar nuevamente el iterador, lo regresamos al lugar anterior a la primera posicion
		itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			itCapitales.next();
			if(itCapitales.hasNext()) {
				itCapitales.next();
			}
			itCapitales.remove();
		}
		
		System.out.println(paises);
		System.out.println(capitales);
		
		//este metodo remueve todos los elementos de una lista que se encuentren en otra
		paises.removeAll(capitales);
		System.out.println(paises);
		System.out.println(capitales);
		

	}

}
