package ProgramacionFuncional;

import java.util.*;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> books = populateLibrary();
		
		
		//stream() devuelve un objeto de tipo Stream ( para grandes cantidades de datos se recomienda el uso de parallelStream() )
		//filter() aqui implementamos un metodo que devuelve los elementos cuyos autores empiezan con "D" y sus titulos empieza con "o"
		//forEach() aqui le estamos diciendo que imprima todos los elementos dentro del Stream
		books.stream()
			 .filter(book -> {
				 return book.getAuthor().startsWith("D");
			 })
			 .filter(book -> {
				 return book.getTitle().endsWith("o");
			 })
			 .forEach(System.out::println);
		
		
		

	}
	
	
	static ArrayList<Book> populateLibrary(){
		ArrayList<Book> books = new ArrayList();
		books.add(new Book("Robin Cook", "Critical"));
		books.add(new Book("Robin Cook", "Crisis"));
		books.add(new Book("Robin Cook", "ADN"));
		books.add(new Book("Ted Dekker", "Blink of an Eye"));
		books.add(new Book("Ted Dekker", "Sinner"));
		books.add(new Book("Ted Dekker", "Skin"));
		books.add(new Book("Dan Brown", "Angeles y Demonios"));
		books.add(new Book("Dan Brown", "Codigo da Vinci"));
		books.add(new Book("Dan Brown", "El simbolo perdido"));
		books.add(new Book("Dan Brown", "Inferno"));
		books.add(new Book("Stephen King", "La Cupula"));
		books.add(new Book("Stephen King", "Cell"));
		books.add(new Book("Stephen King", "It"));
		return books;
	}

}
