package Basura;

public class Main {
	
	int numero;
	
	public Main() {
		System.out.println("Contructor");
	}
	
	protected void finalize() {
		System.out.println("Final");
	}
	
	

}
