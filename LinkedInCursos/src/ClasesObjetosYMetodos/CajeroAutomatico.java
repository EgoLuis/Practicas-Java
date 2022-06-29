package ClasesObjetosYMetodos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
	
	CuentaBancaria cuentaBancariaActual;
	
	CajeroAutomatico(String identificador, String contrasena){
		double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50_000);
		cuentaBancariaActual = new CuentaBancaria("Nombre cualquiera", cantidadAleatoria);
	}
	
	void mostrarSaldo() {
		System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
	}
	
	void ingresarDinero() {
		System.out.println("¿Cuanto dinero quiere ingresar?");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		cuentaBancariaActual.ingresarDinero(cantidad);
	}
	
	void sacarDinero() {
		System.out.println("¿Cuanto dinero quiere sacar?");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		cuentaBancariaActual.sacarDinero(cantidad);
	}
	
	void cosultarUltimosMovimientos() {
		
	}
	
	void salir() {
		System.out.println("Muchas gracias por utilizar nuestros servicios");
	}

}
