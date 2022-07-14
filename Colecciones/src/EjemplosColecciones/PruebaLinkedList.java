package EjemplosColecciones;

import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> personas = new LinkedList<String>();
		
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		
		System.out.println(personas.size());
		
		//Los elementos en la LinkedList se guardan en el orden en el que fueron añadidos
		//al usar el objeto iterador, este empieza desde el inicio, usamos el método next para avanzar un lugar
		//y despues se inserta Juan, por lo que aparecerá en segundo lugar.
		
		ListIterator<String> it = personas.listIterator();	
		it.next();	
		it.add("Juan");
		
		
		
		for(String e : personas) {
			System.out.println(e);
		}
		
		

	}

}
