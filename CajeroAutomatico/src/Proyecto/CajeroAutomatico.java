package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
	
	private CuentaBancaria cuentaBancariaActual;
	
	protected CajeroAutomatico(String identificador, String contrasena){
		double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50_000);
		cuentaBancariaActual = new CuentaAhorro("Nombre cualquiera", cantidadAleatoria);
	}
	
	protected void mostrarSaldo() {
		System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
	}
	
	protected void ingresarDinero() {
		System.out.println("¿Cuanto dinero quiere ingresar?");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		cuentaBancariaActual.ingresarDinero(cantidad);
	}
	
	protected void sacarDinero() {
		System.out.println("¿Cuanto dinero quiere sacar?");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		cuentaBancariaActual.sacarDinero(cantidad);
	}
	
	protected void cosultarUltimosMovimientos() {
		
		var generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
		System.out.println("¿Cuantos movimientos quiere consultar?");
		Scanner scanner = new Scanner(System.in);
		int numeroDeMovimientos = scanner.nextInt();
		ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "euros");
		mostrarMovimientos(movimientos);
		System.out.println("");
	}
	
	private void mostrarMovimientos(ArrayList<String> movimientos) {
		for (String movimiento: movimientos) {
			System.out.println(movimiento);
		}
	}
	
	protected void salir() {
		System.out.println("Muchas gracias por utilizar nuestros servicios");
	}
	
	protected void mostrarCondicionesLegals() {
		cuentaBancariaActual.informarSobreCondicionesLegales();
	}

}
