package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana López", "Biológicas");
		
		for(Persona p : lasPersonas) {
			System.out.println(p.dameNombre() + ". " + p.dameDescripcion());
		}

	}

}

abstract class Persona{ //La clase debe ser abstracta si contiene un método abstracto
	
	private String nombre;
	
	public Persona(String nom) {
		nombre=nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion(); //El metodo abstracto hace que todas las clases que hereden de esta esté obligadas a desarrollar el método
	
}

class Empleado2 extends Persona{
	private double sueldo;
	private Date altaContrato;
	private int Id = 1; 
	private static int IdSiguiente = 1; //La palabra static hace que la variable "IdSiguiente" sea compartida en todos los objetos
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
	super(nom);
	sueldo = sue;
	GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
	altaContrato = calendario.getTime();
	Id=IdSiguiente;
	IdSiguiente++;
	}
	
	public String dameDescripcion() { //este método tuvimos que desarrollarlo ya que es abstacto en la clase de la que heredamos
		return "Este empleao tiene un ID = " + Id + " con un sueldo de = " + sueldo;
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public int dameId() {
		return Id;
	}
	
	public void subeSueldo(double porcentaje) { //setter
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}	
	public static String dameIdSiguiente() { 
		return "El Id siguiente es: " + IdSiguiente;
	}
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}
	
	public String dameDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera;
	}
	
	private String carrera;
	
	
	
}
