package Recursividad;

public class RecursividadIndirecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		metodoA('Z');

	}
	
	static void metodoA(char x) {
		if(x >= 'A') {
			metodoB(x);
			System.out.print(x);
		}
	}
	
	static void metodoB(char x) {
		metodoA(--x);
	}

}
