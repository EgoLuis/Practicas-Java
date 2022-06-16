package SegundoPaquete;

import java.util.Scanner;

public class Uso_Tallas {

	public static void main(String[] args) {
		
		Talla s = Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.EXTRA_GRANDE;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, EXTRA_GRANDE");
		String entrada_datos = entrada.next().toUpperCase();
		
		Talla2 la_talla = Enum.valueOf(Talla2.class, entrada_datos);
		
		System.out.println("Talla = " + la_talla);
		
		System.out.println("Abreviatura = " + la_talla.dameAbreviatura());

		
	}
	
	//Un tipo enumerado debe declararse fuera del Main
	enum Talla {MINI, MEDIANO, GRANDE, EXTRA_GRANDE}; // El tipo enumerado hace que la variable solo pueda tomar los valores que se indiquen entre las {}

	enum Talla2{ //El enumerado también se puede construir parecido a una clase, con su constructor, métodos getter y setter. La diferencia es que no podemos crear objetos
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), EXTRA_GRANDE("XL");
		
		private Talla2(String abreviatura) {
			 this.abreviatura = abreviatura;
		}
		
		public String dameAbreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;
	}
	
}
