package clases_propias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado Administrativa = new Empleado("Elena", 45, 1500);
		
		Jefe DirectoraComercial = new Jefe("Ana", 27, 3500);
		
		Empleado nuevoEmpleado = DirectoraComercial; //es posible almanenar un objeto tipo Jefe en otro tipo Empleado debido a la herencia
		*/
		
		Pareja<Empleado> Administrativa = new Pareja<Empleado>();
		
		Pareja<Jefe> DirectoraComercial = new Pareja<Jefe>();
		
		//Pareja<Empleado> nuevoEmpleado = DirectoraComercial; //en clases genéricas no es posible guardar Jefe en Empleado
		
		Pareja.imprimirTrabajador(Administrativa);
		
		Pareja.imprimirTrabajador(DirectoraComercial); //al ser un método comodin permite recibir elementos tipo Empleado y sus subclases

	}

}
