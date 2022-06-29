package EjemplosColecciones;

import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cl1 = new Cliente("Antonio Guzman", "00001", 200000);
		Cliente cl2 = new Cliente("Rafael Duran", "00002", 250000);
		Cliente cl3 = new Cliente("Penelope Lopez", "00003", 300000);
		Cliente cl4 = new Cliente("Julio Alvarez", "00004", 350000);
		Cliente cl5 = new Cliente("Penelope Lopez", "00003", 300000); 
		
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
		
		
		

	}

}
