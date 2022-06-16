package SegundoPaquete;

public class CalculosMath {

	public static void main(String[] args) {
		
		//double raiz = Math.sqrt(8);
		//System.out.println(raiz);
		
		float num1 = 5.85F; //para las variables tipo float se debe añadir una F de sufijo
		int resultado = (int)Math.round(num1); //se conoce como refundición al cambio de tipo de dato cuando es compatible
		System.out.println(resultado);
		
		double base = 5;
		double exponente = 3;
		double resultado2 = Math.pow(base, exponente);
		System.out.println(resultado2);
	}

}
