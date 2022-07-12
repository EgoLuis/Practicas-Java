package iEvolve;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		
		String booksInLibrary = "125,C Programming,Brian W. Kerighan|"
				+ "546,Java programming,James Gosling|"
				+ "897,Data Structure,Adam Drozdek|"
				+ "265,Data Structure,Adam Drozdek|"
				+ "234,The Java Language Specification,James Gosling";
		
		String borrowedUsers = "125,101|897,104|546,101";
		
		String query1 = "1,125";
		String query2 = "2,101";
		String query3 = "3,Data Structure";
		String query4 = "4,James Gosling";
		String query5 = "5,java";
		
		HashMapLibrary miLibreria = new HashMapLibrary();
		
		HashMap<Integer,HashMapLibrary> prueba1 = new HashMap<Integer,HashMapLibrary>();
		prueba1 = miLibreria.createLibraryMap(booksInLibrary);
		
		HashMap<Integer,Integer> prueba2 = new HashMap<Integer,Integer>();
		prueba2 = miLibreria.createUserMap(borrowedUsers);
		
		//System.out.println(prueba2);
		
		String resultado = miLibreria.getQuery(booksInLibrary, borrowedUsers, query5);
		System.out.println(resultado);

	}

}
