package Recursividad;

public class RecursividadDirecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		System.out.println(factorial(n));

	}
	
	public static long factorial(int n) {
		if (n <= 1) {
			return 1;
		}else {
			long resultado = n * factorial(n-1);
			return resultado;
		}
			
		
	}

}


