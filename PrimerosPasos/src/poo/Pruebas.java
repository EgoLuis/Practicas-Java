package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("María");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + 
				"\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
	}
}

class Empleados{
	
	private final String nombre; //La palabra reservada final hace la variable constante y una vez iniciada no se le puede modificar.
	private String seccion; //al no tener la palabra static cada objeto tiene su propoa variable "seccion"
	private int Id = 1; 
	private static int IdSiguiente = 1; //La palabra static hace que la variable "IdSiguiente" sea compartida en todos los objetos
	
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos() { //geter
		return "El nombre es: " + nombre + ", la sección es " + seccion + " y el Id = " + Id;
	}
	
	//Un método estático no actúa sobre objetos ya que pertenece a la clase.
	//No pueden acceder a campos de clase, a menos que también sean estáticas.
	public static String dameIdSiguiente() { 
		return "El Id siguiente es: " + IdSiguiente;
	}
	
}
