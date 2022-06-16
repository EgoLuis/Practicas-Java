package SegundoPaquete;

public class DeclaracionesOperadores {

	public static void main(String[] args) {
		final double apulgadas = 2.54; //al agregar la palabra final estamos haciendo que la variable sea constante, no se puede modificar su valor
		double cm = 6;
		double resultado = cm/apulgadas;
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
		
		int operador1, operador2, operacion;
		operador1 = 8;
		operador2 = 7;
		operacion = operador1 + operador2;
		System.out.println(operacion);
		
		

	}

}
