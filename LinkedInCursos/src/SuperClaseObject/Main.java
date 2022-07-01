package SuperClaseObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal perro = new Animal ("Canis lupus", 4);
		Animal gato = new Animal("Fis silvestris", 4);
		Animal otroPerro = new Animal ("Canis lupus", 4);
		
		System.out.println("¿Es igual el objeto de gato que el de perro? " + perro.equals(gato));
		
		System.out.println("¿Es igual el objeto de otroPerro que el de perro? " + perro.equals(otroPerro));
		
		System.out.println("Hashcode para perro: " + perro.hashCode());
		System.out.println("Hashcode para gato: " + gato.hashCode());
		System.out.println("Hashcode para otroPerro: " + otroPerro.hashCode());
	
		System.out.println("Nuestro perro en forma de String: " + perro.toString());
		
		System.out.println(perro.getClass().getName());
	}

}
