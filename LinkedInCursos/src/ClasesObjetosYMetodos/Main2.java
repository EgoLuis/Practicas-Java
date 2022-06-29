package ClasesObjetosYMetodos;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calculadora = new Calculadora();
		double radio = 4.0;
		double area = calculadora.calcularAreaCirculo(radio);
		System.out.println("El área de un circulo de radio 4 es "+ area);
		
		System.out.println("El volumen de un prisma de 5 por 4 por 8 es: " + calculadora.calcularVolumenPrismaRectagular(5, 4, 8));
		
		calculadora.calcularMedia(2.6, 2, 5.9, 8);
		
	}

}
