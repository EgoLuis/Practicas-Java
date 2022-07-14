package EjemplosColecciones;
import java.util.*;

public class PuruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Los mapas se caracterizan por almacenar elementos de tipo clave-valor
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("Jefe", new Empleado("Martha"));
		personal.put("Secretario", new Empleado("Juan"));
		personal.put("Ingeniero", new Empleado("Luis"));
		personal.put("Vendedor", new Empleado("Sandra"));
		personal.put("Contador", new Empleado("Ana"));
		
		System.out.println(personal);
		System.out.println("");
		
		//eliminar elemento
		personal.remove("Vendedor");
		System.out.println(personal);
		System.out.println("");
		
		//reemplazar un elemento usando la misma clave (no puede haber dos claves iguales)
		personal.put("Contador", new Empleado("Natalia"));
		System.out.println(personal);
		System.out.println("");
		
		for(Map.Entry<String, Empleado> e : personal.entrySet()) {
			String clave = e.getKey();
			Empleado valor = e.getValue();
			System.out.println("Clave = " + clave + ", Valor = " + valor);
		}

	}
}

class Empleado {
	private String nombre;
	private double sueldo;
	
	public Empleado(String n) {
		nombre = n;
		sueldo = 2000;
	}
	
	public String toString() {
		return"[Nombre = " + nombre + ", sueldo = " + sueldo + "]";
	}
}
