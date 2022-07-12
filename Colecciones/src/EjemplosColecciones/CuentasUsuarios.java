package EjemplosColecciones;

import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cl1 = new Cliente("Antonio Guzman", "00001", 200000);
		Cliente cl2 = new Cliente("Rafael Duran", "00002", 250000);
		Cliente cl3 = new Cliente("Penelope Lopez", "00003", 300000);
		Cliente cl4 = new Cliente("Julio Alvarez", "00004", 350000);
		Cliente cl5 = new Cliente("Antonio Banderas", "00005", 300000); 
		
		//Ventajas de Set - HashSet
		//1. No permiten elementos duplicados
		//2. Es rápida
		//Desventajas de Set - HashSet
		//1. No tienen acceso aleatorio
		//2. No se puede ordenar elementos
		HashSet<Cliente> clientesBanco = new HashSet<Cliente>(); 
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5); //debido a que el cliente cl5 es igual que el cl3 al tener el mismo número de cuenta, no se agrega a la colección
		
		
		for (Cliente cliente : clientesBanco) {		
			System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
		}
		
		System.out.println();
		
		//Con el objeto iterador podemos recorrar uno a uno los elementos de una coleccion
		//el metodo next() es el encargado de saltar de elemento a elemento
		//el metodo hasNext() devuelve true si existe un elemento a continuacion o false si se llego al fin de la lista
		Iterator<Cliente> it = clientesBanco.iterator();
		while(it.hasNext()) {
			String nombre_cliente = it.next().getNombre();
			System.out.println(nombre_cliente);
		}
		
		System.out.println();
		
		//Con el iterador es más sencillo eliminar un elemento de una lista
		Iterator<Cliente> it2 = clientesBanco.iterator();
		while(it2.hasNext()) {
			String nombre_cliente = it2.next().getNombre();
			if(nombre_cliente.equals("Antonio Guzman")) {
				it2.remove();
			}
		}
		
		System.out.println();
		
		for (Cliente cliente : clientesBanco) {		
			System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
		}
		

	}

}
