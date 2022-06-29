package EjemplosColecciones;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1 = new Libro("P en Java", "Juan", 25);
		Libro libro2 = new Libro("P en Java", "Juan", 25);

		//si el método equals no es sobreescrito lanzará que ambos objetos son diferentes debido a que se encuentran en diferentes lugares de la memoria
		if(libro1.equals(libro2)) {
			System.out.println("Es el mismo libro");
		}else {
			System.out.println("No es el mismo libro");
		}
		System.out.println("El lugar en la memoria de libro1 es " + libro1.hashCode());
		System.out.println("El lugar en la memoria de libro2 es " + libro2.hashCode());	
	}

}
