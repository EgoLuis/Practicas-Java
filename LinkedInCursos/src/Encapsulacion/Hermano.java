package Encapsulacion;

public class Hermano {
	String nombre;
	static String apellido = "Garc�a";

	static String obtenerApellido() {
		return apellido;
	}
	
	static void modificarApellido(String nuevoApellido) {
		apellido = nuevoApellido;
	}
}
