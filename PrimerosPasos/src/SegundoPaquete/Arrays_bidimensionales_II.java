package SegundoPaquete;

public class Arrays_bidimensionales_II {

	public static void main(String[] args) {
		
		double acumulado;
		double interes = 0.10;
		
		double[][] saldo = new double[5][6];
		
		for(int i=0; i<6; i++) {
			saldo[0][i]=10000;
			acumulado=10000;
			for(int j=1; j<5; j++) {
				acumulado = acumulado + (acumulado*interes);
				saldo[j][i] = acumulado;
			}
			interes = interes + 0.01;
		}
		
		for(double[] subsaldo:saldo) {
			for(double num:subsaldo) {
				System.out.printf("%1.2f", num);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
