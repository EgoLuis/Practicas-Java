package SegundoPaquete;

public class Uso_Arrays {

	public static void main(String[] args) {
		
		int[] mi_matriz = new int[5];
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = 15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;

		for(int i = 0; i < 5; i++ ) {
			System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
		}
		
		int[] mi_matrizDos = {5, 38, -15, 92, 71, 95, 43, -7, 12, 17, 65, 44, 102, -8};
		for(int i = 0; i < mi_matrizDos.length; i++ ) {
			System.out.println("Valor del indice " + i + " = " + mi_matrizDos[i]);
		}
		
	}

}
