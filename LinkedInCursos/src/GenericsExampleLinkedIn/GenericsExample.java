package GenericsExampleLinkedIn;

import java.util.*;

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example without Generics
		List names = new ArrayList();
		names.add("Kelly");
		String name = (String)names.get(0);
		System.out.println("First name: " + name);
		
		//Example with Generics
		List<String> names2 = new ArrayList();
		names2.add("Kelly");
		String name2 = names2.get(0);
		System.out.println("First name: " + name);

	}

}
