package serializacion;

import java.util.*;
import java.io.*;

public class Serializando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administrador jefe = new Administrador ("Juan", 80000, 2005, 12, 15);	
		jefe.setIncentivo(5000);	
		Empleado[] personal = new Empleado[3];	
		personal[0] = jefe;		
		personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);
		personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);
		
		try {
			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/Admin/Desktop/PILDORAS INFORMATICAS/CURSO JAVA/empleado.dat"));
			escribiendo_fichero.writeObject(personal);
			escribiendo_fichero.close();
			
			ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:/Users/Admin/Desktop/PILDORAS INFORMATICAS/CURSO JAVA/empleado.dat"));
			Empleado[] personal_recuperado = (Empleado[])recuperando_fichero.readObject();
			recuperando_fichero.close();
			
			for(Empleado e : personal_recuperado) {
				System.out.println(e);
			}
			
		}catch(Exception e) {
			
		}

		
	}

}
// --------------------------------------------------------------------------------------------------
class Empleado implements Serializable { //al implementar esta interfaz estamos haciendo que esta clase pueda ser serializable (se puede convertir en bytes)
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //Esta es la huella que deja el programa a los objetos serializables y que permite que puedan ser leidos en cualquier ordenador
	
	public Empleado(String n, double s, int agno, int mes, int dia) {
		
		nombre = n;
		sueldo=s;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		fechaContrato = calendario.getTime();
	}
	
	public void subirSueldo(double porcentaje) {
		
		double aumento = sueldo * porcentaje / 100;
		sueldo+=aumento;
	}
	
	public String toString() {
		
		return "Nombre = " + nombre + ", sueldo = " + sueldo + ", fecha de contrato = " + fechaContrato;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	String nombre;
	double sueldo;
	Date fechaContrato;	
}
//--------------------------------------------------------------------------------------------------
class Administrador extends Empleado{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Administrador(String n, double s, int agno, int mes, int dia) {
		super(n,s,agno,mes,dia);
		incentivo=0;
	}
	
	public double getSueldo() {
		double sueldoBase = super.getSueldo();
		return sueldoBase + incentivo;
	}
	
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
	public String toString() {
		return super.toString() + ", incentivo = " + incentivo;
	}
	
	private double incentivo;
	
}



