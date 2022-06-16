package arraylist;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Empleado listaEmpleados[] = new Empleado[3];
		listaEmpleados[0] = new Empleado("Ana", 45, 2500);
		listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
		listaEmpleados[2] = new Empleado("Mar�a", 25, 2600);
		*/
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Mar�a", 25, 2600));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Olga", 27, 1800));
		
		listaEmpleados.set(1, new Empleado("Ra�l", 28, 1900)); //Este m�todo permite insertar un nuevo registro en la posici�n que queremos y no en la �ltima
		
		System.out.println(listaEmpleados.get(2).dameDatos()); //Este m�todo nos devuelve el objeto seg�n el indice que le indiquemos
		
		listaEmpleados.trimToSize(); //con este m�todo eliminamos el exceso de memoria que la lista tenga por cantidad de elementos
		
		System.out.println(listaEmpleados.size());

		for(Empleado e: listaEmpleados) {
			System.out.println(e.dameDatos());
		}
		
		Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
		listaEmpleados.toArray(arrayEmpleados); //Este m�todo permite mandar los objetos de una lista a un array
		
		
		//Recorrer la lista con iterador
		System.out.println("Recorrer con iterador");
		Iterator<Empleado> mi_iterador = listaEmpleados.iterator();
		while(mi_iterador.hasNext()) {
			System.out.println(mi_iterador.next().dameDatos());
		}
		
	}
}

class Empleado{
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene " + edad + " a�os y un salario de " + salario;
	}
	
	private String nombre;
	private int edad;
	private double salario;
	
}
