package ArraysYOtrosDatos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caja<String> caja1 = new Caja<>("Hola");
		
		//Los genericos no pueden contener tipos primitivos por lo que es necesario utilizar las clases de Java para hacerlos objetos
		Integer numero = 5;
		Caja<Integer> caja2 = new Caja<>(numero);
		
		String miObjeto = "Perro";
		
		System.out.println("¿La variable caja1 contiene un elemento del mismo tipo que miObjeto?: " + caja1.perteneceElContendioALaMismaClase(miObjeto));
		System.out.println("¿La variable caja2 contiene un elemento del mismo tipo que miObjeto?: " + caja2.perteneceElContendioALaMismaClase(miObjeto));
	}

}
