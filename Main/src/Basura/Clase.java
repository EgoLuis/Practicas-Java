package Basura;

public class Clase {
	
	public static void main(String[] args) {
		
		Object objeto = new Object();
		objeto = null;
		
		Main objeto2 = new Main();
		
		objeto2 = null;
		
		System.gc();
		
	}

}
