package SegundoPaquete;

public class Uso_Arrays_Bidimensionales {

	public static void main(String[] args) {
		
		int[][] matriz = new int[4][5];
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<5; j++) {
				matriz[i][j] = (int)(Math.random()*100);
			}
		}
		
		for(int[] submatriz:matriz) {
			for(int elemento:submatriz) {
				System.out.println(elemento + " ");
			}
		}

	}

}
