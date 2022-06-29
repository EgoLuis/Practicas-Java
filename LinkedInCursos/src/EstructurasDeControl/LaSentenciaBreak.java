package EstructurasDeControl;

public class LaSentenciaBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		for (num = 2567; num <=3642; num++) {
			if((num % 2 == 0) && (num % 3 == 0) && (num % 5 == 0)) {
				break;
			}
		}
		
		int num2 = 2567;
		while(num2 <= 3642) {
			if((num2 % 2 == 0) && (num2 % 3 == 0) && (num2 % 5 == 0)) {
				break;
			}
			num2++;
		}
		
		if(num > 3642) {
			System.out.println("No hay ningún número entre 2567 y 3642 que sea múltiplo de 2, 3 y 5. Ruta For");
		} else {
			System.out.println("El primer múltiplo de 2, 3 y 5 entre 2567 y 3642 es " + num + ". Ruta For");
		}
		
		if(num2 > 3642) {
			System.out.println("No hay ningún número entre 2567 y 3642 que sea múltiplo de 2, 3 y 5. Ruta While");
		} else {
			System.out.println("El primer múltiplo de 2, 3 y 5 entre 2567 y 3642 es " + num2 + ". Ruta While");
		}
		
	}

}
