package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*
		Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);
		Empleado empleado3 = new Empleado("María Martín", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + ".   Sueldo: " + empleado1.dameSueldo() 
		+ ".   Fecha de alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + ".   Sueldo: " + empleado2.dameSueldo() 
		+ ".   Fecha de alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado3.dameNombre() + ".   Sueldo: " + empleado3.dameSueldo() 
		+ ".   Fecha de alta: " + empleado3.dameFechaContrato());
		*/
		
		Jefatura jefe_RRHH = new Jefatura("Juan Díaz", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernández");
		misEmpleados[4] = jefe_RRHH; //Principio de sustitución, se puede utilizar un objeto de una subclase siempre que el programa espere
									// un objeto de la superclase. En este caso el arreglo solo admite elementos tipo "Empleado", pero podemos
									//introducir elementos tipo "Jefatura" ya que su clase padre es "Empleado".
		misEmpleados[5] = new Jefatura("Verónica Márquez", 95000, 1999, 5, 26);
		
		/*Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05, 05);
		Comparable ejemplo = new Empleado("Elizabeth", 95000, 2011, 06, 07); //No es posible instanciar una interfaz pero si se puede aplicar el principio de sustitucion haciendo un casting
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfaz Comparable");
		}*/
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(55000); //necesitamos hacer un casting para poder usar los métodos de "Jefatura"
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		System.out.println("El Jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de " + jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de " + misEmpleados[3].establece_bonus(200));
		
		
		for(Empleado persona:misEmpleados) {
			persona.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado persona:misEmpleados) {
			System.out.println("Nombre: " + persona.dameNombre() + ".    Id: " + persona.dameId() + ".   Sueldo: " + persona.dameSueldo() 
			+ ".   Fecha de alta: " + persona.dameFechaContrato());
		}
		//En el anterior ciclo for, cuando se llama al método "dameSueldo" y el elemento es del tipo "Jefatura", el método será de "Jefatura"
	}
}

class Empleado implements Comparable, Trabajadores {
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id = 1; 
	private static int IdSiguiente = 1; //La palabra static hace que la variable "IdSiguiente" sea compartida en todos los objetos
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
	nombre = nom;
	sueldo = sue;
	GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
	altaContrato = calendario.getTime();
	Id=IdSiguiente;
	IdSiguiente++;
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000,01,01); //el uso del this aqui es llamar al otro constructor que tiene 5 parámetros para que los objetos tengan un estado inicial
	}
	
	public String dameNombre() { //getter
		return nombre;
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

	
	public int compareTo(Object miObjeto) { //Para poder usar el método sort tenemos que implementar una interfaz con este método (checar API Java)	
		Empleado otroEmpleado = (Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		else if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base + gratificacion;
	}
	
	
}

 class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		super(nom, sue, agno, mes, dia); //cuando tenemos varios constructores en la clase padre, diferenciamos con la cantidad de parametros a cual llamar
		
	}
	
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	
	private double incentivo;
	
	  public double dameSueldo() { //este método esta sobreescribiendo el método de la clase padre
		double sueldoJefe = super.dameSueldo(); //con "super" nos aseguramos de llamar al método de la clase padre
		return sueldoJefe + incentivo; 
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decisión de: " + decision;
	}

	public double establece_bonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonus_base + gratificacion + prima;
	}
		
}

final class Director extends Jefatura{ //final hace que ninguna nueva clase pueda heredar de ésta, también se puede usar para métodos
	public Director (String nom, double sue, int agno, int mes, int dia){
		super(nom, sue, agno, mes, dia); 
	}
	
	
	
	
}

