package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.out.println("La variable est�tica apellido de la clase Hermano es " + Hermano.apellido);
		
		Hermano hermanoPequeno = new Hermano();
		hermanoPequeno.nombre = "Juan";
		Hermano hermanoMayor = new Hermano();
		hermanoMayor.nombre = "Pedro";
		System.out.println("El hermano peque�o se llama " + hermanoPequeno.nombre + " " + hermanoPequeno.apellido);
		System.out.println("El hermano mayor se llama " + hermanoMayor.nombre + " " + hermanoMayor.apellido);
		
		hermanoPequeno.nombre = "Luis";
		hermanoPequeno.apellido = "D�az";
		System.out.println("El hermano peque�o se llama " + hermanoPequeno.nombre + " " + hermanoPequeno.apellido);
		System.out.println("El hermano mayor se llama " + hermanoMayor.nombre + " " + hermanoMayor.apellido);
	*/
		
		Juego juego = new Juego(4);
		
		Juego.Contador contadorJuego = juego.new Contador();
		
		System.out.println("La puntuaci�n de juego al inicio es " + juego.obtenerPuntuacion());
		
		contadorJuego.incrementarPuntuacion(500);
		
		System.out.println("La puntuaci�n de juego despu�s de incrementar es " + juego.obtenerPuntuacion());
	}

}
